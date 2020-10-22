package com.pm.ecommerce.entities;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "attributes")
@Inheritance(strategy = InheritanceType.JOINED)
public class Attribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;

    @NotNull
    protected String name;
}
