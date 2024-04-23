

import java.util.HashSet;
import java.util.Iterator;

public class EjemploHashSet {
    public static void main(String[] args) {
        HashSet<Integer> lista_enteros = new HashSet<Integer>();
        lista_enteros.add(7);
        lista_enteros.add(9);
        lista_enteros.add(3);
        lista_enteros.add(7);
        lista_enteros.add(8);

        Iterator  it = lista_enteros.iterator();
        Integer elemento_actual;

        while(it.hasNext()){
            elemento_actual=(Integer) it.next();
            System.out.println(elemento_actual);       
        }
    }
}


