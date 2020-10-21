package com.pm.ecommerce.entites;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity(name = "categories")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String name;

    @OneToOne(cascade = CascadeType.PERSIST, targetEntity = Image.class)
    private Image image;

    @OneToMany(cascade = CascadeType.DETACH, targetEntity = Product.class)
    private List<Product> products;

    @Column(name = "is_deleted")
    private boolean isDeleted;
}
