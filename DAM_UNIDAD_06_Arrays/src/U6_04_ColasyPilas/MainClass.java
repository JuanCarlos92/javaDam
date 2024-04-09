/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U6_04_ColasyPilas;

/**
 *
 * @author Juan Carlos
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila miPila = new Pila(5);

        System.out.println("Vacia pila: " + miPila.vacia());
        miPila.apilar(5);
        miPila.apilar(4);
        miPila.apilar(3);
        miPila.apilar(2);
        miPila.apilar(1);

        System.out.println("Llena pila: " + miPila.llena());

        System.out.println("Numero de elementos: " + miPila.numElementos());

        miPila.imprimir();
    }

}
