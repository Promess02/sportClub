package mikolajM.project.sportClub.repo.SQL;

import mikolajM.project.sportClub.model.Membership;
import mikolajM.project.sportClub.repo.MembershipRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MembershipRepoSQL extends JpaRepository<Membership, Long>, MembershipRepo {
    @Override
    Optional<Membership> findMembershipByMemberIdAndMembershipStatusIsTrue(Integer memberId);

    @Override
    Optional<List<Membership>> findMembershipsByMemberId(Integer memberId);
}
