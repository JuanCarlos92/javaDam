/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juancarlosfiltermartintarea6;

/**
 *
 * @author Juan Carlos
 */
public class Producto {

    //ATRIBUTOS DE CLASE
    private String codigo;
    private String nombre;
    private String cantidad;
    private String descripcion;

    //CONSTRUCTOR CON PARAMETROS
    public Producto(String codigo, String nombre, String cantidad, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    //CONSTRUCTOR VACÍO
    public Producto() {
    }

    //METODO GETTERS Y SETTERS
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "->Codigo:  " + codigo + System.lineSeparator()
                + "->Nombre:  " + nombre + System.lineSeparator()
                + "->Cantidad:  " + cantidad + System.lineSeparator()
                + "->Descricción:  " + descripcion + System.lineSeparator();
    }

}
