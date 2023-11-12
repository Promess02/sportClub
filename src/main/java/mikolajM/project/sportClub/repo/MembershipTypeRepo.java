package mikolajM.project.sportClub.repo;

import mikolajM.project.sportClub.model.MembershipType;

import java.util.Optional;

public interface MembershipTypeRepo extends RepoTemplate<MembershipType>{
    Optional<MembershipType> findMembershipTypeByDescription(String description);
}
