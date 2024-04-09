/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Juan Carlos
 */
public class Camarero extends Persona{
    private double sueldo;
    //Variable Contador
    private static int camareroContador=0;
    
    //Constructores que aumente el numero de camarero
    public Camarero(){
        camareroContador++;
    }

    public Camarero(double sueldo){
        this.sueldo = sueldo;
        camareroContador++;
    }   
    
    //Metodo static para que imprima el numero de camarero
    public static void contador(){
        System.out.println("---> El numero de camarero es " + camareroContador + " <---");
    }

    //Metodo set y get sueldo
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
