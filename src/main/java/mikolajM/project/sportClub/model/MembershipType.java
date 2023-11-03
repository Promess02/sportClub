package mikolajM.project.sportClub.model;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table
public class MembershipType {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private long months;
  private double price;
  private String description;
  private String fullAccess;
  private double discount;

  public MembershipType() {
  }

  public MembershipType(long id, long months, double price, String description, String fullAccess, double discount) {
    this.id = id;
    this.months = months;
    this.price = price;
    this.description = description;
    this.fullAccess = fullAccess;
    this.discount = discount;
  }

  public void setId(long id) {
    this.id = id;
  }


  public void setMonths(long months) {
    this.months = months;
  }


  public void setPrice(double price) {
    this.price = price;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public void setFullAccess(String fullAccess) {
    this.fullAccess = fullAccess;
  }


  public void setDiscount(double discount) {
    this.discount = discount;
  }

}
