package com.pm.ecommerce.entities;


import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Attribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;

    @NotNull
    protected String name;
}
