package cz.uhk.dbs2.bamis.model;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="TRASA")
public class Track {

  @Id
  @Column(name = "TRASAID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TRASA_TRASAID")
  private int trasaid;
  
  @OneToMany
  @JoinColumn(name = "LOKACEID")
  private List<Location> lokaceid;
  @OneToOne
  @JoinColumn(name = "VOZIDLAID")
  private Vehicle vozidlaid;
  
  public Track(int trasaid, List<Location> lokaceid, Vehicle vozidlaid){
	  this.trasaid = trasaid;
	  this.lokaceid = lokaceid;
	  this.vozidlaid = vozidlaid;
  }

  public String getTrasaid() {
    return trasaid;
  }

  public void setTrasaid(String trasaid) {
    this.trasaid = trasaid;
  }


  public String getLokaceid() {
    return lokaceid;
  }

  public void setLokaceid(String lokaceid) {
    this.lokaceid = lokaceid;
  }


  public String getVozidlaid() {
    return vozidlaid;
  }

  public void setVozidlaid(String vozidlaid) {
    this.vozidlaid = vozidlaid;
  }

}
