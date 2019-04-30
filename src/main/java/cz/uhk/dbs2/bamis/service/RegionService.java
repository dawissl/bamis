package cz.uhk.dbs2.bamis.service;
import cz.uhk.dbs2.bamis.model.Region;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public interface RegionService {

	 List<Region> loadAllRegions();

	 Region showRegionWithId (int id);

	 void addRegion(Region region);
}
