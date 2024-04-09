/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U5_03_EscrituraFichero;

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
public class EscrituraFicheroTexto {

    /**
     * Para resolver el presente ejercicio, vamos a crear desde nuestra
     * aplicación un fichero llamado datos.txt y lo vamos a situar en la carpeta
     * c:/pruebas. Este fichero lo vamos a rellenar con líneas de texto que el
     * programa nos irá pidiendo y que nosotros iremos tecleando hasta que
     * escribamos la cadena FIN. Todas esas líneas se almacenaran en el citado
     * fichero. Para comprobar el correcto funcionamiento de la aplicación, ir
     * hasta el fichero indicado y abrirlo con el propio block de notas. Si todo
     * funciona bien debe mostrarnos lo que hayamos teclado.
     *
     * @param args
     */
    public static void main(String[] args){
        File fichero = new File("c:/pruebas/datos.txt"); //se crea el fichero
        Scanner sc = new Scanner(System.in); //Creamos la clase scanner y mas adelante pediremos líneas
        try {
            FileWriter salida = new FileWriter(fichero, true); //Abre el fichero.(true) para continuar sin borrar la linea
            String cadena;
            System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");
            cadena = sc.nextLine();                              //se introduce por teclado una cadena de texto
            while (!cadena.equalsIgnoreCase("FIN")) { //Mientras cadena sea diferente a FIN...
                salida.write(cadena + System.lineSeparator());   //se escribe la cadena en el fichero
            }
            //Cerramos el flujo del objeto FileWrite y Scanner
            salida.close();
            sc.close();
        } catch (IOException e) {
            System.out.println("SE HA Producido un error");

        }
    }
}
