/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U5_04_LecturaEscrituraFicheroScanner;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Juan Carlos
 */
public class LecturaEscrituraFicheroScanner {

    /**
     * Programa Java que crea una matriz de elementos de tipo double y lee por
     * teclado el valor de sus elementos. A continuación escribe el contenido de
     * la matriz en un fichero. Al principio del fichero se escriben dos enteros
     * con los valores del número de filas y columnas de la matriz.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //Scanner para leer por teclado 
        double[][] matriz;
        int filas, columnas, i, j;
        do {
            System.out.print("Número de filas: ");      //--> Pedimos el nºFilas e introducimos en la variable Fila
            filas = sc.nextInt();
        } while (filas <= 0);                             //Mientras fila sea menor o igual 0 ....(Entra y haz esto ....)
        do {
            System.out.print("Número de columnas: ");   //--> Pedimos el nºColumnas e introducimos en la variable columna
            columnas = sc.nextInt();
        } while (columnas <= 0);                          //Mientras columna sea menor o igual 0 ....(Entra y haz esto ....)
        matriz = new double[filas][columnas];             //SE CREA EL ARRAY 

        for (i = 0; i < filas; i++) {                     //lectura de datos por teclado
            for (j = 0; j < columnas; j++) {
                System.out.print("matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextDouble();
            }
        }
        try {
            //crear el fichero de salida
            File fichero = new File("matriz.dat");

            if (!fichero.exists()) {
                fichero.createNewFile();
            }
            FileOutputStream fi = new FileOutputStream(fichero);
            DataOutputStream io = new DataOutputStream(fi);
            //escribir el número de filas y columnas en el fichero
            io.writeInt(filas);
            io.writeInt(columnas);

            //escribir la matriz en el fichero
            for (i = 0; i < filas; i++) {                   //Buble for que mientras i sea menor a fila entre y...
                for (j = 0; j < columnas; j++) {            //Buble for que mientras j sea menor a columna entre y ...
                    io.writeDouble(matriz[i][j]);           //ESCRIBA EL ARRAY double en la variable io (DataOutputStream)
                }
            }
            //Cerramos el flujo fi(FileOutputStream) io(DataOutputStream)
            fi.close();
            io.close();

        } catch (IOException e) {
            System.out.println("Se ha producido un error " + e.getMessage());

        }
    }

}
