package com.pm.ecommerce.entities;

import com.pm.ecommerce.enums.OrderItemStatus;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@Table(name = "scheduled_deliveries")
public class ScheduledDelivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private OrderItemStatus status;

    @OneToOne(cascade = CascadeType.DETACH, targetEntity = DeliveryAddress.class)
    private DeliveryAddress address;

    //expected delivery date
    private Timestamp deliveryDate;

    //actual delivered date
    private Timestamp deliveredDate;

    @OneToMany(cascade = CascadeType.DETACH, targetEntity = OrderItem.class)
    private List<OrderItem> items;

    @OneToOne(cascade = CascadeType.DETACH, targetEntity = Vendor.class)
    private Vendor vendor;
}
