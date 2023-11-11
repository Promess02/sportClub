package mikolajM.project.sportClub.service;

import mikolajM.project.sportClub.DTO.ServiceResponse;
import mikolajM.project.sportClub.model.User;
import org.springframework.http.ResponseEntity;

public interface RegistrationService {
    ServiceResponse<User> saveUser(User user);

    ServiceResponse<User> confirmEmail(String confirmationToken);


}
