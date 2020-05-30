package com.upr.botanicalGarden.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Chemical {
    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Chemical name should not be blank")
    private String name;
    private String description;

    public Chemical(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Chemical(){}

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
