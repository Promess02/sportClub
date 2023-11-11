package mikolajM.project.sportClub.service.Impl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import mikolajM.project.sportClub.DTO.ServiceResponse;
import mikolajM.project.sportClub.model.CreditCard;
import mikolajM.project.sportClub.model.User;
import mikolajM.project.sportClub.repo.CreditCardRepo;
import mikolajM.project.sportClub.repo.UserRepo;
import mikolajM.project.sportClub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private CreditCardRepo creditCardRepo;

    @Override
    public ServiceResponse<User> checkIfExists(User user) {
        if(user.getEmail()==null)
            return new ServiceResponse<>(Optional.empty(),ServiceMessages.EMAIL_NOT_GIVEN);
        if(!userRepo.existsByEmailIgnoreCase(user.getEmail()))
            return new ServiceResponse<>(Optional.empty(), ServiceMessages.EMAIL_NOT_FOUND);
        User dbUser = userRepo.findByEmailIgnoreCase(user.getEmail());
        if(!dbUser.getPassword().equals(user.getPassword()))
            return new ServiceResponse<>(Optional.empty(), ServiceMessages.BAD_PASSWORD);
        return new ServiceResponse<>(Optional.of(dbUser), ServiceMessages.ACCOUNT_EXISTS);
    }

    @Override
    public ServiceResponse<User> changePassword(String email, String oldPassword, String newPassword) {
        if(!userRepo.existsByEmailIgnoreCase(email)) return new ServiceResponse<>(Optional.empty(),ServiceMessages.EMAIL_NOT_FOUND);
        User dbUser = userRepo.findByEmailIgnoreCase(email);
        if(!dbUser.getPassword().equals(oldPassword)) return new ServiceResponse<>(Optional.empty(),ServiceMessages.BAD_PASSWORD);
        dbUser.setPassword(newPassword);
        userRepo.save(dbUser);
        return new ServiceResponse<>(Optional.of(dbUser),ServiceMessages.ACCOUNT_UPDATED);
    }

    @Override
    public ServiceResponse<User> changePhoneNumber(String email, String phoneNumber) {
        if(!userRepo.existsByEmailIgnoreCase(email)) return new ServiceResponse<>(Optional.empty(),ServiceMessages.EMAIL_NOT_FOUND);
        User dbUser = userRepo.findByEmailIgnoreCase(email);
        dbUser.setPhoneNumber(phoneNumber);
        userRepo.save(dbUser);
        return new ServiceResponse<>(Optional.of(dbUser),ServiceMessages.ACCOUNT_UPDATED);
    }

    @Override
    public ServiceResponse<User> addCreditCard(String email, CreditCard creditCard) {
        if(!userRepo.existsByEmailIgnoreCase(email)) return new ServiceResponse<>(Optional.empty(),ServiceMessages.EMAIL_NOT_FOUND);
        User dbUser = userRepo.findByEmailIgnoreCase(email);
        if(creditCardRepo.existsCreditCardByNumber(creditCard.getNumber())) return new ServiceResponse<>(Optional.empty(),
                "Credit card with that number already exists in the database");
        creditCardRepo.save(creditCard);
        dbUser.setCreditCard(creditCard);
        userRepo.save(dbUser);
        return new ServiceResponse<>(Optional.of(dbUser), ServiceMessages.ACCOUNT_UPDATED);
    }

    @Override
    public ServiceResponse<User> addProfileImage(String email, String imageUrl) {
        if(!userRepo.existsByEmailIgnoreCase(email)) return new ServiceResponse<>(Optional.empty(),ServiceMessages.EMAIL_NOT_FOUND);
        User dbUser = userRepo.findByEmailIgnoreCase(email);
        dbUser.setProfileImageUrl(imageUrl);
        userRepo.save(dbUser);
        return new ServiceResponse<>(Optional.of(dbUser),ServiceMessages.ACCOUNT_UPDATED);
    }


}
