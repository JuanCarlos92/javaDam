/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManejoHerencia2;

/**
 *
 * @author Juan Carlos
 */
public class Profesor extends Persona{
    private String asignaturaImpartida = "";

    public Profesor(String nombre, String dni, String asignatura) {
        super(nombre, dni);
        this.asignaturaImpartida= asignatura;
    }

    public Profesor(String nombre, String dni) {
        super(nombre, dni);
    }
    

    public String getAsignaturaImpartida() {
        return asignaturaImpartida;
    }

    public void setAsignaturaImpartida(String asignaturaImpartida) {
        this.asignaturaImpartida = asignaturaImpartida;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getDni() {
        return dni;
    }

    @Override
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
    
}
