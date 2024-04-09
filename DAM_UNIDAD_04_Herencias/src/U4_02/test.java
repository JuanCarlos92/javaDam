/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U4_02;


/**
 *
 * @author Juan Carlos
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       clasePersona p1 = new clasePersona();
       clasePersona p2 = new clasePersona("manuel", 50);
       
        System.out.println("Nombre de la 1ra persona " + p1.getNombre() + " y edad " + p1.getEdad());
        System.out.println("Nombre de la 2da persona " + p2.getNombre() + " y edad " + p2.getEdad());
        
        p1.setNombre("Juan");
        p1.setEdad(35);
        System.out.println("Nombre de la 1ra persona " + p1.getNombre() + " y edad " + p1.getEdad());
        
        
    }
    
}
