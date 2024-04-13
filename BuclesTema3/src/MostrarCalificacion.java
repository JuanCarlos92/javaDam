/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class MostrarCalificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double nota = 7.5;

        if (nota < 5) {
            System.out.println("La calificación obtenida "
                    + "es: Suspenso");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("La calificación obtenida "
                    + "es: Suficiente");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("La calificación obtenida "
                    + "es: Bien");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("La calificación obtenida "
                    + "es de: Notable");
        } else if (nota >= 9 && nota < 10) {
            System.out.println("La calificación obtenida "
                    + "es: Sobresaliente");
        } else {
            System.out.println("La calificación obtenida "
                    + "es: Matrícula de Honor");
        }
    }

}
