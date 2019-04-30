package cz.uhk.dbs2.bamis.model;


import javax.persistence.*;
import java.util.List;

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

  public int getTrasaid() {
    return trasaid;
  }

  public void setTrasaid(int trasaid) {
    this.trasaid = trasaid;
  }


  public List<Location> getLokaceid() {
    return lokaceid;
  }

  public void setLokaceid(List<Location> lokaceid) {
    this.lokaceid = lokaceid;
  }


  public Vehicle getVozidlaid() {
    return vozidlaid;
  }

  public void setVozidlaid(Vehicle vozidlaid) {
    this.vozidlaid = vozidlaid;
  }

}
