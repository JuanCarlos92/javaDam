/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U5_08_TrabajoConDirectorio;

import java.io.File;

/**
 *
 * @author Juan Carlos
 */
public class TrabajoConDirectorio {

    /**
     * Programa que comprueba si existe un directorio. Muestra determinada
     * información de dicho directorio: permisos y ficheros que contiene.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos el objeto dir de la clase File con la URL
        File dir = new File("c:/programacion");
        try {

            if (dir.exists()) {   //Si el directorio existe...
                //el directorio existe + URL
                System.out.println("Existe el directorio " + dir.getName());
            

                //Comprueba los permisos del directorio
                if (dir.canRead()) { //Si el diretorio se puede leer...
                    //el directorio existe y tiene lectura
                    System.out.println("El directorio existe y tiene permiso de lectura");
                }
                if (dir.canWrite()) { //Si el diretorio se puede escribir...
                    //el directorio existe y tiene escritura
                    System.out.println("El directorio existe y tiene permiso de escritura");
                }
                //Imprime todos los ficheros que contiene el directorio
                File[] ficheros = dir.listFiles();
                for (File f : ficheros) {
                    System.out.println(f.getName());
                }
                } else {
                //el directorio NO existe
                System.out.println("El directorio no existe");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
