package U2_02;

/**
 *
 * @author Juan Carlos
 */
public class Sesion1Ud2 {

        public static void main(String[] args) {
       
        int valor1 = 0;
        int valor2 = 0;
        
        //Instanciamos la clase Contador (es decir, creamos objetos)
        
        Contador contador1 = new Contador();
        Contador contador2 = new Contador();
        
        valor1 = contador1.incrementar();
        valor2 = contador2.decrementar();
        
        
            System.out.println("Contador1 " + valor1);
            System.out.println("Contador2 " + valor2);
    }
    
}
