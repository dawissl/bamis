package cz.uhk.dbs2.bamis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="KATEGORIEZASILKY")
public class GoodCategory {

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


  public String getKategorie() {
    return kategorie;
  }

  public void setKategorie(String kategorie) {
    this.kategorie = kategorie;
  }


  public String getKategoriezasilkyid() {
    return kategoriezasilkyid;
  }

  public void setKategoriezasilkyid(String kategoriezasilkyid) {
    this.kategoriezasilkyid = kategoriezasilkyid;
  }

}
