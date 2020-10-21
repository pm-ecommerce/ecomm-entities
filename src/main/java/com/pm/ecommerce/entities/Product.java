package com.pm.ecommerce.entities;

import com.pm.ecommerce.enums.ProductStatus;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity(name = "products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(targetEntity = Category.class, cascade = CascadeType.REMOVE)
    @NotNull
    private Category category;

    @NotNull
    private String name;

    //REST URI compatible string
    @NotNull
    private String slug;

    private double price;

    @Column(columnDefinition = "text")
    private String description;

    private ProductStatus status;

    @OneToMany(targetEntity = Image.class, cascade = CascadeType.PERSIST)
    private List<Image> images;

    @ManyToOne(targetEntity = Vendor.class)
    @NotNull
    private Vendor vendor;

    @OneToMany(cascade = CascadeType.ALL, targetEntity = ProductAttribute.class)
    private List<ProductAttribute> attributes;
}
