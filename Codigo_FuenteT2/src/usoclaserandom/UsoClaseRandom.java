/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoclaserandom;
import java.util.Random;

public class UsoClaseRandom {

    public static void main(String[] args) {
        
        Random rdnNum = new Random();
                
        System.out.println("Booleano aleatorio: " + rdnNum.nextBoolean());
        System.out.println("Entero aleatorio: " + rdnNum.nextInt());
        System.out.println("Long aleatorio: " + rdnNum.nextLong());
        System.out.println("Float aleatorio: " + rdnNum.nextFloat());
        System.out.println("Double aleatorio: " + rdnNum.nextDouble());
                
        // Número aleatorio entre 0 a 19 inclusive
        int RandomInt2 = rdnNum.nextInt(20);
        System.out.println("Numero aleatorio entre 0 y 19: " + RandomInt2);
        
        // Número aleatorio entre 1 y 45 inclusive
        int RandomInt3 = rdnNum.nextInt(45)+1;
        System.out.println("Numero aleatorio entre 1 y 45: " + RandomInt3);
        
        // Número aleatorio entre 5 y 15 inclusive
        int RandomInt4 = rdnNum.nextInt(11)+5;
        System.out.println("Numero aleatorio entre 5 y 15: " + RandomInt4);
        
    }
    
}
