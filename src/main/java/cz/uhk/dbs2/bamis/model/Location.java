package cz.uhk.dbs2.bamis.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="LOKACE")
public class Location {

  private String adresa;
  private String nazev;
  private String lokaceid;
  private String regionid;


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
