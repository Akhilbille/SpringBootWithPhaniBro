package com.Practise.BootToJPA.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RentalSystem {

    //Field Injection
//    @Autowired
    private  Vehicle vehicle;

    @Value("${upstox.apiUrl:www.google.com}")
    private String apiUrl;

    //Constructor injection
//    @Autowired
//    public RentalSystem(@Qualifier("car") Vehicle vehicle){
//        this.vehicle = vehicle;
//    }

    //Setter Injection
    @Autowired
    @Qualifier("bike")
    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void bookVehicle(int numberOfDays){
        vehicle.info("Hyundai i20",101,2333.00);
        System.out.println("Booking vehicle");
        vehicle.getDetails();
        vehicle.calculateRent(numberOfDays);
    }

    public void checkApiDetails(){
        System.out.println(apiUrl);
    }





}
