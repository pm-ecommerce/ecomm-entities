package com.pm.ecommerce.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "cart_item_attributes")
public class CartItemAttribute extends Attribute {
    @OneToOne(cascade = CascadeType.ALL, targetEntity = Option.class)
    @NotNull
    private Option option;
}
