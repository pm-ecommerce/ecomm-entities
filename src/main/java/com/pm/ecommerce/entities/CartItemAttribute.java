package com.pm.ecommerce.entities;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "cart_item_attributes")
public class CartItemAttribute extends Attribute {
    @OneToOne(cascade = CascadeType.ALL, targetEntity = Option.class)
    private Option option;
}
