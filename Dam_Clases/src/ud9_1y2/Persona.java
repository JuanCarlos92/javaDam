/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud9_1y2;

/**
 *
 * @author Juan Carlos
 */
public class Persona {
    private int id_persona;
    private String nombre;
    private String apellidos;

    public Persona() {
    }

    public Persona(int id_persona, String nombre, String apellidos) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
}
