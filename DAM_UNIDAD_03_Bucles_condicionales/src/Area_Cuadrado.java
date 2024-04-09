/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class Area_Cuadrado {

    /**Para ello vamos a realizar una aplicación que calcule el área de un cuadrado donde
    todos los lados tienen la misma longitud. El lado será enviado como dato.
    
    * Los datos se los vamos a proporcionar a través de la línea de comandos. De ese modo
    vamos a llamar a nuestro programa del siguiente modo:
    
    * C:/> cuadrado 42
    
    * El programa realizará los cálculos y mostrará los resultados. 
     * @param args
     */
    public static void main(String[] args) {
        //recogemos lado
        String parametro = args[0];
        
        //Con esta funcion convertimos el lado string en un int
        int lado = Integer.parseInt(parametro);
        
        //calculamos el area
        int area= lado* lado;
        
        //Mostramos el resultado
        System.out.println("El area del cuadrado es " + area);
    }
    
}
