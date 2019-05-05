package cz.uhk.dbs2.bamis.controller;

import cz.uhk.dbs2.bamis.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StoreController {
    StoreService storeService;

    @Autowired
    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping(value = "/store")
    public String packages(Model model) {
        model.addAttribute("stores",storeService.loadAllStores());
        return "store";
    }
}
