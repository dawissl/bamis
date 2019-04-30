package cz.uhk.dbs2.bamis.service;

import org.springframework.stereotype.Service;

/**
 * @author David Sladecek
 */
@Service
public interface LocationService {

	 List<Location> loadAllLocations();

	 Location showLocationWithId (int id);
}
