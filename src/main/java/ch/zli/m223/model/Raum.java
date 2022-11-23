package ch.zli.m223.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;

/* 
 * @Marija Radovanovics
 * @version 23.11.2022
*/

@Entity
public class Raum {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Schema(readOnly = true)
  private Long id;

  private String name; 
  private boolean ReservierungStatus; 

  @ManyToOne
  @JsonIgnore
  private Buchung buchung; 

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isReservierungStatus() {
    return this.ReservierungStatus;
  }

  public boolean getReservierungStatus() {
    return this.ReservierungStatus;
  }

  public void setReservierungStatus(boolean ReservierungStatus) {
    this.ReservierungStatus = ReservierungStatus;
  }

  public Buchung getBuchung() {
    return this.buchung;
  }

  public void setBuchung(Buchung buchung) {
    this.buchung = buchung;
  }


}
