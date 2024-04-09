/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U2_04_Solucion;

import U2_04_Solucion.alumnos;

/**
 *
 * @author FOC
 */
public class EjercicioResuelto_03_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        alumnos a1 = new alumnos ();
        alumnos.incrementarnumAlumnos();
        a1.setNombre("pepe");
        a1.setNota(7);
        
        alumnos a2 = new alumnos ();
        alumnos.incrementarnumAlumnos();
        a2.setNombre("Lola");
        a2.setNota(9);
        
        System.out.println("Nombre del alumnmo 1 - " + a1.getNombre());
        System.out.println("Nota del alumno 2 - " + a2.getNota());
        System.out.println("Número de alumnos hasta el momento - " + alumnos.getnumAlumnos());
        
    }
    
}
