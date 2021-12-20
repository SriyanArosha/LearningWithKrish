/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arosha.factorymethodexample;

/**
 *
 * @author Arosha
 */
abstract class SuperMarket {
    protected double price;
    abstract void setPrice();
    
    public void getPrice(int qty){
        System.out.println(" is : "+qty*price+" rupees");
    }
}
