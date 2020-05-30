package com.upr.botanicalGarden.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Worker {
    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Worker first name should not be blank")
    private String firstName;
    @NotBlank(message = "Worker last name should not be blank")
    private String lastName;
    private Position position;

    public Worker(Long id, String firstName, String lastName, Position position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public Worker(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public enum Position{
        PHYSICAL_WORKER("PHYSICAL_WORKER"),
        GARDENER("GARDENER"),
        OTHER("OTHER");

        private final String displayName;

        Position(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }
}

