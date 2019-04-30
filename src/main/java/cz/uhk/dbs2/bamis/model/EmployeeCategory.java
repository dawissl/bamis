package cz.uhk.dbs2.bamis.model;

import javax.persistence.*;

@Entity
@Table(name ="KATEGORIEZAMESTNANCU")
public class EmployeeCategory {

  @Id
  @Column(name="KATEGORIEZAMESTNANCUID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_KATZAM_KATZAMID")
  private int kategoriezamestnancuid;
  @Column(name = "KATEGORIE")
  private String kategorie;

  public EmployeeCategory(int kategoriezamestnancuid, String kategorie){
	  this.kategoriezamestnancuid = kategoriezamestnancuid;
	  this.kategorie = kategorie;
  }


  public String getKategorie() {
    return kategorie;
  }

  public void setKategorie(String kategorie) {
    this.kategorie = kategorie;
  }


  public int getKategoriezamestnancuid() {
    return kategoriezamestnancuid;
  }

  public void setKategoriezamestnancuid(int kategoriezamestnancuid) {
    this.kategoriezamestnancuid = kategoriezamestnancuid;
  }

}
