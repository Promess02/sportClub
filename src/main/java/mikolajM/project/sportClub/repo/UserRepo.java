package mikolajM.project.sportClub.repo;

import mikolajM.project.sportClub.model.User;

public interface UserRepo extends RepoTemplate<User>{
    Boolean existsByUserEmail(String email);
    User findByUserEmailIgnoreCase(String emailId);
}
