package ejemplo_implementacion_clase_triangulo_equilatero;

public class TrianguloEquilatero{
    
    /***   ATRIBUTOS   ***/
    private double lado;
    private final static int num_lados = 3;
    
    /***   CONSTRUCTORES   ***/
    TrianguloEquilatero(){
        lado = 1.0;
    }
    
    TrianguloEquilatero(double lado){
        if(lado > 0)
            this.lado = lado;
        else
            this.lado = 1.0;
    }    
    
    /***   MÉTODOS   ***/
    public double getLado(){
        return lado;
    }

    public void setLado(double l){
        if(lado > 0)
            lado = l;
    }
    
    public static int getNumLados(){
        return num_lados;
    }

    public double perimetro(){
        return 3*lado;
    }
}
