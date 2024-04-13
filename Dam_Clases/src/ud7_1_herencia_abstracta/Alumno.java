/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD7_1_HerenciaAbstracta;

/**
 *
 * @author Juan Carlos
 */
public class Alumno extends Persona {

    private String curso;

    public Alumno(String curso, String nombre, String dni) {
        super(nombre, dni);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void mensaje() {
        System.out.println("Soy un alumno");
    }
}
