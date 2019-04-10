package cz.uhk.dbs2.bamis.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="REGION")
public class Region {

  private String region;
  private String regionid;
  private String skladid;


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
