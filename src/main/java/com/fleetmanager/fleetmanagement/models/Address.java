package com.fleetmanager.fleetmanagement.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Address {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String state;
    private String city;
    private String address;
    private String country;
    private String zipCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Address address = (Address) o;
        return id != null && Objects.equals(id, address.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
