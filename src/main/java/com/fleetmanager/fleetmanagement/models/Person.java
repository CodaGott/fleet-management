package com.fleetmanager.fleetmanagement.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    private String otherName;
    private String title;
    private String initials;
    private String gender;
    private String maritalStatus;
    @JoinColumn(name = "address")
    @ManyToOne(cascade = CascadeType.REMOVE)
    private Address address;
    private LocalDate dateOfBirth;
    private String mobileNo;
    private String email;
    private String photo;
}
