package mikolajM.project.sportClub.repo.SQL;

import mikolajM.project.sportClub.repo.UserRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mikolajM.project.sportClub.model.User;

@Repository
public interface UserRepoSQL extends JpaRepository<User, Long>, UserRepo {
    @Override
    User findByUserEmailIgnoreCase(String emailId);
    @Override
    Boolean existsByUserEmail(String email);
}
