package cz.uhk.dbs2.bamis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="SKLAD")
public class Store {

  @Id
  @Column(name="SKLADID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_SKLAD_SKLADID")
  private int skladid;
  @Column(name = "ADRESA")
  private String adresa;
  @Column(name = "KAPACITA")
  private String kapacita;
  
  @OneToMany
  @JoinColumn(name = "ZAMESTNANECID")
  private List<Customer> zamestnanecid;
  @OneToMany
  @JoinColumn(name = "VOZIDLAID")
  private List<Vehicle> vozidlaid;
  
  public Store(int skladid, String adresa, String kapacita, List<Customer> zamestnanecid, List<Vehicle> vozidlaid){
	  this.skladid = skladid;
	  this.adresa = adresa;
	  this.kapacita = kapacita;
	  this.zamestnanecid = zamestnanecid;
	  this.vozidlaid = vozidlaid;
  }


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
