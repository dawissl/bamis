package cz.uhk.dbs2.bamis.service;

import cz.uhk.dbs2.bamis.model.Employee;
import cz.uhk.dbs2.bamis.model.Location;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public interface LocationService {
	@Transactional
	void addLocation(Location location);
	 List<Location> loadAllLocations();

	 Location showLocationWithId (int id);
}
