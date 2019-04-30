package cz.uhk.dbs2.bamis.service.impl;

import cz.uhk.dbs2.bamis.repository.LocationRepository;
import cz.uhk.dbs2.bamis.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author David Sladecek
 */
@Service
public class LocationServiceImpl implements LocationService {
    @Autowired
    LocationRepository locationRepository;
    
    @Override
    public void addLocation(Location location) {
        locationRepository.save(location);
    }

    @Override
    public List<Location> loadAllLocations() {
        return locationRepository.findAll();
    }

    @Override
    public Location showLocationWithId(int id) {
        return locationRepository.findById(id).get();
    }
}
