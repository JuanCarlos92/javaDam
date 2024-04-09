/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD3_3_for;

/**
 *
 * @author Juan Carlos
 */
public class tabla {
    private int numero;

    public tabla(int numero) {
        this.numero = numero;
    }
    
    public tabla(){
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int multiplicar(int num1 , int num2){
        return num1*num2;
    }
    //Imprimir una tabla de multiplicar (de un número dado).
    public void multiplicarTabla(int tabla){
        for (int i = 0; i <= 10; i++) {
            System.out.println(i * tabla);   
        }
    }
    //Imprimir todas las tablas de multiplicar del 1-10 
    public void multiplicarTodasLasTablas(){
        for (int i = 0; i <= 10; i++) {
            System.out.println("TABLA DEL " + i);
            for (int j = 0; j <=10; j++) {
                System.out.println(i + " x " + j + " = " + i*j);  
            }  
        }
    }
    //Programa que imprima los primeros 20 términos de la serie de Fibonacci
    public void Fibbonachi() {
        int anterior = 0;
        int posterior = 1;
        int termino;

        for (int i = 0; i <= 20; i++) {
            termino = anterior + posterior;

            System.out.println(termino);
            anterior = posterior;
            posterior = termino;
        }
    }
    //Comprobar si un número dado es primo o no
    public void PrimoNoprimo(int num){
        if (num %  2==0) {
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
    }
    // imprimir un rectángulo
    public void rectangulo(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }
    }
}
