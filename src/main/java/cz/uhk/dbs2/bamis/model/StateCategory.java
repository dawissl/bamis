package cz.uhk.dbs2.bamis.model;

import javax.persistence.*;

@Entity
@Table(name ="KATEGORIESTAVU")
public class StateCategory implements java.io.Serializable {

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

  public StateCategory(){}

  public String getStav() {
    return stav;
  }

  public void setStav(String stav) {
    this.stav = stav;
  }


  public int getKategoriestavu() {
    return kategoriestavu;
  }

  public void setKategoriestavu(int kategoriestavu) {
    this.kategoriestavu = kategoriestavu;
  }

}
