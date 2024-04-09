/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package U2_08_Principal;
import U2_08_Animales.perros;
/**
 *
 * @author Usuario
 */
public class EjercicioRealizado_02_08 {

    public static void main(String[] args) {
        perros p1 = new perros();
        perros p2 =new perros("breton", "marron", 5);
        
        p1.setRaza("Boxer");
        p1.setColor("negro");
        p1.setEdad(10);
        
        System.out.println("PERROS: ");
        System.out.println("\nRaza: " + p1.getRaza()
        +"\nEdad: " +p1.getEdad()
        +"\nColor: " +p1.getColor());
        
        System.out.println("\nRaza: " + p2.getRaza()
        +"\nEdad: " +p2.getEdad()
        +"\nColor: " +p2.getColor());
        
        
        
    }
}
