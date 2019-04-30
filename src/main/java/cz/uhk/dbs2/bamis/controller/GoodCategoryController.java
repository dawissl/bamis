package cz.uhk.dbs2.bamis.controller;

import cz.uhk.dbs2.bamis.service.GoodCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author David Sladecek
 */
@Controller
public class GoodCategoryController {

    GoodCategoryService goodCategoryService;

    @Autowired
    public GoodCategoryController(GoodCategoryService goodCategoryService) {
        this.goodCategoryService = goodCategoryService;
    }

    @GetMapping(value = "/packages/packages_category")
    public String packages(Model model) {
        model.addAttribute("packages_category",goodCategoryService.loadAllGoodCategories());
        return "packages_category";
    }
}
