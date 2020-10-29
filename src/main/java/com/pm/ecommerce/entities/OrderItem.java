package com.pm.ecommerce.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@Table(name = "order_items")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = CascadeType.DETACH, targetEntity = Product.class, fetch = FetchType.LAZY)
    private Product product;

    @NotNull
    private int quantity;

    @NotNull
    private double rate;

    @OneToMany(cascade = CascadeType.ALL, targetEntity = OrderItemAttribute.class, fetch = FetchType.LAZY)
    private List<OrderItemAttribute> attributes;
}
