package com.pm.ecommerce.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@Table(name = "cart_items")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = CascadeType.DETACH, targetEntity = Product.class)
    @NotNull
    private Product product;

    @Column(columnDefinition = "int default 1")
    @NotNull
    private int quantity;

    @Column(columnDefinition = "int default 0.00")
    @NotNull
    private double rate;

    // optional
    @OneToMany(cascade = CascadeType.DETACH, targetEntity = CartItemAttribute.class)
    private List<CartItemAttribute> attributes;
}
