package com.pm.ecommerce.entities;

import com.pm.ecommerce.enums.ProductStatus;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity()
@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(targetEntity = Category.class, cascade = CascadeType.DETACH)
    private Category category;

    @NotNull
    private String name;

    @NotNull
    private String slug;

    private double price;

    @Column(columnDefinition = "text")
    private String description;

    private ProductStatus status;

    @OneToMany(targetEntity = Image.class, cascade = CascadeType.PERSIST)
    private List<Image> images;

    @OneToMany(cascade = CascadeType.PERSIST, targetEntity = ProductAttribute.class, fetch = FetchType.LAZY)
    private List<ProductAttribute> attributes;
}
