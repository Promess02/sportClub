package mikolajM.project.sportClub.repo.SQL;

import mikolajM.project.sportClub.model.Location;
import mikolajM.project.sportClub.model.User;
import mikolajM.project.sportClub.repo.LocationRepo;
import mikolajM.project.sportClub.repo.TeamRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepoSQL extends JpaRepository<Location, Long>, LocationRepo {
}
