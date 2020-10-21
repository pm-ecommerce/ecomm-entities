package com.pm.ecommerce.entites;

import com.pm.ecommerce.enums.VendorStatus;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity(name = "vendors")
@Data
public class Vendor extends Account {
    private String username;

    @NotNull
    private String businessName;

    private Date registered;

    private VendorStatus status;

    @OneToOne(cascade = CascadeType.DETACH, targetEntity = Address.class)
    @NotNull
    private Address address;

    @OneToMany(cascade = CascadeType.DETACH, targetEntity = Card.class)
    private List<Card> cards;

    @OneToOne(cascade = CascadeType.DETACH, targetEntity = Transaction.class)
    private Transaction payment;
}
