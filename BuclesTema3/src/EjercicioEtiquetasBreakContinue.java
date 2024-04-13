/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class EjercicioEtiquetasBreakContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i = 0;
        // Definimos la etiqueta bucleExterno
        bucleExterno:
        // mientras i sea menor que 20
        while (i < 20) {
            // Incrementamos i
            i++;

            // Imprimimos los espacios
            for (int k = 1; k < (20 - i); k += 2) {
                // Si es par saltamos
                if (i % 2 == 0) {
                    continue bucleExterno;
                }
                System.out.print(" ");
            }

            // Imprimimos los asteriscos
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            // imprimimos salto de linea
            System.out.println("");

            // Si i es 19, rompemos el bucle
            if (i == 19) {
                break bucleExterno;
            }
        }
    }

}
