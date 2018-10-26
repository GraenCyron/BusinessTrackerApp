package com.daicy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "PLAYER_SEQ")
    @SequenceGenerator(name = "PLAYER_SEQ",
            sequenceName = "customer_id_seq")
    private Long id;
    private String firstName;
    private String lastName;
    private String contactNumber;

    public Customer(String firstName, String lastName, String contactNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
    }
}