package mikolajM.project.sportClub.repo;

import mikolajM.project.sportClub.model.Activity;

import java.util.Optional;

public interface ActivityRepo extends RepoTemplate<Activity>{
    Optional<Activity> findActivityByName(String name);
}
