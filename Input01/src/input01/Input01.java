package input01;

import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        String inputString = JOptionPane.showInputDialog("JOptionPane");
        
        //Store the input as a String and print it.
        System.out.println(inputString);
        
        
        //Parse the input as an int.
        int inputInt = Integer.parseInt(inputString);
        //Print its value +1
        System.out.println(inputInt +1);
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        int input = Integer.parseInt(JOptionPane.showInputDialog("JOptionPane"))+1;
        System.out.println(input);
        
    }
}
