package mikolajM.project.sportClub.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import mikolajM.project.sportClub.enums.Sport;

import java.util.List;

@Getter
@Entity
@Table
public class Team {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private long maxMembers;
  private String logoIconUrl;
  @Enumerated(EnumType.STRING)
  private Sport sport;

  @JsonBackReference
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "team")
  private List<Trainer> trainers;

  @OneToMany(cascade = CascadeType.DETACH, mappedBy = "team")
  @JsonBackReference
  private List<Member> members;

  @OneToMany(cascade = CascadeType.DETACH, mappedBy = "team")
  @JsonBackReference
  private List<Achievement> achievements;

  public Team() {
  }

  public Team(long id, String name, long maxMembers, String logoIconUrl, Sport sport,
              List<Trainer> trainers, List<Member> members, List<Achievement> achievements) {
    this.id = id;
    this.name = name;
    this.maxMembers = maxMembers;
    this.logoIconUrl = logoIconUrl;
    this.sport = sport;
    this.trainers = trainers;
    this.members = members;
    this.achievements = achievements;
  }

  public void setId(long id) {
    this.id = id;
  }


  public void setName(String name) {
    this.name = name;
  }


  public void setMaxMembers(long maxMembers) {
    this.maxMembers = maxMembers;
  }


  public void setLogoIconUrl(String logoIconUrl) {
    this.logoIconUrl = logoIconUrl;
  }


  public void setSport(Sport sport) {
    this.sport = sport;
  }

  public void setTrainers(List<Trainer> trainers) {
    this.trainers = trainers;
  }

  public void setMembers(List<Member> members) {
    this.members = members;
  }

  public void setAchievements(List<Achievement> achievements) {
    this.achievements = achievements;
  }
}
