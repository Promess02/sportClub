package mikolajM.project.sportClub.model;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table
public class SocialMedia {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String url;
  private String iconUrl;

  @OneToOne(mappedBy = "LocationId")
  private Location location;

  public SocialMedia() {
  }
  public SocialMedia(long id, String name, String url, String iconUrl, Location location) {
    this.id = id;
    this.name = name;
    this.url = url;
    this.iconUrl = iconUrl;
    this.location = location;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  public void setLocation(Location location) {
    this.location = location;
  }
}
