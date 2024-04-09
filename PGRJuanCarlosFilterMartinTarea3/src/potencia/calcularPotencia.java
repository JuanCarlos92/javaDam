
package potencia;

/**
 *
 * @author Juan Carlos
 */
public class calcularPotencia {

    public static void main(String[] args) {

        //Variables
        int base = -1;
        int exponente = 3;
        int resultado = 0;

        //Control de excepciones mediante un try - catch
        try {
            if (base < 0 || exponente < 0) {
                throw new ArithmeticException("La base y el exponente deben ser igual o mayor  a 0");

            } else if (exponente == 0) { //Si exponente = 0. resultado vale 1 
                resultado = 1;

            } else if (base == 1) { //Si base = 1. resultado vale 1 
                resultado = 1;

            } else if (base > 1 && exponente > 0) { //Si base >1 y exponente >0. calcula la potencia y almacena en resultado
                resultado = Potencia.forPotencia(base, exponente);
            }
            //Resultado
            System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + resultado);

            //excepcion para controlar si es  igual o mayor que 0
        } catch (ArithmeticException a) {
            System.out.println("Se ha producido un error: " + a.getMessage());
            //excepciones para otros posibles errores en el programa
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e.getMessage());
        }
    }
}
    
    

