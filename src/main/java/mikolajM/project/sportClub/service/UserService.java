package mikolajM.project.sportClub.service;

import mikolajM.project.sportClub.DTO.ServiceResponse;
import mikolajM.project.sportClub.model.CreditCard;
import mikolajM.project.sportClub.model.User;

public interface UserService {
        ServiceResponse<User> checkIfExists(User user);
        ServiceResponse<User> changePassword(String email, String oldPassword, String newPassword);
        ServiceResponse<User> changePhoneNumber(String email, String phoneNumber);
        ServiceResponse<User> addCreditCard(String email, CreditCard creditCard);
        ServiceResponse<User> addProfileImage(String email, String ImageUrl);

}
