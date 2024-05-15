
package tip01;

public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        Persona p5 = new Persona();
        Persona p6 = new Persona();
        Persona p7 = new Persona();
        Persona p8 = new Persona();
        
        p1.setDolar(10);
        p2.setDolar(12);
        p3.setDolar(9);
        p4.setDolar(8);
        p5.setDolar(7);
        p6.setDolar(15);
        p7.setDolar(11);
        p8.setDolar(30);
        
        System.out.println("Person 1: $" + p1.getTotal());
        System.out.println("Person 2: $" + p2.getTotal());
        System.out.println("Person 3: $" + p3.getTotal());
        System.out.println("Person 4: $" + p4.getTotal());
        System.out.println("Person 5: $" + p5.getTotal());
        System.out.println("Person 6: $" + p6.getTotal());
        System.out.println("Person 7: $" + p7.getTotal());
        System.out.println("Person 8: $" + p8.getTotal());
        
    }    
}
