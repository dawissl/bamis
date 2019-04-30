package cz.uhk.dbs2.bamis.service;

import cz.uhk.dbs2.bamis.model.Location;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public interface LocationService {

	 List<Location> loadAllLocations();

	 Location showLocationWithId (int id);

	 void addLocation(Location location);
}
