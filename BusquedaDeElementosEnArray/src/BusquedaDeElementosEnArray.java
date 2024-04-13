/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class BusquedaDeElementosEnArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] temperaturas = {8,10,15,20,35,9,13,7,4,21,14,19};
        int posicion=-1;
        
        for(int i=0; i<temperaturas.length; i++){
            if(temperaturas[i]==13){
                posicion=i;
            }
        }
        
        if(posicion==-1){
            System.out.println("Elemento no presente en el array");
        }
        else{
            System.out.println("Elemento encontrado en la posición "
                +posicion+" del array.Dicho elemento es el elemento: "
                +temperaturas[posicion]);
        } 
    }
    
}
