package cz.uhk.dbs2.bamis.controller;

import cz.uhk.dbs2.bamis.model.Employee;
import cz.uhk.dbs2.bamis.model.Status;
import cz.uhk.dbs2.bamis.service.StateCategoryService;
import cz.uhk.dbs2.bamis.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author David Sladecek
 */
@Controller
public class StatusController {

    StatusService statusService;
    StateCategoryService stateCategoryService;

    @Autowired
    public StatusController(StatusService statusService, StateCategoryService stateCategoryService) {
        this.statusService = statusService;
        this.stateCategoryService=stateCategoryService;
    }

    @GetMapping(value = "/status")
    public String packages(Model model) {
        model.addAttribute("state",statusService.loadAllStatuses());
        return "status";
    }

    @GetMapping(value = "/status/{id}")
    public String statuswithID(Model model,@PathVariable(name="id") String id) {
        model.addAttribute("status",statusService.showStatusWithId(Integer.valueOf(id)));
        return "statusDetail";
    }

    @GetMapping("/status/{id}/edit")
    public String showUpdateForm(@PathVariable("id") String id, Model model) {
        model.addAttribute("status", statusService.showStatusWithId(Integer.valueOf(id)));
        model.addAttribute("stavy",stateCategoryService.loadAllStateCategories());
        return "statusUpdate";
    }

    @PostMapping("/status/{id}/update")
    public String updateStatus(@PathVariable(name="id") String id,Status status, Model model) {
        statusService.editStatusWithId(Integer.valueOf(id),status);
        model.addAttribute("status", statusService.showStatusWithId(Integer.valueOf(id)));
        return "statusDetail";
    }
}
