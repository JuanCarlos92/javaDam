/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package U2_03;

/**
 *
 * @author Juan Carlos
 */
public class Ejercicio_U2_03 {

    public static void main(String[] args) {
       coche c=new coche();
       
       c.setColor("Negro");
       c.setMarca("Renault");
       c.setVelocidad(200);
       
       System.out.println("El coche " + c.getMarca()+ " de color " + c.getColor() +" va a una velocidad de " + c.getVelocidad());
        
       c.aumentarvelocidad();
       c.aumentarvelocidad();
       c.aumentarvelocidad();
       
       System.out.println("El coche " + c.getMarca()+ " de color " + c.getColor() +" va a una velocidad de " + c.getVelocidad());
       
       c.disminuirvelocidad();
       c.disminuirvelocidad();
       c.disminuirvelocidad();
       c.disminuirvelocidad();
       c.disminuirvelocidad();
       c.disminuirvelocidad();
       c.disminuirvelocidad();
       
       System.out.println("El coche " + c.getMarca()+ " de color " + c.getColor() +" va a una velocidad de " + c.getVelocidad());
       
      
    }
}
