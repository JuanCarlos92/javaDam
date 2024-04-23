
package javaapplication25;

public class Coche {
    
    private String matricula;  // Atributo que indica la matricula del coche
    private String marca;   // Atributo que indica la marca del coche
    private String modelo;  // Atributo que indica el modelo del coche
    private String color;   // Atributo que indica el color del coche
    private int numero_puertas; // Atributo que indica el numero de puertas
    private int anios;  // Atributo que indica el numero de años del cohe
    
    /*** Método para hace que suene el claxón ***/
    public void sonarClaxon(){
       System.out.println("piiiiii!!!!! piiiii!!!!");    
    }
    
    /*** Método que imprime por pantalla el color del coche ***/
    public void mostrarColor(){
       System.out.println("El color actual del coche es: " + color); 
    }
    
    /*** Método que permite cambiar el color del coche ***/
    public void cambiarColor(String nuevoColor){
       color = nuevoColor; 
    }
      
}

