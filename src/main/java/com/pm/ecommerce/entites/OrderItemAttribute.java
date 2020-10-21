package com.pm.ecommerce.entites;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "order_item_attributes")
public class OrderItemAttribute extends Attribute {
    @OneToOne(cascade = CascadeType.ALL, targetEntity = Option.class)
    @NotNull
    private Option option;
}


