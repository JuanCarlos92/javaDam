/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD3_3_for;

/**
 *
 * @author Juan Carlos
 */
public class Ud3_3 {

    public static void main(String[] args) {
        //Pregunta de examen sencilla
        //1. Imprimir una tabla de multiplicar

        tabla obj = new tabla();
        obj.multiplicarTabla(2);
        int multiplicacion = obj.multiplicar(100, 100);

        System.out.println(multiplicacion);

        obj.multiplicarTodasLasTablas();
        obj.Fibbonachi();
        obj.PrimoNoprimo(6);
        obj.rectangulo();
        
    }

}
