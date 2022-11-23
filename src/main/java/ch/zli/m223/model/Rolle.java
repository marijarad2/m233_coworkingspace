package ch.zli.m223.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonIgnore;

/* 
 * @Marija Radovanovics
 * @version 23.11.2022
*/


@Entity
public class Rolle {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Schema(readOnly = true)
  private Long id;
  
  private String titel; 

  @OneToMany(mappedBy = "rolle")
  @JsonIgnore
  private List<Benutzer> benutzer; 

  
  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitel() {
    return this.titel;
  }

  public void setTitel(String titel) {
    this.titel = titel;
  }

  public List<Benutzer> getBenutzer() {
    return this.benutzer;
  }

  public void setBenutzer(List<Benutzer> benutzer) {
    this.benutzer = benutzer;
  }
}
