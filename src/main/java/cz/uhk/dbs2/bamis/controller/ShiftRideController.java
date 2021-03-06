package cz.uhk.dbs2.bamis.controller;

import cz.uhk.dbs2.bamis.service.ShiftRideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author David Sladecek
 */
@Controller
public class ShiftRideController {

    private ShiftRideService shiftRideService;

    @Autowired
    public ShiftRideController(ShiftRideService shiftRideService) {
        this.shiftRideService = shiftRideService;
    }

    @GetMapping(value = "/ride")
    public String rides(Model model) {
        model.addAttribute("jizdy",shiftRideService.loadAllShiftRides());
        return "ride";
    }
}
