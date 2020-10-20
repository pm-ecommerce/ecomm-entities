package com.pm.ecommerce.entites;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "options")
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private double price;




}

