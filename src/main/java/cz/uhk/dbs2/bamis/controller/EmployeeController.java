package cz.uhk.dbs2.bamis.controller;

import cz.uhk.dbs2.bamis.model.Employee;
import cz.uhk.dbs2.bamis.service.EmployeeCategoryService;
import cz.uhk.dbs2.bamis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/employee/{id}")
    public String getPackageByID(@PathVariable String id, Model model) {
        model.addAttribute("zasilka", employeeService.showEmployeeWithId(Integer.valueOf(id)));
        return "employeeDetail";
    }

    @PostMapping("/employee")
    public String addEmployee(Model model, @ModelAttribute(value = "employee") Employee employee) {
        employeeService.addEmployee(employee);
        model.addAttribute("employees", employeeService.loadAllEmployees());
        return "employee";
    }

    @GetMapping("/employee/{id}/delete")
    public String removeEmployee(@PathVariable(name="id") String id, Model model) {
        employeeService.removeEmployeeWithId(Integer.valueOf(id));
        model.addAttribute("employees", employeeService.loadAllEmployees());
        return "employee";
    }

    @GetMapping("/employee/{id}/edit")
    public String showUpdateForm(@PathVariable("id") String id, Model model) {
        model.addAttribute("user", employeeService.showEmployeeWithId(Integer.valueOf(id)));
        model.addAttribute("kategorie",employeeCategoryService.loadAllEmployeeCategories());
        return "employeeUpdate";
    }

    @PostMapping("/employee/{id}/update")
    public String updateEmployee(@PathVariable(name="id") String id,Employee employee, Model model) {
        employeeService.addEmployee(employee);
        employeeService.removeEmployeeWithId(Integer.valueOf(id));
        model.addAttribute("employees", employeeService.loadAllEmployees());
        return "employee";
    }
}
