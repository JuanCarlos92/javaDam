public class Empresa {
    //Atributos de la Clase
    private String nombre;
    private String campo;
    private String telefono;
    private Direccion direccion;

    //Constructores
    public Empresa() {
        this.nombre=null;
        this.campo=null;
        this.telefono=null;
        this.direccion=null;
    }

    public Empresa(String nombre, String campo, 
            String tlfn, Direccion dir){
        this.nombre=nombre;
        this.campo=campo;
        this.telefono=tlfn;
        this.direccion=dir;
    }

    //Métodos
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCampo() {
        return this.campo;
    }
    public void setCampo(String campo) {
        this.campo = campo;
    }
    public String getTelefono() {
        return this.telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Direccion getDireccion() {
        return this.direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
