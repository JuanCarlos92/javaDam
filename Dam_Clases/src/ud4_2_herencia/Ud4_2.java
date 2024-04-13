/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud4_2_herencia;
import javax.swing.JOptionPane;
/**
 *
 * @author Juan Carlos
 */
public class Ud4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dni = JOptionPane.showInputDialog("Introduce el DNI");
        String nombre = JOptionPane.showInputDialog("Introduce el Nombre");
        String direccion = JOptionPane.showInputDialog("Introduce el Direccion");
        String telefono = JOptionPane.showInputDialog("Introduce el Telefono");
        String asignatura = JOptionPane.showInputDialog("Introduce la asignatura");
        
        Profesor profesorProgramacion = new Profesor(dni, nombre, direccion, telefono, asignatura);
        
        String tipo= profesorProgramacion.indicaEltipo(nombre);
        
        Persona persona1 = new Persona();
        String tipo2= persona1.indicaEltipo("Esto es una persona");
        
        System.out.println(tipo);
        System.out.println(tipo2);
        
    }
    
}
