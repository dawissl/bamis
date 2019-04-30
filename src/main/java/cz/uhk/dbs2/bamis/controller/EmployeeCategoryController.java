package cz.uhk.dbs2.bamis.controller;

import cz.uhk.dbs2.bamis.service.EmployeeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author David Sladecek
 */
@Controller
public class EmployeeCategoryController {

    EmployeeCategoryService employeeCategoryService;

    @Autowired
    public EmployeeCategoryController(EmployeeCategoryService employeeCategoryService) {
        this.employeeCategoryService = employeeCategoryService;
    }

    @GetMapping(value = "/employee/employee_category")
    public String packages(Model model) {
        model.addAttribute("employees_category",employeeCategoryService.loadAllEmployeeCategories());
        return "employee_category";
    }
}
