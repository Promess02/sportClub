package mikolajM.project.sportClub.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import java.sql.Time;
import java.util.List;

@Getter
@Table
@Entity
public class Location {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private long maxCapacity;
  private long currentCapacity;
  private Time weekDayOpenTime;
  private Time weekDayCloseTime;
  private Time weekendOpenTime;
  private Time weekendCloseTime;
  @OneToOne(mappedBy = "addressId")
  private Address address;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "location")
  @JsonBackReference
  private List<Activity> activityList;

  public Location() {
  }

  public Location(long id, String name, long maxCapacity, long currentCapacity, Time weekDayOpenTime, Time weekDayCloseTime,
                  Time weekendOpenTime, Time weekendCloseTime, Address address, List<Activity> activityList) {
    this.id = id;
    this.name = name;
    this.maxCapacity = maxCapacity;
    this.currentCapacity = currentCapacity;
    this.weekDayOpenTime = weekDayOpenTime;
    this.weekDayCloseTime = weekDayCloseTime;
    this.weekendOpenTime = weekendOpenTime;
    this.weekendCloseTime = weekendCloseTime;
    this.address = address;
    this.activityList = activityList;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setMaxCapacity(long maxCapacity) {
    this.maxCapacity = maxCapacity;
  }

  public void setCurrentCapacity(long currentCapacity) {
    this.currentCapacity = currentCapacity;
  }

  public void setWeekDayOpenTime(Time weekDayOpenTime) {
    this.weekDayOpenTime = weekDayOpenTime;
  }

  public void setWeekDayCloseTime(Time weekDayCloseTime) {
    this.weekDayCloseTime = weekDayCloseTime;
  }

  public void setWeekendOpenTime(Time weekendOpenTime) {
    this.weekendOpenTime = weekendOpenTime;
  }

  public void setWeekendCloseTime(Time weekendCloseTime) {
    this.weekendCloseTime = weekendCloseTime;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public void setActivityList(List<Activity> activityList) {
    this.activityList = activityList;
  }
}
