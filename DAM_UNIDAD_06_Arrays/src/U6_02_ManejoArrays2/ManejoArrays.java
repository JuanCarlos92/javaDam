/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package U6_02_ManejoArrays2;

/**
 *
 * @author Juan Carlos
 */
public class ManejoArrays {

    /**
     * @param args the command line arguments
     */
    //Realizar una aplicación para un array dado nos calcule los siguientes datos:
    //El mayor de todos los elementos del array
    //El menor de los elementos del array
    //El número de pares.
    //El número de impares.
    public static void main(String[] args) {
        int v []= {1,5,9,17,21,-4,0,-9,13,-7,-6,12,11,6,-9,-7,-3};
        System.out.println("Se va a calcular el elemento maximo y minimo de un array de tamaño: "+v.length);
        
        int elementoMaximo=0;
        int elementoMinimo=0;
        int pares=0;
        int impares=0;
        
        for(int i=0; i<v.length; i++){
            if(elementoMaximo>v[i]){
                elementoMaximo=v[i];
            }
            if(elementoMinimo<v[i]){
                elementoMinimo=v[i];
            }
            if ((v[i]%2)==0) {
		pares=pares+1;
            }
            else{
		impares = impares +1;
            }
        }
        System.out.println("El elemento máximo almacenado en el array es: " + elementoMaximo);
        System.out.println("El elemento mínimo almacenado en el array es: " + elementoMinimo);
	System.out.println("El número de pares almacenados en el array es: " + elementoMinimo);
	System.out.println("El número de impares almacenados en el array es: " + elementoMinimo);
    }
}
        

        
