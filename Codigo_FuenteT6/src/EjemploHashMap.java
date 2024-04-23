

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {
        //String--> nombre, Integer--> telefono
        HashMap<String,Integer> agenda = new HashMap<String,Integer>(); 
        String nombre; //Clave
        int telefono; //Valor

        //Añadir elementos a la agenda
        nombre="Juan";
        telefono=612568945;
        agenda.put(nombre, telefono);//Se inserta Juan-->612568945
        nombre="Maria";
        telefono=639845216;
        agenda.put(nombre, telefono);//Se inserta Maria-->639845216
        nombre="Antonio";
        telefono=678945213;
        agenda.put(nombre, telefono);//Se inserta Antonio-->678945213
        nombre="Juan";
        telefono=666558756;
        //Se modifica el valor de Juan a Juan-->666558756
        agenda.put(nombre, telefono);

        //Mostrar los elementos de la agenda
        Iterator it = agenda.entrySet().iterator();
        Map.Entry<String,Integer> elemento_agenda;

        while(it.hasNext()){
            elemento_agenda=(Map.Entry<String,Integer>)it.next();
            System.out.println(elemento_agenda.getKey()+" "
                    +elemento_agenda.getValue());
        }
    }   
}


