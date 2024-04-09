package U2_05;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class string {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivia un hidalgo de los de lanza en astillero, adarga antigua, rocin flaco y galgo corredor. Una olla de algo mas vaca que carnero, salpicon las mas noches, duelos y quebrantos los sabados, lantejas los viernes,";
        System.out.println("La longitud de la cadena es de: " + cadena.length());
        System.out.println ("La cadena <<de>> aparece por primera vez en la posicion: " + cadena.indexOf("de"));
        System.out.println ("En la posicion 100 de la cadena esta el caracter: " + cadena.charAt(100));
        System.out.println ("Desde la posicion 100 hasta el final esta la cadena: " + cadena.substring(100));
        System.out.println ("La cadena resultante al sustituir todos los <<de>> por <<of>>: " + cadena.replace ("de","of"));
        
    }
    
}
