package com.fleetmanager.fleetmanagement.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private String destination;
    private String deliveryAddress;
    private String ownersNumber;
}
