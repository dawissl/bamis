package cz.uhk.dbs2.bamis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author David Sladecek
 */
@Controller
public class AppController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

}
