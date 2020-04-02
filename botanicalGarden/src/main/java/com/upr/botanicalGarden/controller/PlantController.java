package com.upr.botanicalGarden.controller;

import com.upr.botanicalGarden.controller.exceptions.NotFoundException;
import com.upr.botanicalGarden.model.Plant;
import com.upr.botanicalGarden.service.PlantService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@SessionAttributes("plant")
public class PlantController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PlantService plantService;

    @GetMapping({"/", "/plant"})
    public String getIndex(Model model) {
        List<Plant> plants = plantService.findAll();
        logger.info("FOUND " + plants.size() + " plants");
        model.addAttribute("plants", plants);
        return "plant/index";
    }

    @GetMapping("/plant/new")
    public String getNew() {
        return "plant/form";
    }

    @GetMapping("/plant/edit/{id}")
    public String getEdit(@PathVariable("id") long id) {
        Plant plant =
                plantService
                        .findById(id)
                        .orElseThrow(() -> new NotFoundException("plant[ID: " + id + "]"));

        return "plant/form";
    }

    @GetMapping("/plant/view/{id}")
    public String showplant(@PathVariable("id") long id) {

        Plant plant =
                plantService
                        .findById(id)
                        .orElseThrow(() -> new NotFoundException("plant[ID: " + id + "]"));
        return "plant/view";
    }

    @GetMapping("/plant/delete/{id}")
    public String delete(@PathVariable("id") long id, Model model) {
        Optional<Plant> plantOpt = plantService.findById(id);
        Plant plant =
                plantOpt.orElseThrow(() -> new NotFoundException("plant[ID: " + id + "]"));
        plant.setSoftDelete(true);
        plantService.save(plant);
        return "redirect:/plant";
    }

    @PostMapping("/plant")
    public String save(
            @ModelAttribute Plant plant) {
        logger.info("Saving plant: " + plant);
        plantService.save(plant);
        return "redirect:/plant";
    }
}
