package cz.uhk.dbs2.bamis.service;

import org.springframework.stereotype.Service;

/**
 * @author David Sladecek
 */
@Service
public interface VehicleService {

	 List<Vehicle> loadAllVehicles();

	 Vehicle showVehicleWithId (int id);
}
