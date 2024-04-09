/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD5_2_FileWrite_FileReader;



/**
 *
 * @author Juan Carlos
 */
public class Ud5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        articulo art = new articulo(1, "Mesa", 150, "Mesa de escritorio blanca");
        articulo art2 = new articulo(1, "cama", 300, "Mesa de escritorio negra");
        
        art.grabar();
        art2.grabar();
        art.listar();
    }
}