/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD6_4_Iterator_Hashset_Hashmap;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Juan Carlos
 */
public class hashset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Nuevo HastSet tipo departamento 
        HashSet<Departamento> hs = new HashSet<Departamento>();
         
        //Creamos un objeto de la clase departamento
        Departamento dp1 = new Departamento(1, "Jefatura", 12, "Granada");
        Departamento dp2 = new Departamento(2,"RRHH", 4,"Granada");
        //añadimos al ArrayList los objetos de departamento
        hs.add(dp1);
        hs.add(dp2);
        hs.add(dp2);
        hs.add(dp2);
        
        //Transformamos a iterator
         Iterator it = hs.iterator();
        Departamento d = new Departamento();
        
        while (it.hasNext()) {
            d = (Departamento)it.next();
            System.out.println("Departamento: "+ d.getNombre() + " localizacion: " + d.getLocalizacion() + " con el numero de empleados de: " + d.getNumeroEmpleados());
            
        }
        
    }
    
}
