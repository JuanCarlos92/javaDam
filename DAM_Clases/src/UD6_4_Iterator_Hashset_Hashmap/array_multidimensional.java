/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD6_4_Iterator_Hashset_Hashmap;

/**
 *
 * @author Juan Carlos
 */
public class array_multidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int filas =2;
        int columnas=3;
        
        int[][] matriz = new int [filas][columnas];
        
        matriz[0][0]=1;
        matriz[0][1]=4;
        matriz[0][2]=7;
        matriz[1][0]=2;
        matriz[1][1]=8;
        matriz[1][2]=4;
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println(matriz[i][j]);
            }
            
        }
    }
    
}
