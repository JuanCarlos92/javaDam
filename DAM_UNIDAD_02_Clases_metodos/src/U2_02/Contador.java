/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U2_02;

/**
 *
 * @author Juan Carlos
 */
public class Contador {
    private int valor;
    
    //CONSTRUCTORES
    public Contador(){
        this.valor = 0;
        
    }
    // método setter y getter de la variable valor
    
    public int getValor(){
        return valor;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public int incrementar(){
        valor++;
        if(valor >100){
            this.valor = 0;
        }
        return valor;
    }
    public int decrementar(){
        valor--;
        if(valor < 0){
            this.valor = 100;
        }
        return valor;
    }
    
    
}