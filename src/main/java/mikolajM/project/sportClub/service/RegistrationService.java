package mikolajM.project.sportClub.service;

import mikolajM.project.sportClub.model.User;
import org.springframework.http.ResponseEntity;

public interface RegistrationService {
    ResponseEntity<?> saveUser(User user);

    ResponseEntity<?> confirmEmail(String confirmationToken);


}
