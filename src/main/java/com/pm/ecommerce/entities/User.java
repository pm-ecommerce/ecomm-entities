package com.pm.ecommerce.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User extends Account {
    @OneToMany(cascade = CascadeType.DETACH, targetEntity = Card.class, fetch = FetchType.LAZY)
    private List<Card> cards;
}
