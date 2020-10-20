package com.pm.ecommerce.entites;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "product_attributes")
public class ProductAttribute extends Attribute {


    @OneToMany(cascade = CascadeType.ALL,targetEntity = Option.class)
    private List<Option> options;

}


