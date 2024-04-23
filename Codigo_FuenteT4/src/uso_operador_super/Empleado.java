/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uso_operador_super;

import java.util.Date;

/**
 *
 * @author pcr
 */
public class Empleado {
    private static final double SALARIO_BASE = 15000.00;
    private String nombre;
    private double salario;
    private Date fechaNacimiento;

    public Empleado(String nombre, double salario, Date FdeNac) {
            this.nombre = nombre;
            this.salario = salario;
            this.fechaNacimiento = FdeNac;
    }
    public Empleado(String nombre, double salario) {
            this(nombre, salario, null);
    }
    public Empleado(String nombre, Date FdeNac) {
            this(nombre, SALARIO_BASE, FdeNac);
    }
    public Empleado(String nombre) {
            this(nombre, SALARIO_BASE);
    }
    
    // más código referente a la implementación de la clase Empleado...
}
