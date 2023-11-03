package mikolajM.project.sportClub.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import mikolajM.project.sportClub.enums.Sport;

import java.util.List;

@Getter
@Entity
@Table
public class Trainer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long trainerId;
  @Enumerated(EnumType.STRING)
  private Sport specialization;
  private long grade;

  @ManyToOne
  @JoinColumn(name = "TeamId")
  private Team team;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "trainer")
  @JsonBackReference
  private List<Activity> activityList;

  @OneToOne(mappedBy = "userId")
  private User user;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "trainer")
  @JsonBackReference
  private List<Calendar> calendar;

  public Trainer() {
  }

  public Trainer(long trainerId, Sport specialization, long grade, Team team,
                 List<Activity> activityList, User user, List<Calendar> calendar) {
    this.trainerId = trainerId;
    this.specialization = specialization;
    this.grade = grade;
    this.team = team;
    this.activityList = activityList;
    this.user = user;
    this.calendar = calendar;
  }

  public void setTrainerId(long trainerId) {
    this.trainerId = trainerId;
  }


  public void setSpecialization(Sport specialization) {
    this.specialization = specialization;
  }


  public void setGrade(long grade) {
    this.grade = grade;
  }


  public void setTeam(Team team) {
    this.team = team;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public void setActivityList(List<Activity> activityList) {
    this.activityList = activityList;
  }

  public void setCalendar(List<Calendar> calendar) {
    this.calendar = calendar;
  }
}
