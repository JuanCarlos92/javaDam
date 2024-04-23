

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploIteradores {
    public static void main(String[] args) {
        ArrayList<Integer> lista_enteros = new ArrayList<Integer>();
        lista_enteros.add(5);
        lista_enteros.add(9);
        lista_enteros.add(3);
        lista_enteros.add(7);
        lista_enteros.add(8);

        Iterator  it = lista_enteros.iterator();
        Integer elemento_actual;

        while(it.hasNext()){

            elemento_actual=(Integer) it.next();

            if(elemento_actual%2!=0){
                it.remove();
            }
            else{
                System.out.println(elemento_actual);
            }
        }

        System.out.println("El tamaño actual de la colección es: "
                +lista_enteros.size());
    }
}


