package cz.uhk.dbs2.bamis.service;

import cz.uhk.dbs2.bamis.model.Employee;
import cz.uhk.dbs2.bamis.model.ShiftRide;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public interface ShiftRideService {
	@Transactional
	void addShiftRide(ShiftRide shiftRide);
	 List<ShiftRide> loadAllShiftRides();

	 ShiftRide showShiftRideWithId (int id);
}
