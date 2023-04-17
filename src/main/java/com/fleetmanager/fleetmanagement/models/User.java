package com.fleetmanager.fleetmanagement.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
