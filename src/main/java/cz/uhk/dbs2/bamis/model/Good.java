package cz.uhk.dbs2.bamis.model;

import javax.persistence.*;

@Entity
@Table(name = "ZASILKA")
public class Good implements java.io.Serializable{

  @Id
  @Column(name = "ZASILKAID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ZASILKA_ZASILKAID")
  private int zasilkaId;
  @Column(name="VAHA")
  private String vaha;
  
  @OneToOne
  @JoinColumn(name="KATEGORIEZASILKYID")
  private GoodCategory kategoriezasilkyId;
  @OneToOne
  @JoinColumn(name="SKLADID")
  private Store skladId;
  @OneToOne
  @JoinColumn(name = "ZAKAZNIKID")
  private Customer zakaznikId;

  public Good (){
  }

  public Good(String vaha, GoodCategory kategoriezasilkyId/*, String skladId, String zakaznikId*/) {
    this.vaha = vaha;
    this.kategoriezasilkyId = kategoriezasilkyId;
    //this.skladId = skladId;
    //this.zakaznikId = zakaznikId;
  }

  public Good(GoodCategory kategoriezasilkyId) {
    this.kategoriezasilkyId = kategoriezasilkyId;
  }


  public String getVaha() {
    return vaha;
  }

  public void setVaha(String vaha) {
    this.vaha = vaha;
  }


  public int getZasilkaId() {
    return zasilkaId;
  }

  public void setZasilkaId(int zasilkaId) {
    this.zasilkaId = zasilkaId;
  }


  public GoodCategory getKategoriezasilkyId() {
    return kategoriezasilkyId;
  }

  public void setKategoriezasilkyId(GoodCategory kategoriezasilkyId) {
    this.kategoriezasilkyId = kategoriezasilkyId;
  }

/*
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
*/
}
