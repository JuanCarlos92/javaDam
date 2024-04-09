package U2_07_Solucion;


public class persona {

  private String nombre = null;
  private String dni = null;
  private Integer edad = null;
  
  persona(){ }
  
  persona(String nombre, String dni, int edad){
    this.nombre = nombre;
    this.dni = dni;
    this.edad = edad;
  }
  
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  
  public String getNombre(){
    return this.nombre;
  }
  
  public void setDni(String dni){
    this.dni = dni;
  }
  
  public String getDni(String dni){
    return this.dni;
  }
  
  public void setEdad(int edad){
    this.edad = edad;
  }
  
  public int getEdad(){
    return this.edad;
  }
  
  public void aumentaEdad(int incremento){
    this.edad+=incremento;
  }
  
  public void disminuyeEdad(int decremento){
    this.edad -= decremento;
  }
}
