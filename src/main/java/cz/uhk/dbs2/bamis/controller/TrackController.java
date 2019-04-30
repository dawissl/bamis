package cz.uhk.dbs2.bamis.controller;

import cz.uhk.dbs2.bamis.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author David Sladecek
 */
@Controller
public class TrackController {

    TrackService trackService;

    @Autowired
    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    @GetMapping(value = "/track")
    public String packages(Model model) {
        model.addAttribute("trackes",trackService.loadAllTracks());
        return "track";
    }
}
