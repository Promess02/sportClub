package mikolajM.project.sportClub.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.sql.*;

@Entity
@Table
@Getter
public class Calendar {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long entryId;
  private String name;
  private Date date;
  private Time time;
  private long minutes;
  private String description;

  @ManyToOne
  @JoinColumn(name = "memberId")
  private Member member;

  @ManyToOne
  @JoinColumn(name = "trainerId")
  private Trainer trainer;

  @OneToOne(mappedBy = "activityId")
  private Activity activity;

  public Calendar() {
  }

  public Calendar(long entryId, String name, Date date, Time time,
                  long minutes, String description, Member member,
                  Trainer trainer, Activity activity) {
    this.entryId = entryId;
    this.name = name;
    this.date = date;
    this.time = time;
    this.minutes = minutes;
    this.description = description;
    this.member = member;
    this.trainer = trainer;
    this.activity = activity;
  }

  public void setEntryId(long entryId) {
    this.entryId = entryId;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void setTime(Time time) {
    this.time = time;
  }

  public void setMinutes(long minutes) {
    this.minutes = minutes;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setMember(Member member) {
    this.member = member;
  }

  public void setTrainer(Trainer trainer) {
    this.trainer = trainer;
  }

  public void setActivity(Activity activity) {
    this.activity = activity;
  }
}
