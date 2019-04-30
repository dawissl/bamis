package cz.uhk.dbs2.bamis.model;

import org.springframework.stereotype.Controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="LOKACE")
public class Location {

  @Id
  @Column(name = "LOKACEID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_LOKACE_LOKACEID")
  private int lokaceid;
	
  @Column(name = "ADRESA")
  private String adresa;
  @Column(name = "NAZEV")
  private String nazev;
  @OneToOne
  @JoinColumn(name = "REGIONID")
  private Region regionid;
  
  public Location(int lokaceid, String adresa, String nazev, Region regionid){
	  this.lokaceid = lokaceid;
	  this.adresa = adresa;
	  this.nazev = nazev;
	  this.regionid = regionid;
  }


  public String getAdresa() {
    return adresa;
  }

  public void setAdresa(String adresa) {
    this.adresa = adresa;
  }


  public String getNazev() {
    return nazev;
  }

  public void setNazev(String nazev) {
    this.nazev = nazev;
  }


  public String getLokaceid() {
    return lokaceid;
  }

  public void setLokaceid(String lokaceid) {
    this.lokaceid = lokaceid;
  }


  public String getRegionid() {
    return regionid;
  }

  public void setRegionid(String regionid) {
    this.regionid = regionid;
  }

}
