package mikolajM.project.sportClub.sportclubui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import mikolajM.project.sportClub.controller.UserController;
import mikolajM.project.sportClub.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/** Controls the login screen */

@Component
public class LoginController{
    @FXML private TextField user;
    @FXML private TextField password;
    @FXML private Button loginButton;
    private final UserController userController;
    public void initialize() {
        loginButton.setOnAction(event -> {
            String sessionID = authorize();
            if (sessionID != null) {
                authorize();
            }
        });
    }
    @Autowired
    public LoginController(final UserController userController) {
        this.userController = userController;
    }

    /**
     * Check authorization credentials.
     * <p>
     * If accepted, return a sessionID for the authorized session
     * otherwise, return null.
     */
    private String authorize() {
        return userController.loginUser(new User(user.getText(), password.getText())).getStatusCode().isSameCodeAs(HttpStatus.OK)
                        ? generateSessionID()
                        : null;
    }
    private static int sessionID = 0;

    private String generateSessionID() {
        sessionID++;
        return "xyzzy - session " + sessionID;
    }
}