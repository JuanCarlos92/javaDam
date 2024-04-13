package U2_08_SolucionAnimales;

public class Perros {
  private String raza = null;
  private Integer edad = null;
  private String color = null;

  public Perros() { }
  
  public Perros(String raza, int edad, String color){
    this.raza = raza;
    this.edad = edad;
    this.color = color;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public Integer getEdad() {
    return edad;
  }

  public void setEdad(Integer edad) {
    this.edad = edad;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}




