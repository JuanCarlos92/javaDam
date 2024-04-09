/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U4_04;

/**
 *
 * @author Juan Carlos
 */
public class test3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        claseChoche coche1 = new claseChoche();
        claseChoche coche2 = new claseChoche("Mercedes",40000, 180);
        
        coche1.setMarca("BMW"); coche1.setPrecio(70000); coche1.setCilindrada(260);
        
        System.out.println("La marca del coche1 es " + coche1.getMarca() + " con el precio de " + coche1.getPrecio() + " Euros y tiene una cilindrada de " + coche1.getCilindrada() + "CV");
        System.out.println("La marca del coche1 es " + coche2.getMarca() + " con el precio de " + coche2.getPrecio() + " Euros y tiene una cilindrada de " + coche2.getCilindrada() + "CV");
    }
    
}
