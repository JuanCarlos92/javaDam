/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD6_4_Iterator_Hashset_Hashmap;

/**
 *
 * @author Juan Carlos
 */
public class Departamento {
    //atributos de la clase
    private int codDepartamento;
    private String nombre;
    private int numeroEmpleados;
    private String localizacion;
    
    //constructores

    public Departamento(int codDepartamento, String nombre, int numeroEmpleados, String localizacion) {
        this.codDepartamento = codDepartamento;
        this.nombre = nombre;
        this.numeroEmpleados = numeroEmpleados;
        this.localizacion = localizacion;
    }

    public Departamento() {
    }
    
    //getters y setters

    public int getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(int codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
    
    
    
}
