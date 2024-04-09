/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U5_05_LecturaFichero2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class LecturaFichero2 {

    /**
     * Como continuación del ejercicio “Escritura en un fichero de texto”,
     * desarrollamos este ejercicio que permite imprimir los datos que se
     * hubiesen introducido en el ejercicio anterior.
     *
     * Para resolver el presente ejercicio, vamos a utilizar el fichero llamado
     * datos.txt y situado en la carpeta c:/pruebas.
     *
     * Todas esas líneas se almacenaran en el citado fichero. Para comprobar el
     * correcto funcionamiento de la aplicación, ir hasta el fichero indicado y
     * abrirlo con el propio block de notas. Si todo funciona bien debe
     * mostrarnos lo que hayamos teclado.
     *
     * La finalidad de este ejercicio por tanto es acceder al citado fichero y
     * mostrar su contenido en pantalla.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner para pedir datos
        File fichero = new File("c:\\pruebas\\datos.txt");
        Scanner sc = new Scanner(System.in);
        String cadena;
        try {
            if (fichero.exists()) {
                FileWriter salida = new FileWriter("c:/ficheros/datos.txt");
                System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");
                cadena = sc.nextLine();

                while (!cadena.equalsIgnoreCase("FIN")) {
                    salida.write(cadena);
                    cadena = sc.nextLine();
                }
            } else {
                System.out.println("El fichero no existe");
            }
        } catch (IOException e) {
            System.out.println("Se ha producido un error " + e.getMessage());
        }
    }

}
