package cz.uhk.dbs2.bamis.controller;

import cz.uhk.dbs2.bamis.service.GoodCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author David Sladecek
 */
@Service
public class GoodCategoryController {

    GoodCategoryService goodCategoryService;

    @Autowired
    public GoodCategoryController(GoodCategoryService goodCategoryService) {
        this.goodCategoryService = goodCategoryService;
    }

    @GetMapping(value = "/packages/category")
    public String packages() {
        return "packages_category";
    }
}
