package mikolajM.project.sportClub.sportclubui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mikolajM.project.sportClub.controller.UserController;
import mikolajM.project.sportClub.model.User;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import javafx.util.Callback;

import javax.inject.Inject;

/** Controls the login screen */

@Component
public class LoginController{
    @FXML private TextField user;
    @FXML private TextField password;
    @FXML private Button loginButton;
    public void initialize(final LoginManager loginManager) {
        loginButton.setOnAction(event -> {
            String sessionID = authorize();
            if (sessionID != null) {
                loginManager.authenticated(sessionID);
            }
        });
    }

    private UserController userController;

    public LoginController() {
    }
    @Autowired
    public LoginController(final UserController userController) {
        this.userController = userController;
    }

    /**
     * Check authorization credentials.
     *
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