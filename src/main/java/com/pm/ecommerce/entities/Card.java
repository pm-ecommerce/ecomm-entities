package com.pm.ecommerce.entities;

import com.pm.ecommerce.enums.CardType;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "cards")
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
}
