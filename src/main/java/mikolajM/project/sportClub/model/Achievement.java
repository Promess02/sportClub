package mikolajM.project.sportClub.model;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table
public class Achievement {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private long place;
  private String description;
  private Date date;

  @ManyToOne
  @JoinColumn(name = "teamId")
  private Team team;

  public Achievement() {
  }

  public Achievement(long id, String name, long place, String description, Date date, Team team) {
    this.id = id;
    this.name = name;
    this.place = place;
    this.description = description;
    this.date = date;
    this.team = team;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPlace(long place) {
    this.place = place;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void setTeam(Team team) {
    this.team = team;
  }
}
