package cz.uhk.dbs2.bamis.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="KATEGORIESTAVU")
public class StateCategory {

  private String stav;
  private String kategoriestavu;


  public String getStav() {
    return stav;
  }

  public void setStav(String stav) {
    this.stav = stav;
  }


  public String getKategoriestavu() {
    return kategoriestavu;
  }

  public void setKategoriestavu(String kategoriestavu) {
    this.kategoriestavu = kategoriestavu;
  }

}
