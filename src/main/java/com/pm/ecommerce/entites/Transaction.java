package com.pm.ecommerce.entites;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity(name = "transaction_history")
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(targetEntity = Card.class, cascade = CascadeType.PERSIST)
    @NotNull
    private Card card;

    @Column(columnDefinition = "DOUBLE DEFAULT 0.00")
    private double amount;

    private Timestamp createdAt;
}
