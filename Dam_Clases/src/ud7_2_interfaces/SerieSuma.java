/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD7_2_Interfaces;

/**
 *
 * @author Juan Carlos
 */
public class SerieSuma implements ISerie{
    private int numero;
    private int numerComienzo;
    
    public int getSiguiente(){
        this.numero++;
        return this.numero;
    }
    public void reiniciar(){
        this.numero =numerComienzo;
    }
    public void setComenzar(int x){
        this.numerComienzo = x;
        this.numero = x;
    }
    
    public int getAnterior(){
        this.numero--;
        return this.numero;
    }
}
