package mikolajM.project.sportClub.repo.SQL;

import mikolajM.project.sportClub.model.MembershipType;
import mikolajM.project.sportClub.model.User;
import mikolajM.project.sportClub.repo.MembershipTypeRepo;
import mikolajM.project.sportClub.repo.TeamRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembershipTypeRepoSQL extends JpaRepository<MembershipType, Long>, MembershipTypeRepo {
}
