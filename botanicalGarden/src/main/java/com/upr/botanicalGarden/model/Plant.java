package com.upr.botanicalGarden.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
public class Plant {
    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Plant name should not be blank")
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

    public Plant(String name,
                 String variety,
                 String cultivationMethod,
                 String details, Date plantingDate,
                 Date exhibitionStart,
                 Date exhibitionEnd,
                 String biologicalOrigin,
                 String originalOrigin) {
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

    public Plant() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSoftDelete() {
        return softDelete;
    }

    public void setSoftDelete(Boolean softDelete) {
        this.softDelete = softDelete;
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
}
