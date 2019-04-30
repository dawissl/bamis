package cz.uhk.dbs2.bamis.model;


import javax.persistence.*;

@Entity
@Table(name ="ZAKAZNIK")
public class Customer implements java.io.Serializable {

  @Id
  @Column(name="ZAKAZNIKID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ZAKAZNIK_ZAKAZNIKID")
  private int zakaznikid;

  @Column(name="JMENO")
  private String jmeno;
  @Column(name="MAIL")
  private String mail;
  @Column(name="PREDPLATITEL")
  private String predplatitel;
  @Column(name="PRIJMENI")
  private String prijmeni;
  @Column(name="TELEFON")
  private String telefon;

  @OneToOne
  @JoinColumn(name="LOKACEID")
  private Location lokaceid;

  public Customer(int zakaznikid, String jmeno, String mail, String predplatitel, String prijmeni, String telefon, Location lokaceid){
	  this.zakaznikid = zakaznikid;
	  this.jmeno = jmeno;
	  this.mail = mail;
	  this.predplatitel = predplatitel;
	  this.prijmeni = prijmeni;
	  this.telefon = telefon;
	  this.lokaceid = lokaceid;
  }
public Customer(){}

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


  public int getZakaznikid() {
    return zakaznikid;
  }

  public void setZakaznikid(int zakaznikid) {
  public Location getLokaceid() {
    return lokaceid;
  }

  public void setLokaceid(Location lokaceid) {
    this.lokaceid = lokaceid;
  }

}
