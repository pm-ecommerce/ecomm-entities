package com.pm.ecommerce.entities;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "accounts")
@Inheritance(strategy = InheritanceType.JOINED)
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
