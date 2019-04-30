package cz.uhk.dbs2.bamis.service;

import org.springframework.stereotype.Service;

/**
 * @author David Sladecek
 */
@Service
public interface ShiftRideService {

	 List<ShiftRide> loadAllShiftRides();

	 ShiftRide showShiftRideWithId (int id);
}
