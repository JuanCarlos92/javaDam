/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud3_4_estructura_salto_y_excepciones;

/**
 *
 * @author Juan Carlos
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 418;
        int sw = 0;
        for (int i = n - 1; i > 1; i--) {
            if (n % i == 0) {
                sw = 1;
                System.out.println(" compruebo la división por " + i);
                break;
            }
        }
        if (sw == 1) {
            System.out.println(" El numero " + n + " NO es primo ");
        } else {
            System.out.println(" El numero " + n + " SI es primo ");
        }
    }

}
