package mikolajM.project.sportClub.repo;

import mikolajM.project.sportClub.model.User;

public interface UserRepo extends RepoTemplate<User>{
    Boolean existsByEmail(String email);
    User findByEmailIgnoreCase(String emailId);
}
