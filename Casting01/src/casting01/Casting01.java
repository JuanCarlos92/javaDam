
package casting01;

public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
        
        //byte variablebyte = 128; //Fuera del rango permitido.
        
        //Declare and initialize a short with a value of 128
        short shor = 128;
        //Create a print statement that casts this short to a byte 
        byte variableByte =(byte)shor;
        System.out.println(variableByte);
        
        //Declare and initialize a byte with a value of 127
        byte variableByte2 = 127;
       
        //Add 1 to this variable and print it
        variableByte2 ++;
        System.out.println(variableByte2);
        
        //Add 1 to this variable again and print it again
        variableByte2 ++;
        System.out.println(variableByte2);
        
        
        
    }    
}
