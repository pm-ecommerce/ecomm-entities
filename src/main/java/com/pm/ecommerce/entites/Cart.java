package com.pm.ecommerce.entites;

import javax.validation.constraints.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "cart")
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
    @NotNull
    private List<CartItem> cartItems;
}
