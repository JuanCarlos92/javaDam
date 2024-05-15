package parsing01;

public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish = "887ds7nds87dsfs";
        
        //Parse shirtPrice and taxRate, and print the total tax
        int varIntShirtPrice = Integer.parseInt(shirtPrice);
        double varDoubleTaxRate = Double.parseDouble(taxRate);
        
        System.out.println(varIntShirtPrice *varDoubleTaxRate);
        
        
        //Try to parse taxRate as an int
        //ERROR
        int varIntTaxRate = Integer.parseInt(taxRate);
        System.out.println(varIntTaxRate);
        //Try to parse gibberish as an int
        //ERROR
        int varIntgibberish = Integer.parseInt(gibberish);
        System.out.println(varIntgibberish);
    }
    
}
