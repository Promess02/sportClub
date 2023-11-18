package mikolajM.project.sportClub.sportclubui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import mikolajM.project.sportClub.controller.UserController;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;


public class ClubApplication extends Application{
    private ConfigurableApplicationContext applicationContext;
    @Override
    public void init() throws Exception {
        applicationContext = new SpringApplicationBuilder(ClubApplication.class).run();
    }

    @Override
    public void start(Stage stage) throws Exception {
        //applicationContext.publishEvent(new StageReadyEvent(stage));

        LoginManager loginManager = new LoginManager(applicationContext);
        loginManager.showLoginScreen();

        stage.setScene(loginManager.getScene());
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        applicationContext.close();
        Platform.exit();
    }

    static class StageReadyEvent extends ApplicationEvent {
        public StageReadyEvent(Stage stage) {
            super(stage);
        }

        public Stage getStage() {
            return ((Stage)getSource());
        }
    }
}
