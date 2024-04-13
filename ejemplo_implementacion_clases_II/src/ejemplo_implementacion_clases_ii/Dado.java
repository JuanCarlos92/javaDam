package ejemplo_implementacion_clases_ii;

import java.util.Random;

public class Dado {
    /*** ATRIBUTOS ***/
    private int numeros_lados; 
    private int ult_lanzamiento;  // valor del ultimo lanzamiento
    
    /*** CONSTRUCTORES ***/
    public Dado(){ //constructor por defecto
        numeros_lados = 6;
        ult_lanzamiento = 0;
    }
    
    public Dado(int num){ //constructor por parámetro
        numeros_lados = num;
        ult_lanzamiento = 0;
    }
    /*** MÉTODOS ***/
    public int getNumLados() {
        return numeros_lados;
    }

    public int getUltLanzamiento() {
        return ult_lanzamiento;
    }
    
    public void setNumLados(int num) {
        numeros_lados = num;
    }

    public int lanzarDado() {
        Random r = new Random(); 
        ult_lanzamiento = r.nextInt(numeros_lados)+1;
        return ult_lanzamiento;      
    }  
}


