package mikolajM.project.sportClub.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import mikolajM.project.sportClub.enums.MembershipStatus;

import java.util.List;

@Entity
@Table
@Getter
public class Member {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long memberId;
  @Enumerated(EnumType.STRING)
  private MembershipStatus membershipStatus;

  @ManyToOne
  @JoinColumn(name = "teamId")
  private Team team;

  @OneToOne(mappedBy = "userId")
  private User user;

  @JsonBackReference
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "member")
  private List<Calendar> calendar;

  public Member() {
  }

  public Member(long memberId, MembershipStatus membershipStatus, Team team, User user) {
    this.memberId = memberId;
    this.membershipStatus = membershipStatus;
    this.team = team;
    this.user = user;
  }

  public void setMemberId(long memberId) {
    this.memberId = memberId;
  }

  public void setMembershipStatus(MembershipStatus membershipStatus) {
    this.membershipStatus = membershipStatus;
  }

  public void setTeam(Team team) {
    this.team = team;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public void setCalendar(List<Calendar> calendar) {
    this.calendar = calendar;
  }
}
