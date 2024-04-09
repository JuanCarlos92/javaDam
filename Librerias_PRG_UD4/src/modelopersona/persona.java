package modelopersona;

/**
 *
 * @author Juan Carlos
 */
public class persona {
    private String dni;
    private String nombre;
    private String direccion;
    private String telefono;

    //Constructores
    public persona() {
    }
    public persona(String dni, String nombre, String direccion, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    //metodos get y set
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setDni(String dni){
        this.dni = dni;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String indicarTipoPersona(String dni, String nombre, String direccion, String telefono){
        
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        
        if (dni.length()> 9) {
            return "El dni es erroneo, intentalo de nuevo";
        }
        return "Esta persona tiene como DNI" + this.dni + "se llama " + this.nombre + " vive en  " + this.direccion + "su numero de telfono es el " + this.telefono;
    }
    
    
}       
