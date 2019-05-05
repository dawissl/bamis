package cz.uhk.dbs2.bamis.controller;

import cz.uhk.dbs2.bamis.model.Vehicle;
import cz.uhk.dbs2.bamis.service.VehicleService;
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
public class VehicleController {

    VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping(value = "/vehicle")
    public String packages(Model model) {
        model.addAttribute("vehicles",vehicleService.loadAllVehicles());
        return "vehicle";
    }

    @PostMapping("/vehicle")
    public String addVehicle(Model model, @ModelAttribute(value = "vehicle") Vehicle vehicle) {
        vehicleService.addVehicle(vehicle);
        model.addAttribute("vehicles", vehicleService.loadAllVehicles());
        return "vehicle";
    }
}
