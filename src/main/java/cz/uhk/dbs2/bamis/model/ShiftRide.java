package cz.uhk.dbs2.bamis.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="JIZDA")
public class ShiftRide {

  @Id
  private String jizdaid;
  private String vozidlaid;
  private String zamestnanecid;
  private String stavid;


  public String getJizdaid() {
    return jizdaid;
  }

  public void setJizdaid(String jizdaid) {
    this.jizdaid = jizdaid;
  }


  public String getVozidlaid() {
    return vozidlaid;
  }

  public void setVozidlaid(String vozidlaid) {
    this.vozidlaid = vozidlaid;
  }


  public String getZamestnanecid() {
    return zamestnanecid;
  }

  public void setZamestnanecid(String zamestnanecid) {
    this.zamestnanecid = zamestnanecid;
  }


  public String getStavid() {
    return stavid;
  }

  public void setStavid(String stavid) {
    this.stavid = stavid;
  }

}
