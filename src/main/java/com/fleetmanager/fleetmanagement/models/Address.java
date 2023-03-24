package com.fleetmanager.fleetmanagement.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {
    @Id
    private Long id;
    private String state;
    private String city;
    private String address;
    private String country;
    private String zipCode;
}
