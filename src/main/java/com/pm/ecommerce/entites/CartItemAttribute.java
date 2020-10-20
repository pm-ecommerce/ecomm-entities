package com.pm.ecommerce.entites;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "cart_item_attributes")
public class CartItemAttribute extends Attribute {


    @OneToOne(cascade = CascadeType.ALL,targetEntity = Option.class)
    private Option option;

}


