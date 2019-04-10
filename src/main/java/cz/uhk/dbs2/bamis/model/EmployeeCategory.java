package cz.uhk.dbs2.bamis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="KATEGORIEZAMESTNANCU")
public class EmployeeCategory {

  private String kategorie;
  @Id
  @Column(name="KATEGORIEZAMESTNANCUID")
  private String kategoriezamestnancuid;


  public String getKategorie() {
    return kategorie;
  }

  public void setKategorie(String kategorie) {
    this.kategorie = kategorie;
  }


  public String getKategoriezamestnancuid() {
    return kategoriezamestnancuid;
  }

  public void setKategoriezamestnancuid(String kategoriezamestnancuid) {
    this.kategoriezamestnancuid = kategoriezamestnancuid;
  }

}
