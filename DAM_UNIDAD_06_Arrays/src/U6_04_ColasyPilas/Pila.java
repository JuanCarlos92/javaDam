/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U6_04_ColasyPilas;

/**
 * Pila
 */
public class Pila {

    //Máximo número de elementos a insertar en la pila
    private int numElementos;
    //Array donde se insertan los elementos *
    private int elementos[];
    //Referencia al último elemento insertado.
    private int indice;

    //--CONSTRUCTOR--
    //Inicalización de la pila
    Pila(int numElementos) {
        this.numElementos = numElementos;
        indice = -1;
        elementos = new int[numElementos]; // Creamos el array
    }

    //--METODOS--
    //Indica si la pila está vacia
    public boolean vacia() {
        return (indice == -1);
    }

    //Indica si la pila está llena
    public boolean llena() {
        return (indice == numElementos - 1);
    }

    //Inserta un elemento en la pila
    public void apilar(int elemento) {
        indice++;
        elementos[indice] = elemento;
    }

    //Saca un elemento de la pila.
    public int desapilar() {
        int elemento = elementos[indice];
        indice--;
        return elemento;
    }

    //Devuelve el número de elementos que tiene la pila
    public int numElementos() {
        return indice + 1;
    }

    //Imprime los elementos de la pila
    public void imprimir() {
        for (int i = 0; i <= indice; i++) {
            System.out.print(elementos[i] + "-");
        }
        System.out.println();
    }
}
