package com.upr.botanicalGarden.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Hierarchy {
    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Hierarchy name should not be blank")
    private String name;
    private String details;

    public Hierarchy(Long id, String name, String details) {
        this.id = id;
        this.name = name;
        this.details = details;
    }

    public Hierarchy(){}

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
}
