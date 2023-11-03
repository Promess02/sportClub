package mikolajM.project.sportClub.repo.SQL;

import mikolajM.project.sportClub.model.Team;
import mikolajM.project.sportClub.model.User;
import mikolajM.project.sportClub.repo.TeamRepo;
import mikolajM.project.sportClub.repo.UserRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepoSQL extends JpaRepository<Team, Long>, TeamRepo {
}
