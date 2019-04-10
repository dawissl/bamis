package cz.uhk.dbs2.bamis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="SKLAD")
public class Store {

  private String adresa;
  private String kapacita;
  @Id
  @Column(name="SKLADID")
  private String skladid;
  private String zamestnanecid;
  private String vozidlaid;


  public String getAdresa() {
    return adresa;
  }

  public void setAdresa(String adresa) {
    this.adresa = adresa;
  }


  public String getKapacita() {
    return kapacita;
  }

  public void setKapacita(String kapacita) {
    this.kapacita = kapacita;
  }


  public String getSkladid() {
    return skladid;
  }

  public void setSkladid(String skladid) {
    this.skladid = skladid;
  }


  public String getZamestnanecid() {
    return zamestnanecid;
  }

  public void setZamestnanecid(String zamestnanecid) {
    this.zamestnanecid = zamestnanecid;
  }


  public String getVozidlaid() {
    return vozidlaid;
  }

  public void setVozidlaid(String vozidlaid) {
    this.vozidlaid = vozidlaid;
  }

}
