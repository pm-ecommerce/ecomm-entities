package com.pm.ecommerce.entites;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "cart_items")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = CascadeType.DETACH, targetEntity = Product.class)
    private Product product;

    private int quantity;

    private double rate;

    @OneToMany(cascade = CascadeType.DETACH, targetEntity = CartItemAttribute.class)
    private List<CartItemAttribute> attributes;



}
