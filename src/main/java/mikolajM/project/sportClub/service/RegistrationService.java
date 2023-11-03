package mikolajM.project.sportClub.service;
import mikolajM.project.sportClub.model.User;

import java.util.List;
import java.util.Optional;
import mikolajM.project.sportClub.DTO.ServiceResponse;
import org.springframework.http.ResponseEntity;

public interface RegistrationService {
    ResponseEntity<?> saveUser(User user);

    ResponseEntity<?> confirmEmail(String confirmationToken);


}
