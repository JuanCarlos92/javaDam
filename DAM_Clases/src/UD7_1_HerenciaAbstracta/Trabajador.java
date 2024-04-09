/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD7_1_HerenciaAbstracta;

/**
 *
 * @author Juan Carlos
 */
public abstract class Trabajador extends Persona {

    //Atrbutos
    protected float sueldo;
    
    //Constructores
    public Trabajador(float sueldo, String nombre, String dni) {
        super(nombre, dni);
        this.sueldo = sueldo;
    }
    
    //Getter y setter
    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    //Metodo abstractos
    abstract public void mensaje();

    abstract public float calculosueldo();
}
