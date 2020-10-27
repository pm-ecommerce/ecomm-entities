package com.pm.ecommerce.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "product_attributes")
public class ProductAttribute extends Attribute {
    @OneToMany(cascade = CascadeType.ALL, targetEntity = Option.class, fetch = FetchType.LAZY, orphanRemoval = true)
    private Set<Option> options;
}
