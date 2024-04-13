/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usodewrappers;

public class UsoDeWrappers {

    public static void main(String[] args) {
        
        Integer num1 = new Integer(5);
        Integer num2 = new Integer("7");
        String num1_cadena = num1.toString();
        System.out.println(num1_cadena);
        
        Integer num3 = Integer.parseInt("10");
        Integer num4 = Integer.parseInt("8");
        System.out.println(num3); //muestra 10 por pantalla
        System.out.println(num4); //muestra 8 por pantalla
        
        Integer num5 = Integer.valueOf("22").intValue();
        System.out.println(num5); //muestra 22 por pantalla

    }
}
