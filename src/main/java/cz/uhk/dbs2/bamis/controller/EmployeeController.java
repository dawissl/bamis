package cz.uhk.dbs2.bamis.controller;

import cz.uhk.dbs2.bamis.model.Employee;
import cz.uhk.dbs2.bamis.service.EmployeeCategoryService;
import cz.uhk.dbs2.bamis.service.EmployeeService;
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
public class EmployeeController {

    EmployeeService employeeService;
    EmployeeCategoryService employeeCategoryService;

    @Autowired
    public EmployeeController(EmployeeService employeeService,
                              EmployeeCategoryService employeeCategoryService) {
        this.employeeService = employeeService;
        this.employeeCategoryService = employeeCategoryService;
    }

    @GetMapping(value = "/employee")
    public String employees(Model model) {
        model.addAttribute("employees",employeeService.loadAllEmployees());
        model.addAttribute("kategorie",employeeCategoryService.loadAllEmployeeCategories());
        return "employee";
    }

    @PostMapping("/employee")
    public String addPackage(Model model, @ModelAttribute(value = "employee") Employee employee) {
        employeeService.addEmployee(employee);
        model.addAttribute("employees", employeeService.loadAllEmployees());
        return "employee";
    }
}
