package com.pm.ecommerce.entites;

import javax.persistence.*;
import java.sql.Timestamp;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;

    protected String name;

    protected String email;

    // remember to hash
    protected String password;

    private Timestamp createdDate;

    private Timestamp updatedDate;

    @Version
    int version;

    // hash the password here
    @PrePersist
    void prePersist() {

    }

    // hash the password here
    @PreUpdate
    void preUpdate() {

    }
}
