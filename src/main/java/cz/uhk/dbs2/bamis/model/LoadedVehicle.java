package cz.uhk.dbs2.bamis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nalozena_auta")
public class LoadedVehicle {
	
	@Id
	@Column(name ="SPZ")
	private String spz;
	@Column(name ="NALOZENOST")
	private String nalozenost;
	
	public LoadedVehicle() {}
	
	public LoadedVehicle(String spz, String nalozenost) {
		this.spz = spz;
		this.nalozenost = nalozenost;
	}
	public String getSpz() {
		return spz;
	}
	public void setSpz(String spz) {
		this.spz = spz;
	}
	public String getNalozenost() {
		return nalozenost;
	}
	public void setNalozenost(String nalozenost) {
		this.nalozenost = nalozenost;
	}
	
	

}
