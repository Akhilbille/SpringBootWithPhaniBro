package com.Practise.BootToJPA.Services;

public interface Vehicle {
    void getDetails();
    void info(String brand,int id,double rent);
    void calculateRent(int numberOfDays);
}
