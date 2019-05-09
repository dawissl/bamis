package cz.uhk.dbs2.bamis.controller;

import cz.uhk.dbs2.bamis.model.Good;
import cz.uhk.dbs2.bamis.model.StateCategory;
import cz.uhk.dbs2.bamis.model.Status;
import cz.uhk.dbs2.bamis.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;


/**
 * @author David Sladecek
 */
@Controller
public class PackageController {


    private PackageService packageService;
    private StoreService storeService;
    private GoodCategoryService goodCategoryService;
    private CustomerService customerService;
    private StatusService statusService;
    private StateCategoryService stateCategoryService;
    private LocationService locationService;
    private ShiftRideService shiftRideService;
    private EmployeeService employeeService;

    @Autowired
    public PackageController(PackageService packageService,
                             StoreService storeService,
                             GoodCategoryService goodCategoryService,
                             CustomerService customerService,
                             StatusService statusService,
                             StateCategoryService stateCategoryService,
                             LocationService locationService,
                             ShiftRideService shiftRideService,
                             EmployeeService employeeService) {
        this.packageService = packageService;
        this.storeService = storeService;
        this.goodCategoryService = goodCategoryService;
        this.customerService = customerService;
        this.statusService = statusService;
        this.stateCategoryService = stateCategoryService;
        this.locationService = locationService;
        this.shiftRideService = shiftRideService;
        this.employeeService = employeeService;
    }

    @GetMapping(value = "/packages")
    public String packages(Model model) {
        model.addAttribute("zasilky", packageService.loadAllPackages());
        model.addAttribute("stores", storeService.loadAllStores());
        model.addAttribute("categories", goodCategoryService.loadAllGoodCategories());
        model.addAttribute("zakaznik", customerService.loadAllCustomers());
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
        Status newStatus = new Status();
        //TODO create new status for added package
        //statusService.addStatus(newStatus);
        return "packages";
    }

    @GetMapping("/packages/{id}/delete")
    public String removePackage(@PathVariable(name = "id") String id, Model model) {
        packageService.removePackageWithId(Integer.valueOf(id));
        model.addAttribute("zasilky", packageService.loadAllPackages());
        return "packages";
    }

}
