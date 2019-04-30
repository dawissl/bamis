package cz.uhk.dbs2.bamis.repository;
import cz.uhk.dbs2.bamis.model.Good;
import cz.uhk.dbs2.bamis.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author David Sladecek
 */
@Repository
public interface LocationRepository extends JpaRepository<Location,Integer> {

}
