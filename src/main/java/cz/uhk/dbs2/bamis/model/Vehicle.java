package cz.uhk.dbs2.bamis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="VOZIDLO")
public class Vehicle {
  
  @Id
  @Column(name = "VOZIDLAID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VOZIDLA_VOZIDLAID")
  private int vozidlaid;
  @Column(name = "NAJETEKM")
  private String najetekm;
  @Column(name = "NALOZENOST")
  private String nalozenost;
  @Colum(name = "SPZ")
  private String spz;
  
  public Vehicle(int vozidlaid, String najetekm, String nalozenost, String spz){
	  this.vozidlaid = vozidlaid;
	  this.najetekm = najetekm;
	  this.nalozenost = nalozenost;
	  this.spz = spz;
  }


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
