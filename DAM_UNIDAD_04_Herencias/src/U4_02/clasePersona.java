/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U4_02;

/**
 *
 * @author Juan Carlos
 */
public class clasePersona {
    private int edad;
    private String nombre;
    
    public clasePersona(){
        nombre="";
        edad=0;
    }
    public clasePersona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
