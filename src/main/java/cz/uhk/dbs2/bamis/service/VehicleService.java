package cz.uhk.dbs2.bamis.service;

import cz.uhk.dbs2.bamis.model.Vehicle;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public interface VehicleService {

	 List<Vehicle> loadAllVehicles();

	 Vehicle showVehicleWithId (int id);

	 void addVehicle(Vehicle vehicle);
}
