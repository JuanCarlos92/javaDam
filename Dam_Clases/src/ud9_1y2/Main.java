/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud9_1y2;

/**
 *
 * @author Juan Carlos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConectorBaseDatos cn = new ConectorBaseDatos();

        int resultado = cn.altas("Rocio", "Sanchez");
       //Alta
        System.out.println(resultado);

        //Mostrar
        //System.out.println(cn.mostrar());
        
        int i = cn.actualizar(1, "juaniti", "martinez");
        
        
        
    }

}
