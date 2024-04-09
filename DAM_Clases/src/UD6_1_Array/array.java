/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD6_1_Array;

/**
 *
 * @author Juan Carlos
 */
public class array {

    private int vector[];
    private int tamano;

    public array(int vector[]) {
        this.vector = vector;
    }

    public array() {
    }

    public array(int tamano) {
        this.tamano = tamano;
        this.vector = new int[tamano];
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public void imprimirElemento() {
        //
        for (int i = 0; i < this.vector.length; i++) {
            System.out.println("El elemento en la posicion " + i + " del array es: " + vector[i]);
        }
    }

    public void anadir(int elemento, int posicion) {

        //Creamos un array auxiliar(copia) igual al vector+1 
        int[] auxiliar = new int[this.vector.length + 1];

        //Posicion de la 0 a la indicada
        //y recorremos de la posicion 0 hasta la posicion indicada
        for (int i = 0; i < posicion; i++) {
            auxiliar[i] = this.vector[i];
        }
        //Introducimos lo que vale elemento en la posicion
        auxiliar[posicion] = elemento;

        //Posicion de la indicada +1 hasta la ultima del vector
        //y creamos el resto de posiciones
        for (int i = posicion + 1; i <= this.vector.length; i++) {
            auxiliar[i] = this.vector[i - 1];
        }

        //Volcamos el auxiliar en el vector.
        this.vector = auxiliar;

    }
}
