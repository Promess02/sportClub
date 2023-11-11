package mikolajM.project.sportClub.repo.SQL;

import mikolajM.project.sportClub.model.User;
import mikolajM.project.sportClub.repo.UserRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepoSQL extends JpaRepository<User, Long>, UserRepo {
    @Override
    User findByEmailIgnoreCase(String emailId);
    @Override
    Boolean existsByEmailIgnoreCase(String email);
}
