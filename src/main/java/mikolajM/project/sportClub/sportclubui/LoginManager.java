package mikolajM.project.sportClub.sportclubui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import lombok.Getter;
import mikolajM.project.sportClub.controller.UserController;
import org.apache.catalina.User;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.logging.Level;
import java.util.logging.Logger;

/** Manages control flow for logins */


public class LoginManager {
    @Getter
    private Scene scene;
    private ConfigurableApplicationContext context;

    public LoginManager(ConfigurableApplicationContext context) {
        this.context = context;
        scene = new Scene(new StackPane());
    }

    /**
     * Callback method invoked to notify that a user has been authenticated.
     * Will show the main application screen.
     */
    public void authenticated(String sessionID) {
        showMainView(sessionID);
    }

    /**
     * Callback method invoked to notify that a user has logged out of the main application.
     * Will show the login application screen.
     */
    public void logout() {
        showLoginScreen();
    }

    public void showLoginScreen() {
       try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/login.fxml"));
//           loader.setController(new LoginController(context.getBean(UserController.class)));
//           scene.setRoot(loader.load());
           loader.setControllerFactory(context::getBean);
           scene.setRoot(loader.load());
//            LoginController controller = loader.getController();
//            controller.initialize(this);
       } catch (IOException ex) {
           Logger.getLogger(LoginManager.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

    private void showMainView(String sessionID) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/mainview.fxml")
            );
            scene.setRoot(loader.load());
            MainViewController controller =
                    loader.getController();
            controller.initSessionID(this, sessionID);
        } catch (IOException ex) {
            Logger.getLogger(LoginManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}