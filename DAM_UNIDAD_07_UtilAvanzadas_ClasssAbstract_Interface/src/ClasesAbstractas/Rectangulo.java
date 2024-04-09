/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesAbstractas;

/**
 *
 * @author Juan Carlos
 */
public class Rectangulo extends FiguraGeometrica{
    //atributos
    private double base;
    private double altura;
    
    //constructor
    public Rectangulo(double largo, double ancho){
        super("Rectangulo");
        this.base = largo;
        this.altura = ancho;
    }
    
    public double area(){
        return this.base * this.altura;
    }
}
