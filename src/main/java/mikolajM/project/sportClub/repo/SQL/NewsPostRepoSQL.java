package mikolajM.project.sportClub.repo.SQL;

import mikolajM.project.sportClub.model.NewsPost;
import mikolajM.project.sportClub.repo.NewsPostRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsPostRepoSQL extends JpaRepository<NewsPost, Long>, NewsPostRepo {
}
