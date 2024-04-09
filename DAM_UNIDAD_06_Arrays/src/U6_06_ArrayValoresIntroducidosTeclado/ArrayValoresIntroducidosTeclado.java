/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U6_06_ArrayValoresIntroducidosTeclado;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan Carlos
 */
public class ArrayValoresIntroducidosTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Esto es opcional
        final int TAMANIO = 10;
        

        int num[] = new int[TAMANIO];

        //Invocamos las funciones
        rellenarArray(num);

        mostrarArray(num);
    }

    public static void rellenarArray(int lista[]) {
        int contador;
        for (int i = 0; i < lista.length; i++) {
            contador= i+1;
            String texto = JOptionPane.showInputDialog("Introduce el número [" + contador  +"]");
            lista[i] = Integer.parseInt(texto);
        }
    }

    public static void mostrarArray(int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("En el indice " + i + " esta el valor " + lista[i]);
        }

    }
}
