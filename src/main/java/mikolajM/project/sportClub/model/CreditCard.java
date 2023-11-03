package mikolajM.project.sportClub.model;


import jakarta.persistence.*;
import lombok.Getter;

import java.sql.Date;

@Entity
@Table
@Getter
public class CreditCard {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private long number;
  private long cvv;
  private Date expirationDate;
  private String bank;

  public CreditCard() {
  }

  public CreditCard(long id, long number, long cvv, Date expirationDate, String bank) {
    this.id = id;
    this.number = number;
    this.cvv = cvv;
    this.expirationDate = expirationDate;
    this.bank = bank;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setNumber(long number) {
    this.number = number;
  }

  public void setCvv(long cvv) {
    this.cvv = cvv;
  }

  public void setExpirationDate(Date expirationDate) {
    this.expirationDate = expirationDate;
  }

  public void setBank(String bank) {
    this.bank = bank;
  }
}
