
package shoppingcart02;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 12.99;
        final double tax = 1.21;
        int quantity = 2;
        
        
        
        // Declare and assign a calculated totalPrice
        double totalPrice = price * quantity;
        totalPrice = totalPrice * tax;
        
        // Modify message to include quantity 
        message = custName+" wants to purchase " + quantity + " "+ itemDesc;
        System.out.println(message);
        
        // Print another message with the total cost
        message = "Total cost with tax is: $";
        System.out.println(message + totalPrice);
    }    
}
