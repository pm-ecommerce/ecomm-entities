package com.pm.ecommerce.entites;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "addresses")
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    String address1;
    String address2;
    String zipcode;
    String city;

    @Column(length = 2)
    String state;

    @Column(length = 3)
    String country;
}
