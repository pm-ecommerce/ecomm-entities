package com.pm.ecommerce.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity()
@Data
@Table(name = "images")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String name;
}
