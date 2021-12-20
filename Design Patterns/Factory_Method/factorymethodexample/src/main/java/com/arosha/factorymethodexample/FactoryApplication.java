/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arosha.factorymethodexample;

/**
 *
 * @author Arosha
 */
public class FactoryApplication {
    public static void main(String args[]){
        GetVehicleFactory vehicleFactory = new GetVehicleFactory();
        int quantity = 2;
        int quantity2 = 1;
        System.out.println("****");
        System.out.print("Price of "+quantity+" Biscuit/s");
        SuperMarket v = vehicleFactory.getVehicle("Biscuit");
        v.setPrice();
        v.getPrice(quantity);
        System.out.println("****");
        System.out.print("Price of "+quantity2+" IceCream/s");
        SuperMarket v1 = vehicleFactory.getVehicle("IceCream");
        v1.setPrice();
        v1.getPrice(quantity2);
        System.out.println("****");
    }
}
