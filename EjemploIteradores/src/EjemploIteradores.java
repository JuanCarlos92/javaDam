
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class EjemploIteradores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista_enteros = new ArrayList<Integer>();
        lista_enteros.add(5);
        lista_enteros.add(9);
        lista_enteros.add(3);
        lista_enteros.add(7);
        lista_enteros.add(8);

        Iterator it = lista_enteros.iterator();
        Integer elemento_actual;

        while (it.hasNext()) {

            elemento_actual = (Integer) it.next();

            if (elemento_actual % 2 != 0) {
                it.remove();
            } else {
                System.out.println(elemento_actual);
            }
        }

        System.out.println("El tamaño actual de la colección es: "
                + lista_enteros.size());
    }

}
