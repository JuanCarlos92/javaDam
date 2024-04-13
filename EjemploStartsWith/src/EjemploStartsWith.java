/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class EjemploStartsWith {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "La ALHAMBRA es muy bonita";
        String prefijo1 = "La MEZQUITA";
        String prefijo2 = "La ALHAMBRA";

        if (cadena.startsWith(prefijo1)) {
            System.out.println(cadena + " comienza por: " + prefijo1);
        } else if (cadena.startsWith(prefijo2)) {
            System.out.println(cadena + " comienza por: " + prefijo2);
        } else {
            System.out.println(cadena + " no comienza ni por: "
                    + prefijo1 + " ni por: " + prefijo2);
        }
    }

}
