package ejercicioetiquetasbreakcontinue;

public class EjercicioEtiquetasBreakContinue {

    public static void main(String[] args) {
        
        int i=0;
        // Definimos la etiqueta bucleExterno
        bucleExterno:
            // mientras i sea menor que 20
            while(i < 20){ 
                // Incrementamos i
                i++;
                
                // Imprimimos los espacios
                for(int k = 1; k < (20-i); k += 2){
                    // Si es par saltamos
                    if ( i%2 == 0){
                        continue bucleExterno;
                    }
                    System.out.print(" ");
                }
                
                // Imprimimos los asteriscos
                for(int j = 0; j < i; j++){
                    System.out.print("*");
                }
                
                // imprimimos salto de linea
                System.out.println("");
                
                // Si i es 19, rompemos el bucle
                if (i==19){
                    break bucleExterno;
                }
            }
    }
}