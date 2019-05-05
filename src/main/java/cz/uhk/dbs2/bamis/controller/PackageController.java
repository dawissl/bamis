package cz.uhk.dbs2.bamis.controller;

import cz.uhk.dbs2.bamis.model.Good;
import cz.uhk.dbs2.bamis.service.CustomerService;
import cz.uhk.dbs2.bamis.service.GoodCategoryService;
import cz.uhk.dbs2.bamis.service.PackageService;
import cz.uhk.dbs2.bamis.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServlet;


/**
 * @author David Sladecek
 */
@Controller
public class PackageController{


    private PackageService packageService;
    private StoreService storeService;
    private GoodCategoryService goodCategoryService;
    private CustomerService customerService;

    @Autowired
    public PackageController(PackageService packageService,
                             StoreService storeService,
                             GoodCategoryService goodCategoryService,
                             CustomerService customerService)
    {
        this.packageService = packageService;
        this.storeService = storeService;
        this.goodCategoryService = goodCategoryService;
        this.customerService = customerService;
    }

    @GetMapping(value = "/packages")
    public String packages(Model model) {
        model.addAttribute("zasilky", packageService.loadAllPackages());
        model.addAttribute("stores",storeService.loadAllStores());
        model.addAttribute("categories",goodCategoryService.loadAllGoodCategories());
        model.addAttribute("zakaznik",customerService.loadAllCustomers());
        return "packages";
    }


    @GetMapping("/packages/{id}")
    public String getPackageByID(@PathVariable String id, Model model) {
        model.addAttribute("zasilka", packageService.showPackageWithId(Integer.valueOf(id)));
        return "packageDetail";
    }

    @PostMapping("/packages")
    public String addPackage(Model model, @ModelAttribute(value = "good") Good good) {
        packageService.addPackage(good);
        model.addAttribute("zasilky", packageService.loadAllPackages());
        return "packages";
    }


    //TODO delete
}
