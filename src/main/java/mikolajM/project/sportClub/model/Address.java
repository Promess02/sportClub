package mikolajM.project.sportClub.model;


import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table
@Getter
public class Address {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String city;
  private String street;
  private String houseNumber;
  private String postCode;

  public Address() {
  }

  public Address(long id, String city, String street, String houseNumber, String postCode) {
    this.id = id;
    this.city = city;
    this.street = street;
    this.houseNumber = houseNumber;
    this.postCode = postCode;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }
}
