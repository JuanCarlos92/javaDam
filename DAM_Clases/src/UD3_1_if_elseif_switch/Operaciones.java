/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD3_1_if_elseif_y_switch;

import java.awt.BorderLayout;

/**
 *
 * @author Juan Carlos
 */
public class Operaciones {
    private int valor;
    private int a;
    private int b;
    
    //Constructores
    public Operaciones(int v){
        this.valor = v;
    }
    public Operaciones(int a, int b){
        this.a = a;
        this.b = b;
    }
    public Operaciones(int a, int b, int v){
        this.a = a;
        this.b = b;
        this.valor = v;
    }
    public Operaciones() {
    }
    
    //setter y getter
    public void SetValor(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    // Imprimir por pantalla si el valor de una variable predefinida es positivo onegativo.
    public void PositivoNegativo() {
        if (valor < 0) {
            System.out.println("Es negativo");

        } else {
            System.out.println("Es positivo");
        }
    }
    // Imprimir por pantalla si el valor de una variable predefinida es positivo o negativo o  cero.
    public void PositivoNegativoCero(){
        if (valor < 0) {
            System.out.println("Es negativo");
        }else if (valor ==0){
            System.out.println("Es 0");
            
        }else{
            System.out.println("Es positivo");
        }
    }
    //Imprimir por pantalla si el valor de una variable predefinida es positivo, negativo
    //o 0. En caso de que sea positivo, comprobar si ese valor es par o impar.
    public  void PositivoParImpar(){
        if (valor >0) {
            if (valor %2 == 0) {
                System.out.println("Es positivo y par");
                
            }else{
                System.out.println("Es positivo e impar");
            }
        }else if (valor <0 ){
            System.out.println("Es negativo");
        }else{
            System.out.println("Es 0");
        }
    }
    //Dado un número entero almacenado en una variable, determinar si se encuentra
    //en los intervalos [0,20] o (20,40] o (40,60] o (60,80]. Indicando mediante un
    //mensaje por pantalla en que intervalo se encuentra
    public void Intervalos(){
        if (valor < 0) {
            System.out.println("No se encuentra entre los intervalos [0,20] o (20,40] o (40,60] o (60,80]\n El valor introducido es: " + valor);  
        }else if (valor >=0 && valor<= 20) {
            System.out.println("intervalos [0,20]: " + valor);
        }else if (valor >=21 && valor<= 40) {
            System.out.println("intervalos [21,40]: " + valor);
        }else if (valor >=41 && valor<= 60) {
            System.out.println("intervalos [41,60]: " + valor);
        }else if (valor >=61 && valor<= 80) {
            System.out.println("intervalos [61,80]: " + valor);
        }else{
            System.out.println("No se encuentra entre los intervalos [0,20] o (20,40] o (40,60] o (60,80]\n El valor introducido es: " + valor);  
        }
    }
    public void menu(){
        switch (valor) {
            case 1:
                System.out.println("SUMAR:");
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case 2:
                System.out.println("RESTAR:");
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case 3:
                System.out.println("MULTIPLICAR:");
                System.out.println(a + " X " + b + " = " + (a * b));
                break;
            case 4:
                System.out.println("DIVIDIR:");
                System.out.println(a + " / " + b + " = " + (a / b));
                
            default:
                throw new Error();
        }
    }
    
}
