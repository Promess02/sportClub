package mikolajM.project.sportClub.repo;

import mikolajM.project.sportClub.model.User;

public interface UserRepo extends RepoTemplate<User>{
    Boolean existsByEmailIgnoreCase(String email);
    User findByEmailIgnoreCase(String emailId);
}
