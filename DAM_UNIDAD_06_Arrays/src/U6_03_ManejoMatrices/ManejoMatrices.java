/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U6_03_ManejoMatrices;

/**
 *
 * @author Juan Carlos
 */
public class ManejoMatrices {
    //Realizar una aplicación que permita simular un tablero de ajedrez a través de un array de dos
    //dimensiones:

    //*Crear el tablero poniendo en las casillas blanca una B y en las negras una N
    //*Imprimir el resultado (algo como lo que sigue): 
    //NBNBNBNB
    //BNBNBNBN
    //NBNBNBNB
    //BNBNBNBN
    //NBNBNBNB
    //BNBNBNBN
    //NBNBNBNB
    //BNBNBNBN
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char tablero[][] = new char[8][8];
        char celda = 0;

        //Filas
        for (int i = 0; i < 8; i++) {
            //columnas
            for (int j = 0; j < 8; j++) {
                //Si columna es= resto 0 pinta (negro)/ sino (blanco)
                if (j == 0) {
                    if (i % 2 == 0) { //negro
                        celda = 'N';
                    } else {          //blanco
                        celda = 'B';
                    }
                    //Si columna no= resto 0 el blanco cambialo a negro y viceversa
                } else{
                    if (celda=='B') {
                        celda = 'N';
                    } else {         
                        celda = 'B';
                    }
                }
                //guarda la variable celda en el array y repetimos vuelta
                tablero[i][j] = celda;

            }
        }
        //Imprimimos
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println("");
            
        }
    }

}
