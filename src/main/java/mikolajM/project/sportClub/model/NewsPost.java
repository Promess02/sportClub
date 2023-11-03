package mikolajM.project.sportClub.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.sql.Date;
@Entity
@Table
@Getter
public class NewsPost {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private Date dateOfPosting;
  private String content;
  private String imageUrl;

  @OneToOne(mappedBy = "locationId")
  private Location location;

  @OneToOne(mappedBy = "membershipTypeId")
  private MembershipType membershipType;

  @OneToOne(mappedBy = "activityId")
  private Activity activity;

  public NewsPost() {
  }

  public NewsPost(long id, String name, Date dateOfPosting, String content, String imageUrl, Location location, MembershipType membershipType, Activity activity) {
    this.id = id;
    this.name = name;
    this.dateOfPosting = dateOfPosting;
    this.content = content;
    this.imageUrl = imageUrl;
    this.location = location;
    this.membershipType = membershipType;
    this.activity = activity;
  }

  public void setId(long id) {
    this.id = id;
  }


  public void setName(String name) {
    this.name = name;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public void setDateOfPosting(Date dateOfPosting) {
    this.dateOfPosting = dateOfPosting;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public void setMembershipType(MembershipType membershipType) {
    this.membershipType = membershipType;
  }

  public void setActivity(Activity activity) {
    this.activity = activity;
  }
}
