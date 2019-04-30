package cz.uhk.dbs2.bamis.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "SKLAD")
public class Store {

    @Column(name = "ADRESA")
    private int kapacita;
    @Id
    @Column(name = "SKLADID")
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


    public int getKapacita() {
        return kapacita;
    }

    public void setKapacita(int kapacita) {
        this.kapacita = kapacita;
    }


    public String getSkladid() {
        return skladid;
    }

    public String getZamestnanecid() {
        return zamestnanecid;
    }

    public void setZamestnanecid(String zamestnanecid) {
        this.zamestnanecid = zamestnanecid;
    }


    public List<Vehicle> getVozidlaid() {
        return vozidlaid;
    }

    public void setVozidlaid(List<Vehicle> vozidlaid) {
        this.vozidlaid = vozidlaid;
    }

}
