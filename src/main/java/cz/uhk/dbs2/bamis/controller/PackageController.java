package cz.uhk.dbs2.bamis.controller;

import cz.uhk.dbs2.bamis.model.Good;
import cz.uhk.dbs2.bamis.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author David Sladecek
 */
@Controller
public class PackageController {


    private PackageService packageService;

    @Autowired
    public PackageController(PackageService packageService){
        this.packageService= packageService;
    }

    @GetMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("packages",packageService.loadAllPackages());
        return "packages";
    }


    @GetMapping("/package/{id}")
    public Good getPackageByID(@PathVariable String id){
        return packageService.showPackageWithId(Integer.valueOf(id));
    }


    //TODO delete, create, update
}
