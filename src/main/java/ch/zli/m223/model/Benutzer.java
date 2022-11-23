package ch.zli.m223.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonIgnore;

/* 
 * @Marija Radovanovic
 * @version 23.11.2022
*/

@Entity
@Table(name = "benutzer")
public class Benutzer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Schema(readOnly = true)
  private Long id;
  private String nachname;
  private String vorname;
  private String email;
  private String password;

  @ManyToOne(fetch = FetchType.LAZY)
  @JsonIgnore
  private Rolle rolle;

  @OneToMany
  @JsonIgnore
  private List<Buchung> buchung;
 

  //ManyToOne KEINE LISTE
  @ManyToOne
  @JsonIgnore
    private Cafeteria cafeteria; 

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNachname() {
    return this.nachname;
  }

  public void setNachname(String nachname) {
    this.nachname = nachname;
  }

  public String getVorname() {
    return this.vorname;
  }

  public void setVorname(String vorname) {
    this.vorname = vorname;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Rolle getRolle() {
    return this.rolle;
  }

  public void setRolle(Rolle rolle) {
    this.rolle = rolle;
  }

  public List<Buchung> getBuchung() {
    return this.buchung;
  }

  public void setBuchung(List<Buchung> buchung) {
 this.buchung = buchung;
  }

  public Cafeteria getCafeteria() {
    return this.cafeteria;
  }

  public void setCafeteria(Cafeteria cafeteria) {
    this.cafeteria = cafeteria;
  }

 
}
