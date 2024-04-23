
package usoclasestring;
import java.lang.String; // importamos la clase String

public class UsoClaseString { 

    public static void main(String[] args) {
        
        // Creamos un objeto de la clase String
        String cadena = "Hola mundo!!!"; 
        
        // Obtenemos la longitud de la cadena y la imprimimos
        int tam = cadena.length();
        System.out.println("La longitud de la cadena es:  " + tam);
        
        // Devuelve el caracter en la posición 3
        char c = cadena.charAt(3);
        System.out.println("El caracter en la posición 3 es:  " + c);        
        
        // Obtener substring de la posicion 1 a 3
        // Recordad que substring devuelve hasta 3-1 = 2
        String subcadena = cadena.substring(1,3);
        System.out.println("La subcadena desde 1 a 3 es:  " + subcadena);  
        
        // Concatenar World!!!!! al String Hello
        String cadena2 = "Hello ";
        cadena2 = cadena2.concat("World!!!!!");
        System.out.println("Resultado de la concatenación:  " + cadena2);  
    }
}
