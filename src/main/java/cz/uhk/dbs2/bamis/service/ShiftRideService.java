package cz.uhk.dbs2.bamis.service;

import cz.uhk.dbs2.bamis.model.ShiftRide;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public interface ShiftRideService {

	 List<ShiftRide> loadAllShiftRides();

	 ShiftRide showShiftRideWithId (int id);

	 void addShiftRide(ShiftRide shiftRide);
}
