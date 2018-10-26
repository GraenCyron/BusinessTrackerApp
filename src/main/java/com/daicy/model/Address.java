package com.daicy.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
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
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "ADDRESS_SEQ")
    @SequenceGenerator(name = "ADDRESS_SEQ",
            sequenceName = "address_id_seq")
    private Long id;
    private String unitNumber;
    private String houseBuildingStreetNumber;
    private String streetName;
    private String district;
    private String cityMunicipality;
    private String postalCode;
    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Customer customer;
}