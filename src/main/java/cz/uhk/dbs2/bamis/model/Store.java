package cz.uhk.dbs2.bamis.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "SKLAD")
public class Store {

    @Column(name = "ADRESA")
    private String adresa;
    @Column(name = "KAPACITA")
    private int kapacita;
    @Id
    @Column(name = "SKLADID")
    private String skladid;
    @Column(name = "ZAMESTNANECID")
    private String zamestnanecid;
    @OneToMany
    @Column(name = "VOZIDLOID")
    private List<Vehicle> vozidlaid;


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
