/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U5_02_LecturaFichero;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class LecturaFicheroTexto {

    /**
     * Para resolver el presente ejercicio, vamos a crear con el block de notas
     * un fichero llamado datos.txt y lo vamos a situar en la carpeta
     * c:/pruebas. Este fichero contendrá varias líneas de texto que serán las
     * que nuestra aplicación sea capaz de leer. Realizar un programa que sea
     * capaz de leer e imprimir el contenido del citado fichero de texto.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Fichero del que queremos leer
        File fichero = new File("c:\\pruebas\\datos.txt"); // Creamos el fichero

        try {
            System.out.println("... Leemos el contenido del fichero ..."); // Leemos el contenido del fichero
            Scanner s = new Scanner(fichero); //Metemos el fichero en el lector scanner
            while (s.hasNextLine()) {        // Leemos linea x linea el fichero
                String linea = s.nextLine(); // Guardamos la linea en un String
                System.out.println(linea); // Imprimimos la linea
            }
            s.close(); //Cerramos el scanner al terminar el while

        } catch (Exception ex) {
            System.out.println("Mensaje: " + ex.getMessage());

        }
    }

}
