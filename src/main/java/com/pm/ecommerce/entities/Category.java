package com.pm.ecommerce.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity()
@Data
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String name;

    @OneToOne(cascade = CascadeType.PERSIST, targetEntity = Image.class)
    private Image image;

    @Column(name = "is_deleted")
    private boolean isDeleted;
}
