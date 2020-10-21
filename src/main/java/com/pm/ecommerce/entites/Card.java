package com.pm.ecommerce.entites;

import com.pm.ecommerce.enums.CardType;
import javax.validation.constraints.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "payment_cards")
@Data
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String holder;

    @NotNull
    private String number;

    @NotNull
    private int expMonth;

    @NotNull
    private int expYear;

    @NotNull
    private int securityCode;

    @NotNull
    private CardType type;

    @NotNull
    @OneToOne(cascade = CascadeType.DETACH, targetEntity = Account.class)
    private Account account;
}
