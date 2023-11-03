package mikolajM.project.sportClub.repo.SQL;

import mikolajM.project.sportClub.model.Membership;
import mikolajM.project.sportClub.model.User;
import mikolajM.project.sportClub.repo.MembershipRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembershipRepoSQL extends JpaRepository<Membership, Long>, MembershipRepo {
}
