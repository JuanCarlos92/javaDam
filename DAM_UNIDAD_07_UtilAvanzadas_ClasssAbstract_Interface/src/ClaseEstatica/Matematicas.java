/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseEstatica;

import java.util.ArrayList;

/**
 *
 * @author Juan Carlos
 */
public final class Matematicas {

    public static double MaxArray(ArrayList<Double> array) {
        //Asigna un valor MINIMO a la variable
        double max = -10000000;

        //Recorre el array y SI ARRAY.GET es MAYOR a max.. max = array
        for (int i = 0; i < array.size(); i++) {
            if (max < array.get(i)) {
                max = array.get(i);
            }
        }

        return max;
    }

    public static double MinArray(ArrayList<Double> array) {
        //Asigna un valor MAXIMO a la variable
        double min = 10000000;

        //Recorre el array y SI ARRAY.GET es MENOR a min.. min = array 
        for (int i = 0; i < array.size(); i++) {
            if (min > array.get(i)) {
                min = array.get(i);
            }
        }

        return min;
    }

    public static double SumArray(ArrayList<Double> array) {
        //Asigna 0 a la variable
        double sum = 0;

        //Recorre el array y SE VA SUMANDO CADA VUELTA AGREGANDOLO A sum
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);

        }
        return sum;
    }
}
