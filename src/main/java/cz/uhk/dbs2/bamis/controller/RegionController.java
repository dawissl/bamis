package cz.uhk.dbs2.bamis.controller;

import cz.uhk.dbs2.bamis.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author David Sladecek
 */
@Controller
public class RegionController {

    RegionService regionService;

    @Autowired
    public RegionController(RegionService regionService) {
        this.regionService = regionService;
    }

    @GetMapping(value = "/region")
    public String packages(Model model) {
        model.addAttribute("regions",regionService.loadAllRegions());
        return "region";
    }
}
