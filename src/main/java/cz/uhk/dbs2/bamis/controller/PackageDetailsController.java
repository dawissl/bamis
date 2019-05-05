package cz.uhk.dbs2.bamis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cz.uhk.dbs2.bamis.service.PackageDetailsService;

@Controller
public class PackageDetailsController {


    private PackageDetailsService packageDetailsService;

    @Autowired
    public PackageDetailsController(PackageDetailsService packageDetailsService){
        this.packageDetailsService = packageDetailsService;
    }

    @GetMapping(value = "/packageDetails")
    public String packageDetails(Model model) {
        model.addAttribute("packageDetails",packageDetailsService.loadAllPackageDetails());
        return "packageDetails";
    }
}
