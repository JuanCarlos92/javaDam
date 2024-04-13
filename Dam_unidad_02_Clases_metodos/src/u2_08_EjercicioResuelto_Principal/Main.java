package U2_08_SolucionPrincipal;

import U2_08_SolucionAnimales.Perros;

public class Main {
  
  public static void main(String [] args){
    Perros p1 = new Perros("Raza1", 4, "Marron");
    Perros p2 = new Perros();
    p2.setRaza("Raza2");
    p2.setEdad(10);
    p2.setColor("Blanco");
    
    System.out.println("Perros: ");
    System.out.println("\nRaza: "+p1.getRaza()
      +"\nEdad: "+p1.getEdad()
      +"\nColor: "+p1.getColor());
    System.out.println("\nRaza: "+p2.getRaza()
      +"\nEdad: "+p2.getEdad()
      +"\nColor: "+p2.getColor());
  }
}


