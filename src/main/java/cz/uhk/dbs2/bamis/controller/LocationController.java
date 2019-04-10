package cz.uhk.dbs2.bamis.controller;

import cz.uhk.dbs2.bamis.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author David Sladecek
 */
@Service
public class LocationController {

    LocationService locationService;

    @Autowired
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping(value = "/location")
    public String packages() {
        return "location";
    }
}
