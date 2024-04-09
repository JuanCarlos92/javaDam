/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Juan Carlos
 */
public class Persona{
    
    //Atributos privado nombre y edad 
    /*
    Estan creados privado porque así lo indica la tarea pero si va camarero 
    va a heredar de persona lo veo mas aconsejable ponerlo protected. Estando privado 
    solo podrá acceder mediante metodos set y get
    */
    private String nombre;
    private int edad;

    //Constructores
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Persona() {
    }
    
    //Metodos setter y getter
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
    }

}
