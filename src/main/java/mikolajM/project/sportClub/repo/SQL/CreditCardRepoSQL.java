package mikolajM.project.sportClub.repo.SQL;

import mikolajM.project.sportClub.model.CreditCard;
import mikolajM.project.sportClub.repo.CreditCardRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepoSQL extends JpaRepository<CreditCard, Long>, CreditCardRepo {
}
