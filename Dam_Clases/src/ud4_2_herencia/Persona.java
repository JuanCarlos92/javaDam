/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud4_2_herencia;

/**
 *
 * @author Juan Carlos
 */
public class Persona {
    //DNI, nombre, direccion, telefono
    
    protected String DNI;
    protected String nombre;
    protected String direccion;
    protected String telefono;

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    //Constructores de la clase
    
    public Persona(){
        
    }

    public Persona(String DNI, String nombre, String direccion, String telefono) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    public String indicaEltipo(String nombre){
        this.nombre = nombre;
        return this.nombre+ " ,Tipo Persona";
    }
    
}
