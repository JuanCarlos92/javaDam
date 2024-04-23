
package tablasdemultiplicarbuclesfor;

public class TablasDeMultiplicarBuclesFor {

    public static void main(String[] args) {

        int resultado;
        
        for(int multiplicando = 1; multiplicando <= 10; multiplicando++){
             
            System.out.println("Tabla del número: " + multiplicando);

            for(int multiplicador = 0; multiplicador <= 10; multiplicador++){
                resultado = multiplicando * multiplicador;
                System.out.println(multiplicando + "x" 
                                    +multiplicador + "=" +resultado);
            }    
        }         
    }
}
