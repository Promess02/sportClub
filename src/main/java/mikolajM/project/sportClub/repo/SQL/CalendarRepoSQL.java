package mikolajM.project.sportClub.repo.SQL;

import mikolajM.project.sportClub.model.Calendar;
import mikolajM.project.sportClub.repo.CalendarRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarRepoSQL extends JpaRepository<Calendar, Long>, CalendarRepo {
}
