/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U4_05;
import animales.*;
/**
 *
 * @author Juan Carlos
 */
public class test4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ave ave = new ave();
        mamifero mamifero = new mamifero();
        lobo lobo = new lobo();
        tigre tigre = new tigre();
        
        System.out.println("El ave puede " + ave.accion());
        System.out.println("El mamifero puede " + mamifero.accion());
        System.out.println("El lobo puede " + lobo.accion());
        System.out.println("El tigre puede " + tigre.accion());
        
    }
    
}
