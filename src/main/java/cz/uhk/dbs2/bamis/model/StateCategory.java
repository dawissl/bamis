package cz.uhk.dbs2.bamis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="KATEGORIESTAVU")
public class StateCategory {

  @Id
  @Column(name="KATEGORIESTAVU")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_KATSTAVU_KATEGORIESTAVU")
  private int kategoriestavu;
	
  @Column(name = "STAV")
  private String stav;
  
  public StateCategory(int kategoriestavu, String stav){
	  this.kategoriestavu = kategoriestavu;
	  this.stav = stav;
  }


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
