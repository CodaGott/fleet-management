package com.fleetmanager.fleetmanagement.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String modelNumber;
    private LocalDate registrationDate;
    private String vehicleYear;
    private Integer vehicleWeight;
    @Enumerated
    private VehicleType vehicleType;
    @Enumerated
    private VehicleStatus vehicleStatus;
}
