/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud2_3_paquete_objetos;

/**
 *
 * @author Juan Carlos
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Monedas d = new Monedas(10.0, "USD");
        System.out.println("Partimos de dolares");
        System.out.println("El resultado en dolares es " + d.getDolares());
        System.out.println("El resultado en libras es " + d.getLibras());
        System.out.println("El resultado en yenes es " + d.getYenes());
        d = null;
        System.gc();
        //System.out.println("El resultado en yenes es " + d.getYenes());

        Monedas y = new Monedas(2000.0, "JPY");
        System.out.println("Partimos de Yenes");
        System.out.println("El resultado en dolares es " + y.getDolares());
        System.out.println("El resultado en libras es " + y.getLibras());
        System.out.println("El resultado en yenes es " + y.getYenes());
        y = null;
        System.gc();

        Monedas l = new Monedas(200.0, "GBP");
        System.out.println("Partimos de Libras");
        System.out.println("El resultado en dolares es " + l.getDolares());
        System.out.println("El resultado en libras es " + l.getLibras());
        System.out.println("El resultado en yenes es " + l.getYenes());
        l = null;
        System.gc();
    }

}
