package usoconstructores;
import java.lang.String;

public class UsoConstructores {

    public static void main(String[] args) {
        
        String t1 = new String(); // Llamada al constructor por defecto
        String t2 = new String("Hello"); // Llama al constructor por parametro 
        
        System.out.println("Valor de t1: " + t1);
        System.out.println("Valor de t2: " + t2);
        
        if(t1 == "")
            System.out.println("Valor de t1: " + t1);

    }
}

