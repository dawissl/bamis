package cz.uhk.dbs2.bamis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name ="STAV")
public class Status {

  private Date datum;
  private String lokaceid;
  @Id
  @Column(name="STAVID")
  private String stavid;
  private String zamestnanecid;
  private String zasilkaid;
  private String kategoriestavu;
  private String jizdaid;


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
