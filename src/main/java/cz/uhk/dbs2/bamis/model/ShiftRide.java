package cz.uhk.dbs2.bamis.model;

import javax.persistence.*;

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


  public int getJizdaid() {
    return jizdaid;
  }

  public void setJizdaid(int jizdaid) {
    this.jizdaid = jizdaid;
  }


  public Vehicle getVozidlaid() {
    return vozidlaid;
  }

  public void setVozidlaid(Vehicle vozidlaid) {
    this.vozidlaid = vozidlaid;
  }


  public Employee getZamestnanecid() {
    return zamestnanecid;
  }

  public void setZamestnanecid(Employee zamestnanecid) {
    this.zamestnanecid = zamestnanecid;
  }


  public Status getStavid() {
    return stavid;
  }

  public void setStavid(Status stavid) {
    this.stavid = stavid;
  }

}
