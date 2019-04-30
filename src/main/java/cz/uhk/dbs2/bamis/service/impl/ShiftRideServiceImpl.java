package cz.uhk.dbs2.bamis.service.impl;

import cz.uhk.dbs2.bamis.model.ShiftRide;
import cz.uhk.dbs2.bamis.repository.ShiftRideRepository;
import cz.uhk.dbs2.bamis.service.ShiftRideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author David Sladecek
 */
@Service
public class ShiftRideServiceImpl implements ShiftRideService {

    @Autowired
    ShiftRideRepository shiftRideRepository;

    @Override
    public void addShiftRide(ShiftRide shiftRide) {
        shiftRideRepository.save(shiftRide);
    }

    @Override
    public List<ShiftRide> loadAllShiftRides() {
        return shiftRideRepository.findAll();
    }

    @Override
    public ShiftRide showShiftRideWithId(int id) {
        return shiftRideRepository.findById(id).get();
    }
}
