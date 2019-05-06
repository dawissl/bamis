package cz.uhk.dbs2.bamis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cz.uhk.dbs2.bamis.service.LoadedVehicleService;

@Controller
public class LoadedVehicleController {
	
	LoadedVehicleService loadedVehicleService;
	
	@Autowired
	public LoadedVehicleController(LoadedVehicleService loadedVehicleService) {
		this.loadedVehicleService = loadedVehicleService;
	}
	
	@GetMapping(value = "/loadedVehicle")
    public String packages(Model model) {
        model.addAttribute("loadedVehicles",loadedVehicleService.loadAllLoadedVehicles());
        return "loadedVehicle";
    }

}
