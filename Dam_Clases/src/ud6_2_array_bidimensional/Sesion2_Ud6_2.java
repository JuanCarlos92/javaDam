/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD6_2_ArrayBidimensional;

/**
 *
 * @author Juan Carlos
 */
public class Sesion2_Ud6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bus rojo = new Bus(2,8, 20);
        
        System.out.println(rojo.venderBillete(1,2));
        System.out.println(rojo.venderBillete(0,0));
        rojo.imprimirBus();
        
    }
    
}
