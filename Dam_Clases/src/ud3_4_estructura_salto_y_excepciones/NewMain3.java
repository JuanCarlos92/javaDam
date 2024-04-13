/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud3_4_estructura_salto_y_excepciones;

/**
 *
 * @author Juan Carlos
 */
public class NewMain3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "Hola que tal...";

        String resultado = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a') {
                continue;
            } else {
                resultado += cadena.charAt(i);
            }
        }
        System.out.println(resultado);
    }

}
