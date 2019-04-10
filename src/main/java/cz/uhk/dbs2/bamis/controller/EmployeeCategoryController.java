package cz.uhk.dbs2.bamis.controller;

import cz.uhk.dbs2.bamis.service.EmployeeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @GetMapping(value = "/employee/category")
    public String packages() {
        return "employee_category";
    }
}
