package com.pm.ecommerce.entities;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "order_item_attributes")
public class OrderItemAttribute extends Attribute {
    @OneToOne(cascade = CascadeType.ALL, targetEntity = Option.class)
    private Option option;
}


