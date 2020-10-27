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

    @OneToOne(cascade = CascadeType.DETACH, targetEntity = Vendor.class)
    private Vendor vendor;

    @OneToOne(cascade = CascadeType.DETACH, targetEntity = Category.class)
    private Category parent;

    @Column(name = "is_deleted")
    private boolean isDeleted;
}
