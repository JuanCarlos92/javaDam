/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class EjercicioTryCatchDivisiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int dividendo = 8;
        int divisor = 0;
        int cociente;

        // Codigo donde puede producirse el error dentro de try
        try {
            cociente = dividendo / divisor;
            System.out.println("Resultado: " + cociente);
        } // Si ocurre la excepcion la capturamos
        catch (ArithmeticException ex) {
            System.out.println("Division por cero -- " + ex);
        } // Bloque que siempre se ejecuta
        finally {
            System.out.println("\nSiempre se ejecuta");
        }
    }

}
