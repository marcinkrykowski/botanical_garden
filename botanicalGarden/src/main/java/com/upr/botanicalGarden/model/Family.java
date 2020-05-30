package com.upr.botanicalGarden.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Family {
    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Family name should not be blank")
    private String name;
    private String details;
    private String description;

    public Family(Long id, String name, String details, String description) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.description = description;
    }

    public Family(){}

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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
