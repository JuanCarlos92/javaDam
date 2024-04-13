/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class BusquedaEnMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Declaración de la matriz*/
        int filas = 2;
        int columnas = 3;
// Variables para almacenar donde se encuentra el elemento 8 en la matriz
        int fila_elemento = -1, columna_elemento = -1;
        int elemento_buscar = 8;
        /*Elemento a buscar*/
        int[][] m = new int[filas][columnas];

        /*Incialización de los elementos de la matriz*/
 /*Inicialización de los elementos de la fila 0*/
        m[0][0] = 1;
        m[0][1] = 4;
        m[0][2] = 7;

        /*Inicialización de los elementos de la fila 1*/
        m[1][0] = 2;
        m[1][1] = 8;
        m[1][2] = 4;

//En el primer bucle se recorren por las filas de la matriz              
        for (int i = 0; i < filas; i++) {
// En el segundo bucle se recorren las columnas de cada fila de la matriz            
            for (int j = 0; j < columnas; j++) {
                if (m[i][j] == elemento_buscar) {
                    fila_elemento = i;
                    columna_elemento = j;
                }
            }
        }

        if (fila_elemento != -1 && columna_elemento != -1) {
            System.out.println("Elemento Encontrado: el elemento "
                    + elemento_buscar + " se encuentra en la fila "
                    + fila_elemento + " se encuentra en la columna "
                    + columna_elemento);
        } else {
            System.out.println("El elemento " + elemento_buscar
                    + " no se encuentra en la matriz");
        }
    }

}
