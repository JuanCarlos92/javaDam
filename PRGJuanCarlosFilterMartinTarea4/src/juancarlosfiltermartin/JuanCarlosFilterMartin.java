package juancarlosfiltermartin;

import clases.*;
/**
 *
 * @author Juan Carlos
 */
public class JuanCarlosFilterMartin {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*-------PERSONA--------*/
    //Crear objeto persona sin parametros
    Persona p1 = new Persona();
    //Crear objeto persona con parametros
    Persona p2 = new Persona("JuanCarlos",31);
    //Agregar nombre y edad a p1
    p1.setNombre("Alfredo");
    p1.setEdad(29);
    //Mostrar datos de p1 y p2 (clase persona)
        System.out.println("Persona p1 : " + p1.getNombre() + " con una edad de: " + p1.getEdad());
        System.out.println("Persona p2 : " + p2.getNombre() + " con una edad de: " + p2.getEdad());
        
        /*-------CAMARERO--------*/
    //Crear objetos de la clase Camarero
    Camarero c1 = new Camarero();
    Camarero c2 = new Camarero(1600);
    Camarero c3 = new Camarero();
    Camarero c4 = new Camarero();
    
    //c1 set y get
    c1.setNombre("Maria");
    c1.setEdad(46);
    c1.setSueldo(1500);
    //c2 set y get
    c2.setNombre("Manuel");
    c2.setEdad(38);
    //c3 set y get
    c3.setNombre("Juan");
    c3.setEdad(40);
    c3.setSueldo(1300);
    //c4 set y get
    c4.setNombre("Estefania");
    c4.setEdad(32);
    c4.setSueldo(1400);
    //Mostrar datos de c1 c2 c3 c4 (clase camarero)
        System.out.println("Camarero c1 : " + c1.getNombre() + " con " + c1.getEdad()+ " años y un sueldo de : " + c1.getSueldo() +" euros");
        System.out.println("Camarero c2 : " + c2.getNombre() + " con " + c2.getEdad()+ " años y un sueldo de : " + c2.getSueldo() +" euros");
        System.out.println("Camarero c3 : " + c3.getNombre() + " con " + c3.getEdad()+ " años y un sueldo de : " + c3.getSueldo() +" euros");
        System.out.println("Camarero c4 : " + c4.getNombre() + " con " + c4.getEdad()+ " años y un sueldo de : " + c4.getSueldo() +" euros");
    //Mostrar cuantos camareros se han creado
        Camarero.contador();
    } 
}
