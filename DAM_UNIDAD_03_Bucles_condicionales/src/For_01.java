/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class For_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a= 2;
        int sumatoria =0; // Variable donde vamos a acumular el resultado
        
        // Calcular la sumatoria de a
        for (int i=1; i<=a; i++){
            sumatoria = sumatoria + i;
        }
        System.out.println("La sumatoria de " + a + " es " + sumatoria);
    }
    
}
