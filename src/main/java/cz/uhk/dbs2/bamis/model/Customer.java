package cz.uhk.dbs2.bamis.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="ZAKAZNIK")
public class Customer {

  private String jmeno;
  private String mail;
  private String predplatitel;
  private String prijmeni;
  private String telefon;
  @Id
  private String zakaznikid;
  private String lokaceid;


  public String getJmeno() {
    return jmeno;
  }

  public void setJmeno(String jmeno) {
    this.jmeno = jmeno;
  }


  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }


  public String getPredplatitel() {
    return predplatitel;
  }

  public void setPredplatitel(String predplatitel) {
    this.predplatitel = predplatitel;
  }


  public String getPrijmeni() {
    return prijmeni;
  }

  public void setPrijmeni(String prijmeni) {
    this.prijmeni = prijmeni;
  }


  public String getTelefon() {
    return telefon;
  }

  public void setTelefon(String telefon) {
    this.telefon = telefon;
  }


  public String getZakaznikid() {
    return zakaznikid;
  }

  public void setZakaznikid(String zakaznikid) {
    this.zakaznikid = zakaznikid;
  }


  public String getLokaceid() {
    return lokaceid;
  }

  public void setLokaceid(String lokaceid) {
    this.lokaceid = lokaceid;
  }

}
