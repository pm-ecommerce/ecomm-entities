package com.pm.ecommerce.entites;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
@Data
public class Employee extends Account {
}
