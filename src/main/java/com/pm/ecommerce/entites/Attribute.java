package com.pm.ecommerce.entites;


import javax.persistence.*;


@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Attribute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;


}


