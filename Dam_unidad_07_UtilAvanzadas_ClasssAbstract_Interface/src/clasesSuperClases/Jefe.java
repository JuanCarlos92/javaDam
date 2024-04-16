/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesSuperClases;

/**
 *
 * @author Juan Carlos
 */
public class Jefe extends Empleado {

    private double presupuesto;
    private static int numeroDeJefes = 0;

    public Jefe(int idEmpleado, String nombre,
            double sueldo, double presupuesto) {
        super(idEmpleado, nombre, sueldo);
        this.presupuesto = presupuesto;

        numeroDeJefes++;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public static int getNumJefes() {
        return numeroDeJefes;
    }

    public void asignarPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
}
