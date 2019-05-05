package cz.uhk.dbs2.bamis.controller;

import cz.uhk.dbs2.bamis.model.Region;
import cz.uhk.dbs2.bamis.service.RegionService;
import cz.uhk.dbs2.bamis.service.StoreService;
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
public class RegionController {

    RegionService regionService;
    StoreService storeService;

    @Autowired
    public RegionController(RegionService regionService,
                            StoreService storeService) {
        this.regionService = regionService;
        this.storeService = storeService;
    }

    @GetMapping(value = "/region")
    public String packages(Model model) {
        model.addAttribute("regions",regionService.loadAllRegions());
        model.addAttribute("stores",storeService.loadAllStores());
        return "region";
    }
    @PostMapping("/region")
    public String addRegion(Model model, @ModelAttribute(value = "region") Region region) {
        regionService.addRegion(region);
        model.addAttribute("regiony", regionService.loadAllRegions());
        return "region";
    }
}
