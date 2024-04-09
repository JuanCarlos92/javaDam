/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U6_03_ManejoMatrices;

/**
 *
 * @author Juan Carlos
 */
public class ManejoMatricesx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char tablero[][] = new char[16][16];
        char celda = '0';

        for (int filas = 0; filas < 16; filas++) {
            for (int columnas = 0; columnas < 16; columnas++) {
                if (columnas == 0) {
                    if (filas % 2 == 0) {
                        // Negro
                        celda = 'N';
                    } else // Blanco
                    {
                        celda = 'B';
                    }
                } else {
                    if (celda == 'B') {
                        celda = 'N';
                    } else {
                        celda = 'B';
                    }
                }

                tablero[filas][columnas] = celda;
            }
        }

        // Imprimimos en pantalla
        for (int filas = 0; filas < 16; filas++) {
            for (int columnas = 0; columnas < 16; columnas++) {
                System.out.print(tablero[filas][columnas]);
            }
            System.out.println();
        }

    }
}
