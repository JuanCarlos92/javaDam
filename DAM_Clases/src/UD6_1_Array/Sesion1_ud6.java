/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD6_1_Array;

/**
 *
 * @author Juan Carlos
 */
public class Sesion1_ud6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Crear array
        int array1[] = new int[5];
        //Asignamos lo que vale la posicion 0
        array1[0] = 2;
        //Creamos un objeto array pasandole por parámetros el array1
        array a = new array(array1);

        //(array a es un objetos) Imprimimos el array a con el método imprimirElemento
        a.imprimirElemento();

        
        //Agregamos elemento al array
        
        
        array b = new array(20);
        b.anadir(8, 3);
        b.imprimirElemento();
    }
    
}
