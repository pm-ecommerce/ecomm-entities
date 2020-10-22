package com.pm.ecommerce.entities;

import com.pm.ecommerce.enums.OrderStatus;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(targetEntity = User.class, cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    private User user;

    @OneToOne(targetEntity = Address.class, cascade = CascadeType.DETACH)
    @NotNull
    private Address billingAddress;

    @OneToOne(targetEntity = Address.class, cascade = CascadeType.DETACH)
    @NotNull
    private Address shippingAddress;

    @Column(columnDefinition = "double default 0.00")
    private double tax;

    private OrderStatus status;

    @OneToMany(targetEntity = Transaction.class, cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    @NotNull
    private List<Transaction> transactions;

    @OneToMany(targetEntity = OrderItem.class, cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    @NotNull
    private List<OrderItem> items;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp createdDate;

    private Timestamp updatedDate;
}
