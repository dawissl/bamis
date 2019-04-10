package cz.uhk.dbs2.bamis.model;


import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(name ="JIZDA")
public class Track {

  private String trasaid;
  private String lokaceid;
  private String vozidlaid;


  public String getTrasaid() {
    return trasaid;
  }

  public void setTrasaid(String trasaid) {
    this.trasaid = trasaid;
  }


  public String getLokaceid() {
    return lokaceid;
  }

  public void setLokaceid(String lokaceid) {
    this.lokaceid = lokaceid;
  }


  public String getVozidlaid() {
    return vozidlaid;
  }

  public void setVozidlaid(String vozidlaid) {
    this.vozidlaid = vozidlaid;
  }

}
