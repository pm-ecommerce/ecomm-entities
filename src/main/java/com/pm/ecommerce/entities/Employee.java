package com.pm.ecommerce.entities;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "employees")
public class Employee extends Account {
    @OneToOne(cascade = CascadeType.DETACH, targetEntity = Role.class)
    private Role role;
}
