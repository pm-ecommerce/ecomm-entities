package com.pm.ecommerce.entities;

import com.pm.ecommerce.enums.OrderStatus;
import lombok.Data;

import javax.persistence.*;
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
    private Address billingAddress;

    @OneToOne(targetEntity = Address.class, cascade = CascadeType.DETACH)
    private Address shippingAddress;

    private double tax;

    private OrderStatus status;

    @OneToMany(targetEntity = Transaction.class, cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Transaction> transactions;

    @OneToMany(targetEntity = OrderItem.class, cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<OrderItem> items;

    private Timestamp createdDate;

    private Timestamp updatedDate;
}
