package com.Practise.BootToJPA.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("car")
@Primary
public class Car implements Vehicle{
    private String brand;
    private int id;
    private double rent;

    public void info(String brand,int id,double rent){
        this.brand = brand;
        this.id = id;
        this.rent = rent;
    }

    @Override
    public void getDetails() {
        System.out.println("Car ID: "+id+"brand:"+brand);
    }

    @Override
    public void calculateRent(int numberOfDays) {
        System.out.println(rent*numberOfDays);
    }
}
