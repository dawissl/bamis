package cz.uhk.dbs2.bamis.controller;

import cz.uhk.dbs2.bamis.model.Location;
import cz.uhk.dbs2.bamis.service.LocationService;
import cz.uhk.dbs2.bamis.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author David Sladecek
 */
@Controller
public class LocationController {

    LocationService locationService;
    RegionService regionService;

    @Autowired
    public LocationController(LocationService locationService,
                              RegionService regionService) {
        this.locationService = locationService;
        this.regionService = regionService;
    }

    @GetMapping(value = "/location")
    public String packages(Model model) {
        model.addAttribute("locations",locationService.loadAllLocations());
        model.addAttribute("regiony",regionService.loadAllRegions());
        return "location";
    }

    @PostMapping("/location")
    public String addLocation(Model model, @ModelAttribute(value = "location") Location location) {
        locationService.addLocation(location);
        model.addAttribute("locations", locationService.loadAllLocations());
        return "location";
    }
}
