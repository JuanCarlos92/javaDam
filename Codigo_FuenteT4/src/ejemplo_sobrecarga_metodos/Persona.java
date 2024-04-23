
package ejemplo_sobrecarga_metodos;

public class Persona {
    
    String nombre;
    String apellidos;
    
    public Persona(String nombre, String apellidos){  // Constructor
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    // Método para saludar en general
    public void saludar(){
        System.out.println("Hola!\n");
    }
    
    // Método para saludar a una persona que se conoce
    public void saludar(String nombre_persona){
        System.out.println("Hola " + nombre_persona + "!\n");
    }
    
    // Método para saludar tantas veces como personas haya
    public void saludar(int num_personas){
        for(int i = 0; i < num_personas; i++){
            System.out.println("Hola!");
        }
    }
}

