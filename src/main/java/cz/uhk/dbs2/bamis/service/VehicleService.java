package cz.uhk.dbs2.bamis.service;

import cz.uhk.dbs2.bamis.model.Vehicle;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


/**
 * @author David Sladecek
 */
@Service
public interface VehicleService {
	@Transactional
	void addVehicle(Vehicle vehicle);
	 List<Vehicle> loadAllVehicles();

	 Vehicle showVehicleWithId (int id);

}
