package com.pm.ecommerce.entities;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Data
@Table(name = "product_attributes")
public class ProductAttribute extends Attribute {
    @OneToMany(cascade = CascadeType.ALL, targetEntity = Option.class)
    private List<Option> options;
}


