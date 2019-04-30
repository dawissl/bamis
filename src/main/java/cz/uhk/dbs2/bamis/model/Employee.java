package cz.uhk.dbs2.bamis.model;

import javax.persistence.*;

@Entity
@Table(name ="ZAMESTNANEC")
public class Employee implements java.io.Serializable {

  @Id
  @Column(name= "ZAMESTNANECID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ZAMESTNANEC_ZAMESTNANECID")
  private int zamestnanecId;

  @Column(name = "JMENO")
  private String jmeno;
  @Column(name = "MAIL")
  private String mail;
  @Column(name = "PLAT")
  private String plat;
  @Column(name = "PRIJMENI")
  private String prijmeni;
  @Column(name = "RODNECISLO")
  private String rodnecislo;
  @Column(name = "TELEFON")
  private String telefon;

  @OneToOne
  @JoinColumn(name = "KATEGORIEZAMESTNANCUID")
  private EmployeeCategory kategoriezamestnancuid;

  public Employee(int zamestnanecId, String jmeno, String mail, String plat, String prijmeni, String rodnecislo, String telefon, EmployeeCategory kategoriezamestnancuid){
	  this.zamestnanecId = zamestnanecId;
	  this.jmeno = jmeno;
	  this.mail = mail;
	  this.plat = plat;
	  this.prijmeni = prijmeni;
	  this.rodnecislo = rodnecislo;
	  this.telefon = telefon;
	  this.kategoriezamestnancuid = kategoriezamestnancuid;
  }

  public Employee(){}

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


  public int getZamestnanecId() {
    return zamestnanecId;
  }

  public void setZamestnanecId(int zamestnanecid) {
    this.zamestnanecId = zamestnanecid;
  }


  public EmployeeCategory getKategoriezamestnancuid() {
    return kategoriezamestnancuid;
  }

  public void setKategoriezamestnancuid(EmployeeCategory kategoriezamestnancuid) {
    this.kategoriezamestnancuid = kategoriezamestnancuid;
  }

}
