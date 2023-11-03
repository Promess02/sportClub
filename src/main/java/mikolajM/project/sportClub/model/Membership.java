package mikolajM.project.sportClub.model;


import jakarta.persistence.*;
import lombok.Getter;

import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table
@Getter
public class Membership {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private Date startDate;
  private Date endDate;
  @ManyToOne
  @JoinColumn(name = "memberId")
  private Member member;
  @OneToOne(mappedBy = "membershipTypeId")
  private MembershipType membershipType;

  @OneToOne(mappedBy = "activityId")
  private Activity activity;

  public Membership() {
  }

  public Membership(long id, Date startDate, Date endDate, Member member, MembershipType membershipType, Activity activity) {
    this.id = id;
    this.startDate = startDate;
    this.endDate = endDate;
    this.member = member;
    this.membershipType = membershipType;
    this.activity = activity;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public void setMember(Member member) {
    this.member = member;
  }

  public void setMembershipType(MembershipType membershipType) {
    this.membershipType = membershipType;
  }

  public void setActivity(Activity activity) {
    this.activity = activity;
  }
}
