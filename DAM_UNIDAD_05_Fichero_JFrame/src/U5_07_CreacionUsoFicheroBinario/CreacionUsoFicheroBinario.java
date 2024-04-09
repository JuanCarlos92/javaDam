/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U5_07_CreacionUsoFicheroBinario;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class CreacionUsoFicheroBinario {

    /**
     * Programa que lee enteros por teclado y los escribe en el fichero
     * datos.dat. La lectura de datos acaba cuando se introduce -1.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Clase Scanner con objeto sc para leer por teclado
        Scanner sc = new Scanner(System.in);
        //Objetos para la clase FileOutputStream y DataOutputStream con valor NULL
        FileOutputStream fos;
        DataOutputStream salida;
        int numero;
        try {
            fos = new FileOutputStream("/ficheros/datos.dat"); //Creamos y abrimos el fichero
            salida = new DataOutputStream(fos);                 //Preparamos el fichero para escribir en el
            System.out.print("Introduce número entero. -1 para acabar: ");    // Pedimos el numero y lo almacenamos en la variable numero
            numero = sc.nextInt();
            while (numero != -1) {                                 //Mientras numero sea diferente o igual a -1 entra y...
                salida.writeInt(numero);                         //Escribe el número entero en el fichero
                System.out.print("Introduce número entero. -1 para acabar: ");//Pedimos numero nuevamente y guardamos el numero
                numero = sc.nextInt();
            }
            fos.close();
            salida.close();
            sc.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
}
