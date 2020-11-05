package com.pm.ecommerce.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "stripe_transactions")
@Data
@DiscriminatorValue(value = "stripe_transactions")
public class StripeTransaction extends Transaction {
    String status;

    @Column(name = "receipt_url")
    String receiptUrl;

    @Column(name = "payment_method")
    String paymentMethod;

    String description;

    String currency;

    String created;

    @Column(name = "balance_transaction")
    String balanceTransaction;

    @Column(name = "charge_id")
    String chargeId;

    boolean paid;

    boolean liveMode;
}
