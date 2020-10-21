package com.pm.ecommerce.entites;

import javax.validation.constraints.NotNull;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "accounts")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;

    @NotNull
    protected String name;

    @NotNull
    protected String email;

    // remember to hash
    @NotNull
    protected String password;

    private Timestamp createdDate;

    private Timestamp updatedDate;

    // hash the password here
    @PrePersist
    protected void prePersist() {

    }

    // hash the password here
    @PreUpdate
    protected void preUpdate() {

    }
}
