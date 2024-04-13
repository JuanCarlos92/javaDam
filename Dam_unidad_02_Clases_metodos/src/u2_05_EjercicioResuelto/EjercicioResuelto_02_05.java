/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package U2_05_Solucion;

/**
 *
 * @author Juan Carlos
 */
public class EjercicioResuelto_02_05 {

    public static void main(String[] args) {
        String cadena = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, " +
                "no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, " +
                "rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, " +
                "duelos y quebrantos los sábados, lentejas los viernes, ....:";
        
        System.out.println ("La longitud de la cadena es: " + cadena.length());
        System.out.println ("La cadena <<de>> aparece por primera vez en la posición: " + cadena.indexOf("de"));
        System.out.println ("En la posición 100 de la cadena está el carácter: " + cadena.charAt(100));
        System.out.println ("Desde la posición 100 hasta el final está la cadena: " + cadena.substring(100));
        System.out.println ("La cadena resultante al sustituir todos los <<de>> por <<of>>: " + cadena.replace ("de","of"));
    }
}
