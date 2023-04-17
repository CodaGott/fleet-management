//package com.fleetmanager.fleetmanagement.models;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;
//import lombok.*;
//import org.hibernate.Hibernate;
//
//import java.util.Objects;
//
//@Entity
//@Getter
//@Setter
//@ToString
//@RequiredArgsConstructor
//public class Supplier extends Person{
//
//    @Id
//    private Long id;
//
//    @ManyToOne(cascade = CascadeType.REMOVE)
//    private Address address;
//    private String details;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
//        Supplier supplier = (Supplier) o;
//        return getId() != null && Objects.equals(getId(), supplier.getId());
//    }
//
//    @Override
//    public int hashCode() {
//        return getClass().hashCode();
//    }
//}
