
package javaapplication25;

import java.lang.String;

public class JavaApplication25 {

    public static void main(String[] args) {
        
        Coche miCoche = new Coche(); // Creación de un objeto de la clase coche
        String a;
        miCoche.cambiarColor("azul"); // Uso de método con paso de variables
        miCoche.mostrarColor(); // Uso de un método
        miCoche.sonarClaxon(); // Uso de un método.
        miCoche.cambiarColor("rojo"); // Uso de método con paso de variables
    }
    
}

