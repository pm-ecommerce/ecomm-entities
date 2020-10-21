package com.pm.ecommerce.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "addresses")
@Inheritance(strategy = InheritanceType.JOINED)
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String address1;

    private String address2;

    @NotNull
    private String zipcode;

    @NotNull
    private String city;

    @NotNull
    @Column(length = 2)
    private String state;

    @NotNull
    @Column(length = 3)
    private String country;
}
