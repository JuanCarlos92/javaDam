package ejemplo_implementacion_clases_ii;

public class Ejemplo_implementacion_clases_II {
    
    public static void main(String[] args) {
        
        Dado dado1 = new Dado(6);
        Dado dado2 = new Dado(6);
        int resultado = 0;
        
        for(int i = 0; i < 5; i++){ // Realizamos varios lanzamientos
            System.out.println("Lanzamos los dados.....");
            resultado = dado1.lanzarDado() + dado2.lanzarDado();
            System.out.println("Resultado = " + resultado + "\n");
        }
    }
}
