package com.pm.ecommerce.entites;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String sessionId;

    @OneToOne(cascade = CascadeType.DETACH, targetEntity = User.class)
    private User user;


}
