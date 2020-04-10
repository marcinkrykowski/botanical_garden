package com.upr.botanicalGarden.controller.model;

import com.upr.botanicalGarden.model.Plant;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class PlantForm {

    private Long plantId;
    private String name;
    private String variety;
    private String cultivationMethod;
    private String details;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date plantingDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date exhibitionStart;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date exhibitionEnd;
    private String biologicalOrigin;
    private String originalOrigin;
    private Boolean softDelete;

    public PlantForm(){}

    public PlantForm(
            Long plantId,
            String name,
            String variety,
            String cultivationMethod,
            String details, Date plantingDate,
            Date exhibitionStart,
            Date exhibitionEnd,
            String biologicalOrigin,
            String originalOrigin) {
        this.plantId = plantId;
        this.name = name;
        this.variety = variety;
        this.cultivationMethod = cultivationMethod;
        this.details = details;
        this.plantingDate = plantingDate;
        this.exhibitionStart = exhibitionStart;
        this.exhibitionEnd = exhibitionEnd;
        this.biologicalOrigin = biologicalOrigin;
        this.originalOrigin = originalOrigin;
    }

    public Plant populatePlant(Plant plant){
        plant.setName(name);
        plant.setVariety(variety);
        plant.setCultivationMethod(cultivationMethod);
        plant.setDetails(details);
        plant.setPlantingDate(plantingDate);
        plant.setExhibitionStart(exhibitionStart);
        plant.setExhibitionEnd(exhibitionEnd);
        plant.setBiologicalOrigin(biologicalOrigin);
        plant.setOriginalOrigin(originalOrigin);
        return plant;
    }

    public Long getPlantId() {
        return plantId;
    }

    public void setPlantId(Long plantId) {
        this.plantId = plantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getCultivationMethod() {
        return cultivationMethod;
    }

    public void setCultivationMethod(String cultivationMethod) {
        this.cultivationMethod = cultivationMethod;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getPlantingDate() {
        return plantingDate;
    }

    public void setPlantingDate(Date plantingDate) {
        this.plantingDate = plantingDate;
    }

    public Date getExhibitionStart() {
        return exhibitionStart;
    }

    public void setExhibitionStart(Date exhibitionStart) {
        this.exhibitionStart = exhibitionStart;
    }

    public Date getExhibitionEnd() {
        return exhibitionEnd;
    }

    public void setExhibitionEnd(Date exhibitionEnd) {
        this.exhibitionEnd = exhibitionEnd;
    }

    public String getBiologicalOrigin() {
        return biologicalOrigin;
    }

    public void setBiologicalOrigin(String biologicalOrigin) {
        this.biologicalOrigin = biologicalOrigin;
    }

    public String getOriginalOrigin() {
        return originalOrigin;
    }

    public void setOriginalOrigin(String originalOrigin) {
        this.originalOrigin = originalOrigin;
    }

    public Boolean getSoftDelete() {
        return softDelete;
    }

    public void setSoftDelete(Boolean softDelete) {
        this.softDelete = softDelete;
    }
}
