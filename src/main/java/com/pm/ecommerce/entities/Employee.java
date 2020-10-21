package com.pm.ecommerce.entities;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "employees")
@Data
public class Employee extends Account {
    @OneToOne(cascade = CascadeType.DETACH, targetEntity = Role.class)
    @NotNull
    private Role role;
}
