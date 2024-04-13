/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosstaticos;

public class TestCounter {

    public static void main(String[] args) {
		
       System.out.println("El número del contador es " 
               + Count2.getTotalCount());
	
       Count2 count1 = new Count2();

       System.out.println("El número del contador es " 
               + Count2.getTotalCount());

    }
}
