package com.upr.botanicalGarden.controller;

import com.upr.botanicalGarden.controller.exceptions.NotFoundException;
import com.upr.botanicalGarden.controller.model.PlantForm;
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
    public String getNew(Model model) {
        model.addAttribute("plantForm", new PlantForm());
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
    public String showplant(@PathVariable("id") long id, Model model) {
        Plant plant =
                plantService
                        .findById(id)
                        .orElseThrow(() -> new NotFoundException("plant[ID: " + id + "]"));
        PlantForm plantForm = populatePlantForm(plant);

        model.addAttribute("plantForm", plantForm);
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
    public String save(@ModelAttribute PlantForm plantForm) {

        Plant plant = populatePlantForm(plantForm);
        logger.info("Saving plant: " + plant);
        plantService.save(plant);
        return "redirect:/plant";
    }

    private PlantForm populatePlantForm(Plant plant) {
        return new PlantForm(
                plant.getId(),
                plant.getName(),
                plant.getVariety(),
                plant.getCultivationMethod(),
                plant.getDetails(),
                plant.getPlantingDate(),
                plant.getExhibitionStart(),
                plant.getExhibitionEnd(),
                plant.getBiologicalOrigin(),
                plant.getOriginalOrigin());
    }

    private Plant populatePlantForm(PlantForm plantForm) {
        Plant plant;
        if (plantForm.getPlantId() == null) {
            plant = new Plant();
        } else {
            Optional<Plant> plantOptional = plantService.findById(plantForm.getPlantId());
            plant =
                    plantOptional.orElseThrow(
                            () -> new NotFoundException("Plant[ID: " + plantForm.getPlantId() + "]"));
        }

        return plantForm.populatePlant(plant);
    }
}
