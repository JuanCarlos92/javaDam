/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesAbstractas;

/**
 *
 * @author Juan Carlos
 */
public abstract class FiguraGeometrica {
    //atributo
    private String nombre;
    
    //constructores
    public FiguraGeometrica(String nombre){
        this.nombre = nombre;
    }

    //metodos
    abstract public double area();
    
    final public boolean mayorQue (FiguraGeometrica otra){
        return this.area()>otra.area();
    }
    
    final public String toString(){
        return this.nombre +" con area " + this.area();
    }
}
