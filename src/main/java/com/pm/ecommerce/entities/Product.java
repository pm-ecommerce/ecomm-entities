package com.pm.ecommerce.entities;

import com.pm.ecommerce.enums.ProductStatus;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity()
@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(targetEntity = Category.class, cascade = CascadeType.DETACH)
    private Category category;

    @ManyToOne(targetEntity = Category.class, cascade = CascadeType.DETACH)
    private Category subCategory;

    @NotNull
    private String name;

    @NotNull
    private String slug;

    private double price;

    @Column(columnDefinition = "text")
    private String description;

    private ProductStatus status;

    @OneToMany(targetEntity = Image.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Image> images;

    @OneToOne(targetEntity = Vendor.class, cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    private Vendor vendor;

    @OneToMany(cascade = CascadeType.ALL, targetEntity = ProductAttribute.class, fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<ProductAttribute> attributes;
}
