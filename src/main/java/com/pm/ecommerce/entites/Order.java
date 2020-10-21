package com.pm.ecommerce.entites;

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

    @OneToOne(targetEntity = Account.class, cascade = CascadeType.DETACH)
    private Account user;

    @OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
    @NotNull
    private Address billingAddress;

    @OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
    @NotNull
    private Address shippingAddress;

    @Column(columnDefinition = "double default 0.00")
    private double tax;

    private OrderStatus status;

    @OneToMany(targetEntity = Transaction.class, cascade = CascadeType.DETACH)
    @NotNull
    private List<Transaction> transactions;

    @OneToMany(targetEntity = OrderItem.class, cascade = CascadeType.PERSIST)
    @NotNull
    private List<OrderItem> items;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp createdDate;

    private Timestamp updatedDate;
}
