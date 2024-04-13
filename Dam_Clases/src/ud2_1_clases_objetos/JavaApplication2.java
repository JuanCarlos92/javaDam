/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud2_1_clases_objetos;

/**
 *
 * @author Juan Carlos
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v = 0;
        int v1 = 0;
        Contador c = new Contador();
        Contador c1 = new Contador();

        v = c.incrementar();
        v1 = c1.decrementar();

        System.out.println("Contador 1 " + v);
        System.out.println("Contador 2 " + v1);

        v = c.incrementar();
        v1 = c1.decrementar();
        System.out.println("Contador 1 " + v);
        System.out.println("Contador 2 " + v1);
    }

}
