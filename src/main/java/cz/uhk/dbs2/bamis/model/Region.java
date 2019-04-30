package cz.uhk.dbs2.bamis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="REGION")
public class Region {

  @Id
  @Column(name= "REGIONID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_REGION_REGIONID")
  private int regionid;
  @Column(name = "REGION")
  private String region;
  
  @OneToMany
  @JoinColumn(name = "SKLADID")
  private List<Sklad> skladid;
  
  public Region(int regionid, String region, List<Sklad> skladid){
	  this.regionid = regionid;
	  this.region = region;
	  this.skladid = skladid;
  }


  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  public String getRegionid() {
    return regionid;
  }

  public void setRegionid(String regionid) {
    this.regionid = regionid;
  }


  public String getSkladid() {
    return skladid;
  }

  public void setSkladid(String skladid) {
    this.skladid = skladid;
  }

}
