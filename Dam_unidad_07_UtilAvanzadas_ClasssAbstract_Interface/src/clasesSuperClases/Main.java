/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesSuperClases;

/**
 *
 * @author Juan Carlos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jefe luis = new Jefe(0, "Luis", 10000, 500000);
        Empleado pepe = new Empleado(3, "Pepe", 2500);
        Empleado lidia = new Empleado(5, "Lidia", 2500);

        System.out.print("ID: " + luis.getID() + "\nNombre: "
                + luis.getNombre() + "\nSueldo: " + luis.getSueldo()
                + "\nPresupuesto: " + luis.getPresupuesto()
                + "\nNumero de jefes: " + Jefe.getNumJefes()
                + " Numero de empleados: " + Jefe.getNumEmpleados() + "\n");
    }
}
