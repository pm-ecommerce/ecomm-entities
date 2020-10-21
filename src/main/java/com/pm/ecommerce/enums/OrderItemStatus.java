package com.pm.ecommerce.enums;

public enum OrderItemStatus {
    RECEIVED, //we have received the order
    IN_PROGRESS,
    SHIPPED,
    DELIVERED,//the customer has received
    CANCELLED,
    DELETED
}
