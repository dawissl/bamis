package cz.uhk.dbs2.bamis.service;
import cz.uhk.dbs2.bamis.model.Employee;
import cz.uhk.dbs2.bamis.model.Region;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public interface RegionService {
	@Transactional
	void addRegion(Region region);
	 List<Region> loadAllRegions();

	 Region showRegionWithId (int id);

}
