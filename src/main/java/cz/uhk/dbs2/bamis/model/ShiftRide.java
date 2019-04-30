package cz.uhk.dbs2.bamis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="JIZDA")
public class ShiftRide {

  @Id
  @Column(name= "SHIFTRIDE")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_JIZDA_JIZDAID")
  private int jizdaid;
  
  @OneToOne
  @JoinColumn(name = "VOZIDLAID")
  private Vehicle vozidlaid;
  @OneToOne
  @JoinColumn(name = "ZAMESTNANECID")
  private Employee zamestnanecid;
  @OneToOne
  @JoinColumn(name = "STAVID")
  private Status stavid;
  
  public ShiftRide(int jizdaid, Vehicle vozidlaid, Employee zamestnanecid, Status stavid){
	  this.jizdaid = jizdaid;
	  this.vozidlaid = vozidlaid;
	  this.zamestnanecid = zamestnanecid;
	  this.stavid = stavid;
  }


  public String getJizdaid() {
    return jizdaid;
  }

  public void setJizdaid(String jizdaid) {
    this.jizdaid = jizdaid;
  }


  public String getVozidlaid() {
    return vozidlaid;
  }

  public void setVozidlaid(String vozidlaid) {
    this.vozidlaid = vozidlaid;
  }


  public String getZamestnanecid() {
    return zamestnanecid;
  }

  public void setZamestnanecid(String zamestnanecid) {
    this.zamestnanecid = zamestnanecid;
  }


  public String getStavid() {
    return stavid;
  }

  public void setStavid(String stavid) {
    this.stavid = stavid;
  }

}
