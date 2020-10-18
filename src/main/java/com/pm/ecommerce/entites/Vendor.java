package com.pm.ecommerce.entites;

import com.pm.ecommerce.enums.VendorStatus;
import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

@Entity(name = "vendors")
@Data
public class Vendor extends Account {
    private String username;

    private String businessName;

    private Date registered;

    private VendorStatus status;

    private Address address;

    private List<Card> cards;

    private Transaction payment;
}
