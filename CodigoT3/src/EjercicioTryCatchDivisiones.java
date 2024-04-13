
package ejerciciotrycatchdivisiones;

public class EjercicioTryCatchDivisiones {

    public static void main(String[] args) {
        
        int dividendo = 8; 
        int divisor = 0;
        int cociente;
        
        // Codigo donde puede producirse el error dentro de try
        try{
            cociente = dividendo / divisor;
            System.out.println("Resultado: " + cociente);
        }
        // Si ocurre la excepcion la capturamos
        catch(ArithmeticException ex){
            System.out.println("Division por cero -- " + ex);
        }
        // Bloque que siempre se ejecuta
        finally {
            System.out.println("\nSiempre se ejecuta");
        }
    }
}

