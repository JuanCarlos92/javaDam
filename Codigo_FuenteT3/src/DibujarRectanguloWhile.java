
package dibujarrectangulo;

public class DibujarRectanguloWhile {

    public static void main(String[] args) {
        
        int contadorFilas = 0;
        int contadorColumnas = 0;
        
        while (contadorFilas < 3){ // Controlamos las filas
            
            // Restablecemos el contador de columnas
            contadorColumnas = 0;
            
            // Imprimimos el simbolo @ 
            while (contadorColumnas < 10){
                System.out.print("@");
                contadorColumnas++;
            }
            
            // Aumentamos el contador de filas
            contadorFilas++;
            System.out.println(); // salto de línea
        }        
    }
}

