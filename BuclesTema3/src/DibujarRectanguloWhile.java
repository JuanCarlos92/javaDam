/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class DibujarRectanguloWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contadorFilas = 0;
        int contadorColumnas = 0;

        while (contadorFilas < 3) { // Controlamos las filas

            // Restablecemos el contador de columnas
            contadorColumnas = 0;

            // Imprimimos el simbolo @ 
            while (contadorColumnas < 10) {
                System.out.print("@");
                contadorColumnas++;
            }

            // Aumentamos el contador de filas
            contadorFilas++;
            System.out.println(); // salto de línea
        }
    }

}
