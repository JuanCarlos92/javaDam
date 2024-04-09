/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class Bucle_TablaMultiplicar {

    //Mostrar las tablas de multiplicar del 1 al 10 con los 3 bucles posibles. 

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //FOR

//        for (int i = 1; i <= 10; i++) {
//            for (int j = 0; j <= 10; j++) {
//                System.out.println(i+ " x " + j + " = " +  i*j);    
//            }
//            
//        }
//        int i= 1;
//        int j= 0;
//        while (i<=10) {
//            while (j<=10) {
//                System.out.println(i+ " x " + j + " = " +  i*j);
//                j++;
//                
//            }
//            j=0;
//            i++;
//        }
     
int i= 1;
        do{
            int j=0;
                do{
                    System.out.println(i+ " x " + j + " = " +  i*j);
                    j++;   
                }while(j <= 10);
                i++;
        }while(i<=10);
       
}
}