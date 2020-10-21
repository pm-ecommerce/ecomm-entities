package com.pm.ecommerce.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@Table(name = "carts")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // help us identify a guest user
    // numeric value of the current time
    // generate something random
    @NotNull
    private String sessionId;

    @OneToOne(cascade = CascadeType.DETACH, targetEntity = Account.class)
    private Account user;

    @OneToMany(cascade = CascadeType.ALL, targetEntity = CartItem.class)
    private List<CartItem> cartItems;
}
