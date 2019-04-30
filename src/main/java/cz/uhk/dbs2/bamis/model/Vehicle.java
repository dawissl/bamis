package cz.uhk.dbs2.bamis.model;

import javax.persistence.*;

@Entity
@Table(name ="VOZIDLO")
public class Vehicle implements java.io.Serializable {

  @Id
  @Column(name = "VOZIDLAID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VOZIDLA_VOZIDLAID")
  private int vozidlaid;
  @Column(name = "NAJETEKM")
  private String najetekm;
  @Column(name = "NALOZENOST")
  private String nalozenost;
  @Column(name = "SPZ")
  private String spz;

  public Vehicle(int vozidlaid, String najetekm, String nalozenost, String spz){
	  this.vozidlaid = vozidlaid;
	  this.najetekm = najetekm;
	  this.nalozenost = nalozenost;
	  this.spz = spz;
  }

  public Vehicle(){}

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


  public int getVozidlaid() {
    return vozidlaid;
  }

  public void setVozidlaid(int vozidlaid) {
    this.vozidlaid = vozidlaid;
  }

}
