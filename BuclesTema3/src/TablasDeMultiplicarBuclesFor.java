/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class TablasDeMultiplicarBuclesFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int resultado;

        for (int multiplicando = 1; multiplicando <= 10; multiplicando++) {

            System.out.println("Tabla del número: " + multiplicando);

            for (int multiplicador = 0; multiplicador <= 10; multiplicador++) {
                resultado = multiplicando * multiplicador;
                System.out.println(multiplicando + "x"
                        + multiplicador + "=" + resultado);
            }
        }
    }

}
