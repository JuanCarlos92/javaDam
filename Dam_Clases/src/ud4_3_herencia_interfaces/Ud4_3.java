
package ud4_3_herencia_interfaces;
import java.util.Scanner;

public class Ud4_3 {

   
    public static void main(String[] args) {
     
        //Clase Scanner
        Scanner lector = new Scanner(System.in);
        int numero = 0;
        
        System.out.println("Nombre:");
        String nombre = lector.nextLine();
        System.out.println("Numero1:");
        int numero1 = lector.nextInt();
        System.out.println("Numero2:");
        int numero2 = lector.nextInt();
        
        lector.close();
        
        System.out.println("Hola " + nombre + "  el numero 1 es " + numero1 + " el numero 2 es " + numero2);
        
        try {
            numero = numero1/numero2;
            System.out.println("Mi divisiones tiene un valor de: " + numero);
        } catch (Exception e) {
            System.out.println("Error al dividir " + e.getMessage());
        } finally {
            numero = 0;
            numero1 = 0;
            numero2 = 0;
            System.out.println("He reseteado el resultado");
        }
        
        System.out.println("Todo ha salido bien");
    }
    
}
