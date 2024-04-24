/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud8_1_bd4o;

/**
 *
 * @author Juan Carlos
 */
public class Articulos {

    private int codigo;
    private String nombre;
    private int precio;
    private String Descripcion;

    public Articulos() {

    }

    public Articulos(int codigo, String nombre, int precio, String Descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.Descripcion = Descripcion;
    }

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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescricion() {
        return Descripcion;
    }

    public void setDescricion(String Descricion) {
        this.Descripcion = Descricion;
    }

}
