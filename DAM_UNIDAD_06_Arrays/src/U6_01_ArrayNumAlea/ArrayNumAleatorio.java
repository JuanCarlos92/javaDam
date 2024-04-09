/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U6_01_ArrayNumAlea;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ArrayNumAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array");
        num=sc.nextInt();
        
        int array[] =new int[num];
        
        //Llamamos a la función que genera los números aleatorios
        rellenarNumPrimoAlea(array, 1, 5000);
        mostrarArray(array);

        //Saco el primo mayor
        int primoMayor = mayor(array);
        System.out.println("El primo mas grande es el " + primoMayor);
        
        
        
    }
    
    //Metodo 
    public static void rellenarNumPrimoAlea(int array[], int numA, int numB){
        
        int i =0;
        while(i< array.length){
            //Genera un num alea entre A - B
            int num = ((int) Math.floor(Math.random() * (numA - numB) + numB));
             if (esPrimo(num)) {
                array[i] = num;
                i++;
                
            }
        }
    }
    public static boolean esPrimo(int num){
        int prueba;
        int contador=0;
        if (num <=1) {
            return false;
        }else{
            prueba =(int) Math.sqrt(num);
            
            for (;prueba > 1;  prueba --) {
                if (num%prueba==0) {
                    contador+=1;
                }
                
            }
        }
        return contador < 1;
    }
    public static void mostrarArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("En el indice " + i + " esta el valor " + array[i]);
        }
    }

    public static int mayor(int array[]) {
        int mayor = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
}
            
    
}
