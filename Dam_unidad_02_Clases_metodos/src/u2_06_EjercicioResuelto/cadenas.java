package U2_06_Solucion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */

public class cadenas {

  public static void main(String[] args) {
    String cadena= "En un lugar de la Mancha, de cuyo nombre no "
      + "quiero acordarme, no ha mucho tiempo que vivía un hidalgo "
      + "de los de lanza en astillero, adarga antigua, rocín flaco"
      + " y galgo corredor. Una olla de algo más vaca que carnero, "
      + "salpicón las más noches, duelos y quebrantos los "
      + "sábados, lantejas los viernes,...";
    System.out.println("----Cadena original-----\n"+cadena
      +"\n");
    
    //Cambiar todas las "a" por "e"
    cadena = cadena.replace('a', 'e');
    System.out.println("----Cadena reemplazando 'a' por 'e'-----"
      + "\n"+cadena+"\n");
    
    //Mostrar los 30 primeros caracteres
    System.out.println("\n------30 primeros caracteres"
      +cadena.substring(0, 30)+"\n");
    
    //Eliminar de la cadena la palabra "de"
    cadena = cadena.replaceAll("de", "");
    System.out.println("----Eliminando 'de' de la cadena-----"
      + "\n"+cadena+"\n");
    
    //Buscar si existe la cadena "que"
    if(cadena.contains("que")){
      System.out.println("\n'que' si está en el texto\n");
    }
    else {
      System.out.println("\n'que' no está en el texto\n");
    }
    
   //Transformar toda la cadena a mayúsculas
    cadena = cadena.toUpperCase();
    System.out.println("----Convirtiendo la cadena en mayuscula-----"
      + "\n"+cadena+"\n");
  }
  
}
