package cz.uhk.dbs2.bamis.service;
import org.springframework.stereotype.Service;

/**
 * @author David Sladecek
 */
@Service
public interface RegionService {
	
	 List<Region> loadAllRegions();

	 Region showRegionWithId (int id);
}
