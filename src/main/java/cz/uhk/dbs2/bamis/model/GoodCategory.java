package cz.uhk.dbs2.bamis.model;

import javax.persistence.*;

@Entity
@Table(name="KATEGORIEZASILKY")
public class GoodCategory implements java.io.Serializable {

  @Column(name="KATEGORIE")
  private String kategorie;
  @Id
  @Column(name="KATEGORIEZASILKYID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_KATEZAS_KATZASID")
  private int kategoriezasilkyid;

  public GoodCategory(int kategoriezasilkyid, String kategorie){
	  this.kategoriezasilkyid = kategoriezasilkyid;
	  this.kategorie = kategorie;
  }

  public GoodCategory (){
  }

  public String getKategorie() {
    return kategorie;
  }

  public void setKategorie(String kategorie) {
    this.kategorie = kategorie;
  }


  public int getKategoriezasilkyid() {
    return kategoriezasilkyid;
  }

  public void setKategoriezasilkyid(int kategoriezasilkyid) {
    this.kategoriezasilkyid = kategoriezasilkyid;
  }

}
