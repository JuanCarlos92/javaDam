/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class While_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=4, b=10;  // a tiene que ser menor o igual que b
        int suma=0; // Variable donde vamos a acumular el resultado 
        int numIteraciones=0;  // Variable donde vamos a acumular el nº de iteraciones 
        
        // Calcular los múltiplos de 5 entre a y b 
        int valorActual = a;
        
        while(valorActual<=b){
            if(valorActual%5==0){
                suma=suma+valorActual; 
            }
            
            valorActual++;
            numIteraciones++;
        }

        System.out.println("El valor de la suma de los multiplos de 5 entre " + a +
            " y " + b + " es " + suma);
        System.out.println("Las iteraciones necesarias para calcularlo han sido " +
           numIteraciones); 
    }
    
}
