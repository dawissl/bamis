package cz.uhk.dbs2.bamis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
  private Track jizdaid;
  
  public Status(int stavid, Date datum, Location lokaceid, Employee zamestnanecid, Good zasilkaid, StateCategory kategoriestavu, Track jizdaid){
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


  public String getLokaceid() {
    return lokaceid;
  }

  public void setLokaceid(String lokaceid) {
    this.lokaceid = lokaceid;
  }


  public String getStavid() {
    return stavid;
  }

  public void setStavid(String stavid) {
    this.stavid = stavid;
  }


  public String getZamestnanecid() {
    return zamestnanecid;
  }

  public void setZamestnanecid(String zamestnanecid) {
    this.zamestnanecid = zamestnanecid;
  }


  public String getZasilkaid() {
    return zasilkaid;
  }

  public void setZasilkaid(String zasilkaid) {
    this.zasilkaid = zasilkaid;
  }


  public String getKategoriestavu() {
    return kategoriestavu;
  }

  public void setKategoriestavu(String kategoriestavu) {
    this.kategoriestavu = kategoriestavu;
  }


  public String getJizdaid() {
    return jizdaid;
  }

  public void setJizdaid(String jizdaid) {
    this.jizdaid = jizdaid;
  }

}
