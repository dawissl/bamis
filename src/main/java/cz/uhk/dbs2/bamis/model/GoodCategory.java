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
  private String kategoriezasilkyid;


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
