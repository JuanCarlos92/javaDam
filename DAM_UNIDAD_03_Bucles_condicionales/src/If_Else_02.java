/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class If_Else_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num= 2;
        
        if(num == 0){ //si vale 0
            System.out.println("El numero vale 0");
        }else if (num%2==0 ) {  //si es par
            System.out.println("El numero "+ num + " es par");
        
        }else {  //si es impar
            System.out.println("El numero "+ num + " es impar");
            
        }
    }
    
}
