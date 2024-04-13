/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class EjercicioContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i = 0;

        while (i < 10) {
            i++;
            if (i == 5) {
                continue;
            }
            System.out.println("Impresión del número: " + i);
        }
    }

}
