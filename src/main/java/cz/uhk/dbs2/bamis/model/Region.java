package cz.uhk.dbs2.bamis.model;

import javax.persistence.*;
import java.util.List;

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
  private List<Store> skladid;

  public Region(int regionid, String region, List<Store> skladid){
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


  public int getRegionid() {
    return regionid;
  }

  public void setRegionid(int regionid) {
    this.regionid = regionid;
  }


  public List<Store> getSkladid() {
    return skladid;
  }

  public void setSkladid(List<Store> skladid) {
    this.skladid = skladid;
  }

}
