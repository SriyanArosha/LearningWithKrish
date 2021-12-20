/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arosha.factorymethodexample;

/**
 *
 * @author Arosha
 */
public class GetVehicleFactory {
    public SuperMarket getVehicle(String planType){
        if(planType == null){
            return null;
        }else if(planType.equalsIgnoreCase("BISCUIT")){
            return new Biscuit();
        }else if(planType.equalsIgnoreCase("ICECREAM")){
            return new IceCream();
        }
        return null;
    }
}
