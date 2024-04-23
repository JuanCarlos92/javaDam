
package usoclasemath;
import java.lang.Math;
public class UsoClaseMath {
    public static void main(String[] args) {
        
        // Valores implementados
        System.out.println("El valor del número e es : " + Math.E);
        System.out.println("El valor del número PI: " + Math.PI);
        
        // Valor absoluto de un numero
        System.out.println("El valor absoluto de -5 es: " + Math.abs(-5));
        
        // Redondeos
        System.out.println("El redondeo de 4.3 es: " + Math.round(4.3));
        System.out.println("Redondeo arriba de 4.3 es: " + Math.ceil(4.3));
        System.out.println("Redondeo  abajo de 4.3 es: " + Math.floor(4.3));
        
        // Potencias y raíces cuadradas
        System.out.println("2 elevado a 8 es: " + Math.pow(2,8));
        System.out.println("La raíz cuadrada de 16 es: " + Math.sqrt(16));
        
        // Calculo de funciones logaritmicas
        System.out.println("El logaritmo base E de E: " + Math.log(Math.E));
        System.out.println("El logaritmo base 10 de 100: " + Math.log10(100));
        
        // Calculo de maximos y minimos
        System.out.println("El maximo entre 5 y 17 es: " + Math.max(5,17));
        System.out.println("El minimo entre 5 y 17 es: " + Math.min(5,17));
        
        // Calculo de funciones trigonometricas
        System.out.println("El seno de 0 radianes: " + Math.sin(0));
        System.out.println("El coseno de 0 radianes: " + Math.cos(0));
    }
}

