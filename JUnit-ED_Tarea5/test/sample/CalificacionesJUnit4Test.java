/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package sample;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan Carlos
 */
public class CalificacionesJUnit4Test {
    
    public CalificacionesJUnit4Test() {
    }

    /**
     * Test of calificaciones method, of class Utils.
     */
    @Test
    public void testCalificaciones() {
        System.out.println("* JUnit4Test: testCalificaciones()");
        assertEquals(5, Calificaciones.calificaciones(3.5f, 2, true), 0.1);
        assertEquals(5.5, Calificaciones.calificaciones(3.5f, 2, false), 0.1);
        assertEquals(2.5, Calificaciones.calificaciones(2.5f, 0.5f, true), 0.1);
        assertEquals(-1, Calificaciones.calificaciones(-2,1, false), 0.1);
        assertEquals(-1, Calificaciones.calificaciones(8, 1, true), 0.1);
        assertEquals(-1, Calificaciones.calificaciones(1, -2, false), 0.1);
        assertEquals(-1, Calificaciones.calificaciones(1, 4, true), 0.1);
        
    }
    
}
