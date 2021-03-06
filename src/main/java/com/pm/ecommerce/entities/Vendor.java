package com.pm.ecommerce.entities;

import com.pm.ecommerce.enums.VendorStatus;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity()
@Data
@Table(name = "vendors")
public class Vendor extends Account {
    private String username;

    @NotNull
    private String businessName;

    private Date registered;

    private VendorStatus status;

    @OneToOne(cascade = CascadeType.DETACH, targetEntity = Address.class, fetch = FetchType.EAGER)
    private Address address;

    @OneToMany(cascade = CascadeType.DETACH, targetEntity = Card.class, fetch = FetchType.LAZY)
    private List<Card> cards;

    @OneToOne(cascade = CascadeType.DETACH, targetEntity = Transaction.class, fetch = FetchType.LAZY)
    private Transaction payment;
}
