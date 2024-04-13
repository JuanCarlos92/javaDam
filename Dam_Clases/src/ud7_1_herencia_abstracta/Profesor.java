/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD7_1_HerenciaAbstracta;

/**
 *
 * @author Juan Carlos
 */
public class Profesor extends Trabajador{
    private String asignatura;

    public Profesor(String asignatura, float sueldo, String nombre, String dni) {
        super(sueldo, nombre, dni);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    
    
    @Override
    public void mensaje() {
        System.out.println("Soyt un profesor");
    }

    @Override
    public float calculosueldo() {
        return sueldo*5;
    }
    
}
