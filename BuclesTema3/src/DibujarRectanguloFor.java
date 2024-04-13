/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class DibujarRectanguloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int contadorFilas = 0; contadorFilas < 3; contadorFilas++) {

            for (int contadorColumnas = 0; contadorColumnas <= 10; contadorColumnas++) {
                System.out.print("@");
            }

            System.out.println();
        }
    }

}
