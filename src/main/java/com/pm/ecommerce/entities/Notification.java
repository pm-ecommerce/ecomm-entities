package com.pm.ecommerce.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "notifications")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String sender;

    private String receiver;

    @Column(columnDefinition = "text")
    private String message;

    private String subject;

    private Timestamp createdDate;

    private Timestamp sentDate;

    private boolean delivered;
}
