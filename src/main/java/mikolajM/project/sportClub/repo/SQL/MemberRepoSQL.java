package mikolajM.project.sportClub.repo.SQL;

import mikolajM.project.sportClub.model.Member;
import mikolajM.project.sportClub.repo.MemberRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepoSQL extends JpaRepository<Member, Long>, MemberRepo {
}
