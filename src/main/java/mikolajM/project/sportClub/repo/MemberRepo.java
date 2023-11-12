package mikolajM.project.sportClub.repo;

import mikolajM.project.sportClub.model.Member;

import java.util.Optional;

public interface MemberRepo extends RepoTemplate<Member>{
    Optional<Member> findMemberByUserId(Integer userId);
}
