/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class If_Else2_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num= 55;
        
        if(num<0){ //si el valor es menor que 0
            System.out.println("el valor es menor que 0");
        }else if((num>=0)&&(num<=10)){ // Valor esta comprendido entre 0 y 10
            System.out.println("Valor esta comprendido entre 0 y 10 ");
        }else if ((num>10)&&(num<=20)){ // Valor esta comprendido entre 11 y 20 
            System.out.println("Valor esta comprendido entre 11 y 20 ");
        }else if ((num>20)&&(num<=30)){ // Valor esta comprendido entre 21 y 30 
             System.out.println("Valor esta comprendido entre 21 y 30 ");    
        }else if ((num>30)&&(num<=40)){ // Valor esta comprendido entre 31 y 40 
             System.out.println("Valor esta comprendido entre 31 y 40 ");   
        }else{ //si el valor ese mayor que 40
            System.out.println("El valor es mayor que 40");
        }
    }
}
    
