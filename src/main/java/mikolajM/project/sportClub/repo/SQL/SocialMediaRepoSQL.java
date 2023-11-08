package mikolajM.project.sportClub.repo.SQL;

import mikolajM.project.sportClub.model.SocialMedia;
import mikolajM.project.sportClub.repo.SocialMediaRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialMediaRepoSQL extends JpaRepository<SocialMedia, Long>, SocialMediaRepo {
}
