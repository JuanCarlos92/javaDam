
package UD3_2_for;

public class Operaciones {
    public void CienPrimeros(){
        for (int i = 1; i <=100 ; i++) {
            System.out.println("Numero: " + i);
        }
    }
    public void CienRevez(){
        for (int i = 100; i >=0; i--) {
            System.out.println("Numero: " + i);
        }
    }
    public void CienPares(){
        int i;
        for (i = 0;i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Numero: " + i);
            }
        }
    }
    public void Ascii(){
        char i;
        
        System.out.println("Caracteres ASCII");
        for (i = 0; i < 255; i++) {
            System.out.println(i);
        }
    }
}
