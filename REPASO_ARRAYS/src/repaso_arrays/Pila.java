/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso_arrays;

import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class Pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String salirBucle="";
        String pila [];
        
        for (int i = 0; i <= -1; i++) {
           pila["plato" + i];
           System.out.println("Estas en el bucle del array \n Si quieres parar el bucle introduce stop");
            salirBucle = sc.nextLine();
            if (salirBucle.equals("stop")) {
                i= -1;  
            }
            
        }
        sc.close();
    }
    
}
