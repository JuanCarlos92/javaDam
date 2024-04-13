package ejerciciocomposicionclases;

public class Triangulo {
    Punto a;
    Punto b;
    Punto c;
    
    public Triangulo(){
        Punto a = new Punto();
        Punto b = new Punto();
        Punto c = new Punto();
    }
    
    public Triangulo(Punto a, Punto b, Punto c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public Punto getA(){
        return a;
    }
    
    public Punto getB(){
        return b;
    }
    
    public Punto getC(){
        return c;
    }
    
    public void desplazar(Punto a, Punto b, Punto c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
}
