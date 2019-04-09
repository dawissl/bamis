package cz.uhk.dbs2.bamis.model;

import javax.persistence.*;

@Entity
@Table(name = "Zasilka")
public class Good implements java.io.Serializable{

  @Id
  @Column(name = "ZasilkaID", length = 8, nullable = false)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_Zasilka_ZasilkaID")
  private int zasilkaId;
  @Column(name="Vaha", length = 6, precision = 2)
  int vaha;
  @Column(name="KategorieZasilkyID", length=2)
  private int kategoriezasilkyId;
  private String skladId;
  private String zakaznikId;

  public Good(int vaha, int kategoriezasilkyId, String skladId, String zakaznikId) {
    this.vaha = vaha;
    this.kategoriezasilkyId = kategoriezasilkyId;
    this.skladId = skladId;
    this.zakaznikId = zakaznikId;
  }

  public Good(int kategoriezasilkyId) {
    this.kategoriezasilkyId = kategoriezasilkyId;
  }


  public int getVaha() {
    return vaha;
  }

  public void setVaha(int vaha) {
    this.vaha = vaha;
  }


  public int getZasilkaId() {
    return zasilkaId;
  }

  public void setZasilkaId(int zasilkaId) {
    this.zasilkaId = zasilkaId;
  }


  public int getKategoriezasilkyId() {
    return kategoriezasilkyId;
  }

  public void setKategoriezasilkyId(int kategoriezasilkyId) {
    this.kategoriezasilkyId = kategoriezasilkyId;
  }


  public String getSkladId() {
    return skladId;
  }

  public void setSkladId(String skladId) {
    this.skladId = skladId;
  }


  public String getZakaznikId() {
    return zakaznikId;
  }

  public void setZakaznikId(String zakaznikId) {
    this.zakaznikId = zakaznikId;
  }

}
