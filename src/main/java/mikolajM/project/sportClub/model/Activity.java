package mikolajM.project.sportClub.model;


import jakarta.persistence.*;
import lombok.Getter;
import mikolajM.project.sportClub.enums.Sport;

import java.sql.*;

@Entity
@Table
@Getter
public class Activity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private Date date;
  private Time time;
  private long minutes;
  private String description;
  @Enumerated(EnumType.STRING)
  private Sport sport;
  private long currentMembers;
  private long memberLimit;

 @ManyToOne
 @JoinColumn(name = "LocationId")
  private Location location;

  @ManyToOne
  @JoinColumn(name = "trainerId")
  private Trainer trainer;

  @OneToOne(mappedBy = "teamId")
  private Team teamId;

  public Activity() {
  }

  public Activity(long id, String name, Date date, Time time, long minutes, String description,
                  Sport sport, long currentMembers, long memberLimit, Location location,
                  Trainer trainer, Team teamId) {
    this.id = id;
    this.name = name;
    this.date = date;
    this.time = time;
    this.minutes = minutes;
    this.description = description;
    this.sport = sport;
    this.currentMembers = currentMembers;
    this.memberLimit = memberLimit;
    this.location = location;
    this.trainer = trainer;
    this.teamId = teamId;
  }

  public void setId(long id) {
    this.id = id;
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

  public void setSport(Sport sport) {
    this.sport = sport;
  }

  public void setCurrentMembers(long currentMembers) {
    this.currentMembers = currentMembers;
  }

  public void setMemberLimit(long memberLimit) {
    this.memberLimit = memberLimit;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public void setTrainer(Trainer trainer) {
    this.trainer = trainer;
  }

  public void setTeamId(Team teamId) {
    this.teamId = teamId;
  }
}
