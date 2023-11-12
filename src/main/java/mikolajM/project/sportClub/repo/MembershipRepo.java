package mikolajM.project.sportClub.repo;

import mikolajM.project.sportClub.model.Membership;

import java.util.List;
import java.util.Optional;

public interface MembershipRepo extends RepoTemplate<Membership>{
    Optional<Membership> findMembershipByMemberIdAndMembershipStatusIsTrue(Integer memberId);
    Optional<List<Membership>> findMembershipsByMemberId(Integer memberId);
}
