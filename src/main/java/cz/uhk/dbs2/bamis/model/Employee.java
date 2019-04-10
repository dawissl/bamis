package cz.uhk.dbs2.bamis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="ZAMESTNANEC")
public class Employee {

  private String jmeno;
  private String mail;
  private String plat;
  private String prijmeni;
  private String rodnecislo;
  private String telefon;
  @Id
  @Column(name= "ZAMESTNANECID")
  private String zamestnanecid;
  private String kategoriezamestnancuid;


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


  public String getPlat() {
    return plat;
  }

  public void setPlat(String plat) {
    this.plat = plat;
  }


  public String getPrijmeni() {
    return prijmeni;
  }

  public void setPrijmeni(String prijmeni) {
    this.prijmeni = prijmeni;
  }


  public String getRodnecislo() {
    return rodnecislo;
  }

  public void setRodnecislo(String rodnecislo) {
    this.rodnecislo = rodnecislo;
  }


  public String getTelefon() {
    return telefon;
  }

  public void setTelefon(String telefon) {
    this.telefon = telefon;
  }


  public String getZamestnanecid() {
    return zamestnanecid;
  }

  public void setZamestnanecid(String zamestnanecid) {
    this.zamestnanecid = zamestnanecid;
  }


  public String getKategoriezamestnancuid() {
    return kategoriezamestnancuid;
  }

  public void setKategoriezamestnancuid(String kategoriezamestnancuid) {
    this.kategoriezamestnancuid = kategoriezamestnancuid;
  }

}
