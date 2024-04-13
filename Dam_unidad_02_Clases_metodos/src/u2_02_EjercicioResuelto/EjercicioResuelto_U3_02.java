/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U2_02_Solucion;

/**
 * @author FOC
 */
public class EjercicioResuelto_U3_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        empleados e1 = new empleados();
        e1.setNombre("Pepe");
        e1.setDireccion("C/ la que sea, 23");
        e1.setPoblación("Granada");
        
        empleados e2 = new empleados();
        e2.setNombre("Felisa");
        e2.setDireccion("C/ Benitez Sanchez, 453");
        e2.setPoblación("Badajoz");
        
        System.out.println ("El nombre del primer empleado " + e1.getNombre() + " direccion  " + 
                e1.getDireccion() + " en la población de " + e1.getPoblación());
        
        System.out.println ("El nombre del segundo empleado " + e2.getNombre() + " direccion  " + 
                e2.getDireccion() + " en la población de " +  e2.getPoblación());
    }
    
}
