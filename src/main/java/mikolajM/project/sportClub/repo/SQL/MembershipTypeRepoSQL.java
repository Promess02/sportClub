package mikolajM.project.sportClub.repo.SQL;

import mikolajM.project.sportClub.model.MembershipType;
import mikolajM.project.sportClub.repo.MembershipTypeRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MembershipTypeRepoSQL extends JpaRepository<MembershipType, Long>, MembershipTypeRepo {
    @Override
    Optional<MembershipType> findMembershipTypeByDescription(String description);

}
