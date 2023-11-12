package mikolajM.project.sportClub.repo.SQL;

import mikolajM.project.sportClub.model.Activity;
import mikolajM.project.sportClub.repo.ActivityRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ActivityRepoSQL extends JpaRepository<Activity, Integer>, ActivityRepo {
    @Override
    Optional<Activity> findActivityByName(String name);
}
