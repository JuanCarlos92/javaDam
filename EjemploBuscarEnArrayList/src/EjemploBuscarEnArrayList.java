
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Juan Carlos
 */
public class EjemploBuscarEnArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista_enteros = new ArrayList<Integer>();
        lista_enteros.add(5);
        lista_enteros.add(9);
        lista_enteros.add(3);
        lista_enteros.add(7);

        if (lista_enteros.contains(5)) {
            System.out.println("lista_enteros contiene el número: " + 5);
        } else if (lista_enteros.contains(7)) {
            System.out.println("lista_enteros contiene el número: " + 7);
        } else {
            System.out.println("lista_enteros NO contiene "
                    + "ni el número 5 ni el 7 ");
        }

        System.out.println("La posición del número 3 es: "
                + lista_enteros.indexOf(3));
    }

}
