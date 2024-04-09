/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U2_07;

/**
 *
 * @author Usuario
 */
public class persona {
    private String nombre, dni;
    private int edad;
    
    public persona(){
    }
    public persona(String nombre, String dni, int edad ){
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;  
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void aumentarEdad(int incremento){
        this.edad=+incremento;
    }
    public void disminuyeEdad(int decremento){
        this.edad=-decremento;
    }
}
