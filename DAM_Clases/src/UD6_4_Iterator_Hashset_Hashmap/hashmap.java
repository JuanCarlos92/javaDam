/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD6_4_Iterator_Hashset_Hashmap;

import java.util.HashMap;

/**
 *
 * @author Juan Carlos
 */
public class hashmap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Nuevo HastMap tipo departamento 
        HashMap<Integer, Departamento> hm = new HashMap<Integer, Departamento>();
        HashMap<String, Departamento> hm1 = new HashMap<String, Departamento>();
        //Creamos un objeto de la clase departamento
        Departamento dp1 = new Departamento(1, "Jefatura", 12, "Granada");
        Departamento dp2 = new Departamento(2,"RRHH", 4,"Sevilla");
        //añadimos al ArrayList los objetos de departamento
        hm.put(dp1.getCodDepartamento(), dp1);
        hm.put(dp2.getCodDepartamento(), dp2);

        hm1.put(dp1.getNombre(), dp1);
        hm1.put(dp2.getNombre(), dp2);
        
        Departamento d = hm.get(2);
        
        Departamento d1 =  hm1.get("Jefatura");
        
        System.out.println(d.getNombre());
        System.out.println(d1.getLocalizacion());
    }
    
}
