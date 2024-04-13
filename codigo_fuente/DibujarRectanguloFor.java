/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujarrectangulofor;

public class DibujarRectanguloFor {

    public static void main(String[] args) {
        
        for(int contadorFilas=0; contadorFilas < 3; contadorFilas++){
            
            for(int contadorColumnas = 0; contadorColumnas <= 10; contadorColumnas++){
                System.out.print("@");
            }
            
             System.out.println();
        }
        
    }
}
