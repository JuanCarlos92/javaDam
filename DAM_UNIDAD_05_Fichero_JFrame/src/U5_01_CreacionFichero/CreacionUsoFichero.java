/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U5_01_CreacionFichero;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class CreacionUsoFichero {

    /**
     * Programa que lee enteros por teclado y los escribe en el fichero de texto
     * datos.txt. La lectura de datos acaba cuando se introduce -1.
     * @param args
     */
    public static void main(String[] args){
        File fichero = new File("datos.txt"); //se crea el fichero
        Scanner sc = new Scanner(System.in); //Clase scanner para pedir lineas de texto
        try {
            FileWriter fw = new FileWriter(fichero, true); //Abre el fichero.(true) para continuar sin borrar la linea
            int numero;
            System.out.println("Introduce numero entero. Para acabar introduce -1");
            numero = sc.nextInt(); //se introduce por teclado un numero entero
            while (numero != -1) {
                fw.write(numero + System.lineSeparator()); // escribe en el fichero el numero + separadorLinea
                System.out.print("Introduce número entero. -1 para acabar: ");
                numero = sc.nextInt(); //guarda en al variable el numero numero pedido.
            }
            fw.close(); // Cuando sale del while se cierra el FileWrite.

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
