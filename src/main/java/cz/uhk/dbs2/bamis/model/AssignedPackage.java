package cz.uhk.dbs2.bamis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pridelene_balicky")
public class AssignedPackage {
	
	@Id
	@Column(name = "ZAMESTNANECID")
	private int zamestnanecid;
	@Column(name = "JMENO")
	private String jmeno;
	@Column(name = "PRIJMENI")
	private String prijmeni;
	@Column(name = "TELEFON")
	private String telefon;
	@Column(name = "ZASILKAID")
	private int zasilkaid;
	
	public AssignedPackage() {}
	
	public AssignedPackage(int zamestnanecid, String jmeno, String prijmeni, String telefon, int zasilkaid) {
		this.zamestnanecid = zamestnanecid;
		this.jmeno = jmeno;
		this.prijmeni = prijmeni;
		this.telefon = telefon;
		this.zasilkaid = zasilkaid;
	}
	public int getZamestnanecid() {
		return zamestnanecid;
	}
	public void setZamestnanecid(int zamestnanecid) {
		this.zamestnanecid = zamestnanecid;
	}
	public String getJmeno() {
		return jmeno;
	}
	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
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
	public int getZasilkaid() {
		return zasilkaid;
	}
	public void setZasilkaid(int zasilkaid) {
		this.zasilkaid = zasilkaid;
	}
	
	

}
