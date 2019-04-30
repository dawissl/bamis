package cz.uhk.dbs2.bamis.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name ="STAV")
public class Status {

  @Id
  @Column(name="STAVID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_STAV_STAVID")
  private int stavid;
  @Column(name = "DATUM")
  private Date datum;

  @OneToOne
  @JoinColumn(name = "LOKACEID")
  private Location lokaceid;
  @OneToOne
  @JoinColumn(name = "ZAMESTNANECID")
  private Employee zamestnanecid;
  @OneToOne
  @JoinColumn(name = "ZASILKAID")
  private Good zasilkaid;
  @OneToOne
  @JoinColumn(name = "KATEGORIESTAVU")
  private StateCategory kategoriestavu;
  @OneToOne
  @JoinColumn(name = "JIZDAID")
  private ShiftRide jizdaid;

  public Status(int stavid, Date datum, Location lokaceid, Employee zamestnanecid, Good zasilkaid, StateCategory kategoriestavu, ShiftRide jizdaid){
	  this.stavid = stavid;
	  this.datum = datum;
	  this.lokaceid = lokaceid;
	  this.zamestnanecid = zamestnanecid;
	  this.zasilkaid = zasilkaid;
	  this.kategoriestavu = kategoriestavu;
	  this.jizdaid = jizdaid;
  }


  public java.sql.Date getDatum() {
    return datum;
  }

  public void setDatum(java.sql.Date datum) {
    this.datum = datum;
  }


  public Location getLokaceid() {
    return lokaceid;
  }

  public void setLokaceid(Location lokaceid) {
    this.lokaceid = lokaceid;
  }


  public int getStavid() {
    return stavid;
  }

  public void setStavid(int stavid) {
    this.stavid = stavid;
  }


  public Employee getZamestnanecid() {
    return zamestnanecid;
  }

  public void setZamestnanecid(Employee zamestnanecid) {
    this.zamestnanecid = zamestnanecid;
  }


  public Good getZasilkaid() {
    return zasilkaid;
  }

  public void setZasilkaid(Good zasilkaid) {
    this.zasilkaid = zasilkaid;
  }


  public StateCategory getKategoriestavu() {
    return kategoriestavu;
  }

  public void setKategoriestavu(StateCategory kategoriestavu) {
    this.kategoriestavu = kategoriestavu;
  }


  public ShiftRide getJizdaid() {
    return jizdaid;
  }

  public void setJizdaid(ShiftRide jizdaid) {
    this.jizdaid = jizdaid;
  }

}
