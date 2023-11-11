package mikolajM.project.sportClub.repo.SQL;

import mikolajM.project.sportClub.model.ConfirmationToken;
import mikolajM.project.sportClub.repo.ConfirmationTokenRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfirmationTokenRepository extends JpaRepository<ConfirmationToken, Long>, ConfirmationTokenRepo {
    ConfirmationToken findByConfirmationToken(String confirmationToken);
}