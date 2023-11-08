package mikolajM.project.sportClub.controller;

import lombok.RequiredArgsConstructor;
import mikolajM.project.sportClub.model.User;
import mikolajM.project.sportClub.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final RegistrationService userService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @RequestMapping(value="/confirm-account", method= {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<?> confirmUserAccount(@RequestParam("token")String confirmationToken) {
        return userService.confirmEmail(confirmationToken);
    }

}
