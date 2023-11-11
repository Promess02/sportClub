package mikolajM.project.sportClub.service.Impl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import mikolajM.project.sportClub.DTO.ServiceResponse;
import mikolajM.project.sportClub.model.ConfirmationToken;
import mikolajM.project.sportClub.model.User;
import mikolajM.project.sportClub.repo.SQL.ConfirmationTokenRepository;
import mikolajM.project.sportClub.repo.UserRepo;
import mikolajM.project.sportClub.service.EmailService;
import mikolajM.project.sportClub.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.mail.SimpleMailMessage;

import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {
    @Autowired
    private UserRepo userRepository;
    @Autowired
    private ConfirmationTokenRepository confirmationTokenRepository;
    @Autowired
    private EmailService emailService;

    @Override
    public ServiceResponse<User> saveUser(User user) {

        if (userRepository.existsByEmailIgnoreCase(user.getEmail())) {
            return new ServiceResponse<>(Optional.empty(), ServiceMessages.EMAIL_EXISTS);
            //return ResponseEntity.badRequest().body("Error: Email is already in use!");
        }

        userRepository.save(user);

        ConfirmationToken confirmationToken = new ConfirmationToken(user);

        confirmationTokenRepository.save(confirmationToken);

        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(user.getEmail());
        mailMessage.setSubject("Complete Registration!");
        mailMessage.setText("To confirm your account, please click here : "
                +"http://localhost:8080/user/confirm-account?token="+confirmationToken.getConfirmationToken());
        emailService.sendEmail(mailMessage);

        System.out.println("Confirmation Token: " + confirmationToken.getConfirmationToken());

        return new ServiceResponse<>(Optional.of(user), "Verify email by the link sent on your email address");
        //return ResponseEntity.ok("Verify email by the link sent on your email address");
    }

    @Override
    public ServiceResponse<User> confirmEmail(String confirmationToken) {
        ConfirmationToken token = confirmationTokenRepository.findByConfirmationToken(confirmationToken);

        if(token != null)
        {
            User user = userRepository.findByEmailIgnoreCase(token.getUser().getEmail());
            userRepository.save(user);
            return new ServiceResponse<>(Optional.of(user), "Email verified successfully!");
            //return ResponseEntity.ok("Email verified successfully!");
        }
        return new ServiceResponse<>(Optional.empty(), "Error: Couldn't verify email");
        //return ResponseEntity.badRequest().body("Error: Couldn't verify email");
    }
}
