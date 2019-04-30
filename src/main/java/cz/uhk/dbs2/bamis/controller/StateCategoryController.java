package cz.uhk.dbs2.bamis.controller;

import cz.uhk.dbs2.bamis.service.StateCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author David Sladecek
 */
@Controller
public class StateCategoryController {

    StateCategoryService stateCategoryService;

    @Autowired
    public StateCategoryController(StateCategoryService stateCategoryService) {
        this.stateCategoryService = stateCategoryService;
    }

    @GetMapping(value = "/status/status_category")
    public String packages() {
        return "status_category";
    }
}
