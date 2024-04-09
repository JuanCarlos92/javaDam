/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U2_04;

/**
 *
 * @author Juan Carlos
 */
public class Ejercicio_U2_04 {

    public static void main(String[] args) {
      Alumnos al = new Alumnos();
      
      Alumnos.masAlumnos();
      al.setNombre("Julian");
      al.setNota(8);
      
      Alumnos al2 = new Alumnos();
      
      Alumnos.masAlumnos();
      al2.setNombre("Carmen");
      al2.setNota(6);
      
        System.out.println("Nombre del alumno 1: " + al.getNombre());
        System.out.println("Nota del alumno 1: " + al.getNota());
        System.out.println("Nombre del alumno 2: " + al2.getNombre());
        System.out.println("Nota del alumno 2: " + al2.getNota());
        System.out.println("Numero total de alumnos hasta el momento: " + Alumnos.getnumAlumnos());
    }
    
}
