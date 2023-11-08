package mikolajM.project.sportClub.repo.SQL;

import mikolajM.project.sportClub.model.Trainer;
import mikolajM.project.sportClub.repo.TrainerRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepoSQL extends JpaRepository<Trainer, Long>, TrainerRepo {
}
