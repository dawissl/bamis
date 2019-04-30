package cz.uhk.dbs2.bamis.controller;


import cz.uhk.dbs2.bamis.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author David Sladecek
 */
@Controller
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "/customer")
    public String packages(Model model) {
        model.addAttribute("customers",customerService.loadAllCustomers());
        return "customer";
    }
}
