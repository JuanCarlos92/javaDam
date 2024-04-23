/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implementacionInterface;

/**
 *
 * @author Juan Carlos
 */
public class PruebaValor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Acumulador p = new Acumulador(25);
        p.incremento(12);
        System.out.println(p.getValor());
    }

}
