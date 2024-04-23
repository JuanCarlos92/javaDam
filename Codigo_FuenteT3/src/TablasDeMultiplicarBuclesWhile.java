
package tablasdemultiplicarbucleswhile;

public class TablasDeMultiplicarBuclesWhile {

    public static void main(String[] args) {
        
        int multiplicando = 1;
        int multiplicador = 0;
        int resultado;
        
        while(multiplicando <= 10){
            System.out.println("Tabla del número:  " + multiplicando);
            
            multiplicador = 0;
            
            while(multiplicador <= 10){
                resultado = multiplicando * multiplicador;
                System.out.println( multiplicando + " x " + 
                                    multiplicador + " = " + resultado);
                multiplicador++;
            }
            
            // incrementamos el multiplicando
            multiplicando++;
        }
    }
}

