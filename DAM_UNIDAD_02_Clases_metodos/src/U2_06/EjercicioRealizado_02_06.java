/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package U2_06;

/**
 *
 * @author Usuario
 */
public class EjercicioRealizado_02_06 {

    public static void main(String[] args) {
         String cadena = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivia un hidalgo de los de lanza en astillero, adarga antigua, rocin flaco y galgo corredor. Una olla de algo mas vaca que carnero, salpicon las mas noches, duelos y quebrantos los sabados, lantejas los viernes,";
         
         
         cadena= cadena.replace("a", "e");
         System.out.println("""
                            ----Cadena reemplazando 'a' por 'e' ------
                            """ + cadena + "\n");
         cadena= cadena.substring(0,30);
         System.out.println("""
                            ----Mostrar los '30 primeros caracteres' ------
                            """ + cadena + "\n");
         
         cadena= cadena.replaceAll("de", "");
         System.out.println("""
                            ----Eliminando 'de' de la cadena ------
                            """ + cadena + "\n");
         

         if(cadena.contains("que")){
             System.out.println("La cadena SI contiene la palabra: 'que'");
         }else{
             System.out.println("La cadena NO contiene la palabra: 'que'");
         }
         
         cadena= cadena.toUpperCase();
         System.out.println("""
                            ----Toda la cadena en mayusculas ------
                            """ + cadena + "\n");
         
    }
}
