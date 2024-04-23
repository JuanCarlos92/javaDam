/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication51;

/**
 *
 * @author pcr
 */
public class Calculator {
    public double tax = .05;
    public double tip = .15;
    double total = 0;
    double morosos  = 0;
    //Include the cost of Alex's and Forgetful's meals in your calculations
    //Return the total after calculating
    public double findTotal(double price, String name){
        this.total = this.total + price;
        if (name == "Alex" || name == "Forgetful"){
            morosos = (price*(1+tax+tip)) + morosos;
            return morosos;
        }
        
            double total = price*(1+tax+tip);
            System.out.println(name +": $" +total);
       
        return this.total;
        
        
    }
}
