/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class EjercicioBreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1;

        while (i <= 10) {
            System.out.println("Impresión del número: " + i);
            if (i == 5) {
                break;
            }
            i++;
        }
    }

}
