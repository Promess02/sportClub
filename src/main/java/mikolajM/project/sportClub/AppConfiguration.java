package mikolajM.project.sportClub;

import mikolajM.project.sportClub.controller.UserController;
import mikolajM.project.sportClub.model.User;
import mikolajM.project.sportClub.service.Impl.RegistrationServiceImpl;
import mikolajM.project.sportClub.service.Impl.UserServiceImpl;
import mikolajM.project.sportClub.service.RegistrationService;
import mikolajM.project.sportClub.service.UserService;
import mikolajM.project.sportClub.sportclubui.LoginController;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "mikolajM.project.sportClub")
public class AppConfiguration {
    @Bean
    @Scope("prototype")
    public LoginController loginController(UserController userController) {
        return new LoginController(userController);
    }

    @Bean
    public UserController userController(UserService userService,
                                         RegistrationService registrationService) {
        return new UserController(registrationService, userService);
    }

    @Bean
    @ConditionalOnMissingBean
    public UserService userService(){
        return new UserServiceImpl();
    }
    @Bean
    @ConditionalOnMissingBean
    public RegistrationService registrationService(){
        return new RegistrationServiceImpl();
    }

}
