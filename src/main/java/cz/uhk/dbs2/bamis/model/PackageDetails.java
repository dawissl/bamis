package cz.uhk.dbs2.bamis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="PACKAGE_DETAILS")
public class PackageDetails implements java.io.Serializable{
	
	@Id
	@Column(name = "ZAKAZNIKID")
	private int zakaznikid;
	@Column(name = "JMENO")
	private String jmeno;
	@Column(name = "PRIJMENI")
	private String prijmeni;
	@Column(name = "TELEFON")
	private String telefon;
	@Column(name = "VAHA")
	private String vaha;
	
	public PackageDetails() {
	}
	
	public PackageDetails(String jmeno, String prijmeni, String telefon, String vaha) {
		this.jmeno = jmeno;
		this.prijmeni = prijmeni;
		this.telefon = telefon;
		this.vaha = vaha;
	}
	public int getZakaznikid() {
		return zakaznikid;
	}
	public void setZakaznikid(int zakaznikid) {
		this.zakaznikid = zakaznikid;
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
	public String getVaha() {
		return vaha;
	}
	public void setVaha(String vaha) {
		this.vaha = vaha;
	}
	
		
}
