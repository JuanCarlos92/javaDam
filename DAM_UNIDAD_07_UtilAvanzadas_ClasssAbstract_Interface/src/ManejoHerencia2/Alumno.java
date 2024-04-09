/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManejoHerencia2;

/**
 *
 * @author Juan Carlos
 */
public class Alumno extends Persona{
    private String curso ="";

    public Alumno(String nombre, String dni, String curso) {
        super(nombre, dni);
        this.curso = curso;
    }

    public Alumno(String nombre, String dni) {
        super(nombre, dni);
    }
    

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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
