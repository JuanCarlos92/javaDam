/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasejuancarlosfiltermartin;

/**
 *
 * @author Juan Carlos
 */
public class NombreApellidos {
    //atributos privado nombre y edad
    private String nombre;
    private int edad;
    
    //Constructor sin parámetros 
     public NombreApellidos(){
     }
    //Constructor con parámetros
    public NombreApellidos(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        if((edad<0) || (edad >100)){
            this.edad = 0;
            this.nombre = "PERSONA ERRONEA";
        }
    }
    
    //metodo estatico get llamado ayuda
    static public String Ayuda(){
        return "Esta clase permite crear personas con un nombre y una edad";
    }
    //getter y setter de los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
        if((edad<0) || (edad >100)){
            this.edad = 0;
            this.nombre = "PERSONA ERRONEA";
        }
    }
}
