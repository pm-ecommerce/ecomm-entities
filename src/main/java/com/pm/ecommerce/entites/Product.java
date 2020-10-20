package com.pm.ecommerce.entites;

import com.pm.ecommerce.enums.ProductStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    Category category;

    String name;
    double price;

    @Column(columnDefinition = "text")
    String description;

    ProductStatus status;

    List<Image> images;

    Vendor vendor;

    @OneToMany(cascade = CascadeType.ALL, targetEntity = ProductAttribute.class)
    private List<ProductAttribute> attributes;
}
