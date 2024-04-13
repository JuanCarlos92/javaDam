/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud4_1_implementacion_clases;
import modelopersonas.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Juan Carlos
 */
public class Ud4_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    String dni = JOptionPane.showInputDialog("Introduce DNI");
    String nombre = JOptionPane.showInputDialog("Introduce Nombre");
    String direccion = JOptionPane.showInputDialog("Introduce Direccion");
    String telefono = JOptionPane.showInputDialog("Introduce Telefono");
    
    persona persona1 = new persona(dni,nombre,direccion,telefono);
        System.out.println(dni + ", " + nombre + ", " + direccion + ", " + telefono);
    }
}
