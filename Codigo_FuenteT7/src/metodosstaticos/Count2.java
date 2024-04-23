/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosstaticos;

public class Count2 {
    private int serialNumber;
    private static int counter = 0;

    public static int getTotalCount() {
        return counter;
    }

    public Count2() {
        counter++;
        serialNumber = counter;
    }
}