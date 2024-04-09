/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD6_4_Iterator_Hashset_Hashmap;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Juan Carlos
 */
public class iterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Nuevo Arraylist tipo departamento 
        ArrayList <Departamento> al = new ArrayList<Departamento>();
        
        //Creamos un objeto de la clase departamento
        Departamento dp1 = new Departamento(1, "Jefatura", 12, "Granada");

        //añadimos al ArrayList los objetos de departamento
        al.add(dp1);
        al.add(new Departamento(2,"Recursos Humanos", 4,"Granada"));
        al.add(new Departamento(3,"Programacion", 2,"Granada"));
        
        //transforma el arraylist a un itarator el cual ya no importa que tipo de datos va a ser
        //(Nosotros queremos que ese iterator sea de tipo departamento)
        Iterator it = al.iterator();
        Departamento d = new Departamento();
        
        while (it.hasNext()) {
            d = (Departamento)it.next();
            System.out.println("Departamento: "+ d.getNombre() + " localizacion: " + d.getLocalizacion() + " con el numero de empleados de: " + d.getNumeroEmpleados());
            
        }
        
        
    }
    
}
