package com.Practise.BootToJPA.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {

   @Id
   private int id;

   @Column(name="street")
   private String street;

   @Column(name="city")
   private String city;

   @Column(name = "zip")
   private String zip;
   

}
