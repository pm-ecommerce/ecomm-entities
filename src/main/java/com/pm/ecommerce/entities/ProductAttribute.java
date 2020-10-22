package com.pm.ecommerce.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "product_attributes")
public class ProductAttribute extends Attribute {
    @OneToMany(cascade = CascadeType.ALL, targetEntity = Option.class, fetch = FetchType.LAZY)
    private List<Option> options;
}


