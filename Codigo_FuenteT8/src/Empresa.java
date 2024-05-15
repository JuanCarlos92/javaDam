public class Empresa {
    //Atributos de la Clase
    private String nombre;
    private String campo;
    private String[] telefono;
    private String direccion;

    //Constructores
    public Empresa() {
        this.nombre=null;
        this.campo=null;
        this.telefono=null;
        this.direccion=null;
    }
    public Empresa(String nombre, String campo, 
            String[] tlfn, String dir){
        this.nombre=nombre;
        this.campo=campo;
        this.telefono=tlfn;
        this.direccion=dir;
    }
    //Métodos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCampo() {
        return campo;
    }
    public void setCampo(String campo) {
        this.campo = campo;
    }
    public String[] getTelefono() {
        return telefono;
    }
    public void setTelefono(String[] telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
