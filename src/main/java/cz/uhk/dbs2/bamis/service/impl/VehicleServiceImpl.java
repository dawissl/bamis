package cz.uhk.dbs2.bamis.service.impl;

import cz.uhk.dbs2.bamis.repository.VehicleRepository;
import cz.uhk.dbs2.bamis.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author David Sladecek
 */
@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;
    
    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    @Override
    public List<Vehicle> loadAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle showVahicleWithId(int id) {
        return vehicleRepository.findById(id).get();
    }
}
