/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcfm.modelo;

/**
 *
 * @author Juan Carlos
 */
public class Articulos {

    //ATRIBUTOS DE CLASE
    private int codigo;
    private String nombre;
    private int cantidad;
    private String descripcion;

    //CONSTRUCTOR CON PARAMETROS
    public Articulos(int codigo, String nombre, int cantidad, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    //CONSTRUCTOR VACÍO
    public Articulos() {

    }

    //METODO GETTERS Y SETTERS
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
