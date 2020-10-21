package com.pm.ecommerce.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    //admin, vendor, customer, manager, qa, anything
    private String name;

    @OneToMany(cascade = CascadeType.DETACH, targetEntity = Permission.class)
    private List<Permission> permissions;
}
