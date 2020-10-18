package com.pm.ecommerce.entites;

import com.pm.ecommerce.enums.CardType;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "payment_cards")
@Data
public class Card {
    String holder;
    String number;

    int expMonth;
    int expYear;

    int securityCode;

    CardType type;

    Account account;
}
