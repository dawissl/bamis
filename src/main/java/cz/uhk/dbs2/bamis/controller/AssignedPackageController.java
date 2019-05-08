package cz.uhk.dbs2.bamis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cz.uhk.dbs2.bamis.service.AssignedPackageService;

@Controller
public class AssignedPackageController {
	
	AssignedPackageService assignedPackageService;
		
		@Autowired
		public AssignedPackageController(AssignedPackageService assignedPackageService) {
			this.assignedPackageService = assignedPackageService;
		}
		
		@GetMapping(value = "assignedPackage")
		public String assignedPackages(Model model) {
			model.addAttribute("assignedPackage",assignedPackageService.loadAllAssignedPackages());
			return "assignedPackage";
		}
		

}
