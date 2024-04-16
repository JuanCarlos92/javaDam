/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesSuperClases;

/**
 *
 * @author Juan Carlos
 */
public class Empleado {

    private final int idEmpleado;
    private final String nombre;
    private double sueldo;
    private static int numeroDeEmpleados = 0;

    public Empleado(int idEmpleado, String nombre, double sueldo) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.sueldo = sueldo;

        numeroDeEmpleados++;
    }

    public int getID() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public static int getNumEmpleados() {
        return numeroDeEmpleados;
    }

    public void aumentarSueldo(int porcentaje) {
        sueldo += sueldo * porcentaje / 100;
    }
}
