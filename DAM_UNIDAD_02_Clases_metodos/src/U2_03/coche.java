/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U2_03;

/**
 *
 * @author Juan Carlos
 */
public class coche {
    private String Marca ="";
    private String Color ="";
    private int Velocidad=0;
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public String getMarca() {
        return Marca;
    }

    public String getColor() {
        return Color;
    }

    public int getVelocidad() {
        return Velocidad;
    }
    public void aumentarvelocidad() {
        Velocidad ++;
    }
    public void disminuirvelocidad() {
        Velocidad --;
    }
    
}
