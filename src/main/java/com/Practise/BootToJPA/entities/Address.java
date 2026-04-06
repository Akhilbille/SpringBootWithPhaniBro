package com.Practise.BootToJPA.entities;

import jakarta.persistence.*;
import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "addresses")
public class Address {

   @Id
   private int id;

   @Column(name="street")
   private String street;

   @Column(name="city")
   private String city;

   @Column(name = "zip")
   private String zip;


   @ManyToOne
   @JoinColumn(name = "user_id")
   @ToString.Exclude
   private User user;

}
