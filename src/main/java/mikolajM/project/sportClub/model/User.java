package mikolajM.project.sportClub.model;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;
  private String surname;
  private String email;
  private String password;
  private String phoneNumber;
  private String profileImageUrl;
  @OneToOne(mappedBy = "creditCardId")
  private CreditCard creditCard;

  public User() {
  }

  public User(long id, String name, String surname, String email, String password, String phoneNumber) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.email = email;
    this.password = password;
    this.phoneNumber = phoneNumber;
  }

  public User(long id, String name, String surname, String email, String password, String phoneNumber, String profileImageUrl, CreditCard creditCard) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.email = email;
    this.password = password;
    this.phoneNumber = phoneNumber;
    this.profileImageUrl = profileImageUrl;
    this.creditCard = creditCard;
  }

  public void setId(long id) {
    this.id = id;
  }


  public void setName(String name) {
    this.name = name;
  }


  public void setSurname(String surname) {
    this.surname = surname;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public void setProfileImageUrl(String profileImageUrl) {
    this.profileImageUrl = profileImageUrl;
  }

  public void setCreditCard(CreditCard creditCard) {
    this.creditCard = creditCard;
  }
}
