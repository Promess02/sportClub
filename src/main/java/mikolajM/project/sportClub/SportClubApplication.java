package mikolajM.project.sportClub;

import javafx.application.Application;
import mikolajM.project.sportClub.sportclubui.ClubApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SportClubApplication {

	public static void main(String[] args) {
		Application.launch(ClubApplication.class, args);
	}

}

