package cz.uhk.dbs2.bamis.model;

import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(name ="VOZIDLO")
public class Vehicle {

  private String najetekm;
  private String nalozenost;
  private String spz;
  private String vozidlaid;


  public String getNajetekm() {
    return najetekm;
  }

  public void setNajetekm(String najetekm) {
    this.najetekm = najetekm;
  }


  public String getNalozenost() {
    return nalozenost;
  }

  public void setNalozenost(String nalozenost) {
    this.nalozenost = nalozenost;
  }


  public String getSpz() {
    return spz;
  }

  public void setSpz(String spz) {
    this.spz = spz;
  }


  public String getVozidlaid() {
    return vozidlaid;
  }

  public void setVozidlaid(String vozidlaid) {
    this.vozidlaid = vozidlaid;
  }

}
