package com.pm.ecommerce.entities;

import lombok.Data;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.security.spec.KeySpec;
import java.sql.Timestamp;
import java.util.Base64;

@Entity
@Data
@Table(name = "accounts")
@Inheritance(strategy = InheritanceType.JOINED)
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;

    @NotNull
    protected String name;

    @NotNull
    protected String email;

    // remember to hash
    protected String password;

    private Timestamp createdDate;

    private Timestamp updatedDate;

    private final static byte[] SALT = {
            (byte) 0xc9,
            (byte) 0x36,
            (byte) 0x78,
            (byte) 0x99,
            (byte) 0x52,
            (byte) 0x3e,
            (byte) 0xea,
            (byte) 0xf2
    };

    @PrePersist
    protected void prePersist() {
        password = encryptPassword(password);
    }

    @PreUpdate
    protected void preUpdate() {
        password = encryptPassword(password);
    }

    private String encryptPassword(String password) {
        try {
            KeySpec spec = new PBEKeySpec(password.toCharArray(), SALT, 65536, 128);
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            return Base64.getEncoder().encodeToString(factory.generateSecret(spec).getEncoded());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        return null;
    }

    public boolean verify(String encoded, String pass) throws Exception {
        String encrypted = encryptPassword(pass);

        if (encrypted == null) {
            throw new Exception("Password could not be encoded");
        }

        return encrypted.equals(encoded);
    }

    public boolean verify(String pass) throws Exception {
        String encrypted = encryptPassword(pass);

        if (encrypted == null) {
            throw new Exception("Password could not be encoded");
        }

        return encrypted.equals(password);
    }
}
