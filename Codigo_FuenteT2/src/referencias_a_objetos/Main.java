/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package referencias_a_objetos;

/**
 *
 * @author Juan Carlos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Punto de entrada en la aplicación
        Racional r1, r2;
        r1 = new Racional(); //Crear un objeto racional
        r1.AsignarDatos(2, 5);
        r2 = r1;

        r1.AsignarDatos(3, 7);
        r1.VisualizarRacional(); //Se visualiza 3/7
        r2.VisualizarRacional(); //Se visualiza 3/7

        Racional r3;
        r2 = new Racional(); //Crear un objeto racional
        r2.AsignarDatos(2, 5);
        r3 = Racional.sumar(r1, r2); //r3 = 3/7 + 2/5
        r3.VisualizarRacional(); //Se visualiza el número 29/35    }

    }
}
