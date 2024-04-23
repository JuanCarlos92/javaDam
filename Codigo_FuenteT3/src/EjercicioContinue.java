package ejerciciocontinue;

public class EjercicioContinue {

    public static void main(String[] args) {
        
        int i=0;
        
        while(i < 10){ 
            i++;
            if(i == 5){
                continue;
            }
            System.out.println("Impresión del número: " + i);      
        }
    }
}
