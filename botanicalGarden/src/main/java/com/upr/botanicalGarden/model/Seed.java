package com.upr.botanicalGarden.model;

import javax.persistence.*;

@Entity
public class Seed {
    @Id
    @Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long amount;

    public Seed(Long id, Long amount) {
        this.id = id;
        this.amount = amount;
    }

    public Seed(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
