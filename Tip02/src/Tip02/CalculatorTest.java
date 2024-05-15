
package Tip02;

public class CalculatorTest {
    public static void main(String[] args) { 
        //Instantiate a Calculator object
        
        
        //Access the Calculator object's fields and methods
        //to find the total for each member of the birthday party
        Calculator  calc = new Calculator();
        calc.originalPrice = 10;
        System.out.print("Persona 1: ");
        calc.findTotal();
        calc.originalPrice = 12;
        System.out.print("Persona 2: ");
        calc.findTotal();
        calc.originalPrice = 9;
        System.out.print("Persona 3: ");
        calc.findTotal();
        calc.originalPrice = 8;
        System.out.print("Persona 4: ");
        calc.findTotal();
        calc.originalPrice = 7;
        System.out.print("Persona 5: ");
        calc.findTotal();
        calc.originalPrice = 15;
        System.out.print("Persona 6: ");
        calc.findTotal();
        calc.originalPrice = 11;
        System.out.print("Persona 7: ");
        calc.findTotal();
        calc.originalPrice = 30;
        System.out.print("Persona 7: ");
        calc.findTotal();
        
        
        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15 (Alex)
        Person 7: $11
        Person 8: $30
        */
        
    }
}
