/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentramenor;

public class EncuentraMenor {

    public static void main(String[] args) {
        
        //Declaramos y asignamos los tres números
        int a = 2 , b = 4 , c = 8;
        
        // Declaramos variable auxiliar para almacenar el valor mas pequeño
        int menor;

        //Se obtiene el valor
        if (a < b){
            if( a < c){
                menor=a;
            } // Fin if anidado
            else{
                menor=c;
            } // Fin else anidado
        } // Fin if
        else{
            if(b < c){
                menor = b;
            } // Fin if anidado
            else{
                menor = c;
            } // Fin else anidado
        } // Fin else
        
        System.out.println("El menor número de los tres es: " + menor);
    }
}
