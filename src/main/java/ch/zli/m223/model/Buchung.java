package ch.zli.m223.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonIgnore;

/* 
 * @Marija Radovanovics
 * @version 23.11.2022
*/

@Entity
public class Buchung {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Schema(readOnly = true)
  private Long id;

  private Boolean status;
  private Boolean halfday;
  private Boolean stornierung;
  private Date date;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Boolean isStatus() {
    return this.status;
  }

  public Boolean getStatus() {
    return this.status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public Boolean isHalfday() {
    return this.halfday;
  }

  public Boolean getHalfday() {
    return this.halfday;
  }

  public void setHalfday(Boolean halfday) {
    this.halfday = halfday;
  }

  public Boolean isStornierung() {
    return this.stornierung;
  }

  public Boolean getStornierung() {
    return this.stornierung;
  }

  public void setStornierung(Boolean stornierung) {
    this.stornierung = stornierung;
  }

  public Date getDate() {
    return this.date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Raum getRaum() {
    return this.raum;
  }

  public void setRaum(Raum raum) {
    this.raum = raum;
  }

  public Benutzer getBenutzer() {
    return this.benutzer;
  }

  public void setBenutzer(Benutzer benutzer) {
    this.benutzer = benutzer;
  }
  

  @ManyToOne
  private Raum raum;

  @ManyToOne
  @JsonIgnore
  private Benutzer benutzer;



}
