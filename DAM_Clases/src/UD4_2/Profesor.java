/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD4_2;

/**
 *
 * @author Juan Carlos
 */
public class Profesor extends Persona{
    
    //variable private  Asignatura
    private String Asignatura;
    
    //set y get
    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }
    //Constructores
    
    public Profesor() {
    }

    public Profesor(String DNI, String nombre, String direccion, String telefono, String Asignatura) {
        super(DNI, nombre, direccion, telefono);
        this.Asignatura = Asignatura;
    }
    
    //sobreescritura del metodo indicar el tipo
    public String indicaEltipo(String nombre){
        this.nombre = nombre;
        return this.nombre+ " ,Tipo Profesor";
    }
}
