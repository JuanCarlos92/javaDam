
package ejerciciobreak;

public class EjercicioBreak {

    public static void main(String[] args) {
        
        int i=1;
        
        while(i <= 10){
            System.out.println("Impresión del número: " + i);    
            if(i == 5){
                break;
            }
            i++;
        }
    }
}

