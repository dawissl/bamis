package cz.uhk.dbs2.bamis.repository;

import cz.uhk.dbs2.bamis.model.Good;
import cz.uhk.dbs2.bamis.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author David Sladecek
 */
@Repository
public interface RegionRepository extends JpaRepository<Region,Integer> {

}
