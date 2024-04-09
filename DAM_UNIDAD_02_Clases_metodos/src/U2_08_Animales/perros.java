/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U2_08_Animales;

/**
 *
 * @author Usuario
 */
public class perros {
    private String raza, color;
    private int edad;
    
    public perros(){
        
    }
    
    public perros(String raza, String color, int edad){
        this.color = color;
        this.raza = raza;
        this.edad = edad;
    }
    
    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza= raza;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color= color;
    }
    
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
   
}
