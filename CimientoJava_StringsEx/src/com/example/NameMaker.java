/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;


public class NameMaker {
    
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        String firstName;
        String middleName;
        String lastName;
        String fullName;
        
        System.out.println("Primer Nombre: ");
        firstName = sc.nextLine();
        System.out.println("Segundo Nombre: ");
        middleName = sc.nextLine();
        middleName = " " + middleName;
        System.out.println("Apellido: ");
        lastName = sc.nextLine();
        lastName = " " + lastName;
        sc.close();
      
        
        fullName = firstName.concat(middleName).concat(lastName);
        
        System.out.println(fullName);
    
    }
}
