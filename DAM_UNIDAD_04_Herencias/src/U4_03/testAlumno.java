/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U4_03;

/**
 *
 * @author Juan Carlos
 */
public class testAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Alumno a1 = new Alumno();
       Alumno a2 = new Alumno(8,"manuel", 50);
       
        System.out.println("Nombre de la 1ra persona " + a1.getNombre() + " y edad " + a1.getEdad () + " y la nota es : " +a1.getNota());
        System.out.println("Nombre de la 2da persona " + a2.getNombre() + " y edad " + a2.getEdad() + " y la nota es : " +a2.getNota());
        
        a1.setNombre("Juan");
        a1.setEdad(35);
        a1.setNota(5);
        System.out.println("Nombre de la 1ra persona " + a1.getNombre() + " y edad " + a1.getEdad() + " y la nota es : " +a1.getNota());
    }
    
}
