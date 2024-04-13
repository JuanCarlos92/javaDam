/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class TablasDeMultiplicarBuclesWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int multiplicando = 1;
        int multiplicador = 0;
        int resultado;

        while (multiplicando <= 10) {
            System.out.println("Tabla del número:  " + multiplicando);

            multiplicador = 0;

            while (multiplicador <= 10) {
                resultado = multiplicando * multiplicador;
                System.out.println(multiplicando + " x "
                        + multiplicador + " = " + resultado);
                multiplicador++;
            }

            // incrementamos el multiplicando
            multiplicando++;
        }
    }

}
