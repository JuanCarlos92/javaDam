
package mostrarcalificacion;

public class MostrarCalificacion {

    public static void main(String[] args) {
        
        double nota = 7.5;

        if (nota < 5){
            System.out.println("La calificación obtenida "
                    + "es: Suspenso");
        }
        else if (nota >= 5  && nota < 6){
            System.out.println("La calificación obtenida "
                    + "es: Suficiente");
        }
        else if (nota >= 6 && nota < 7){
            System.out.println("La calificación obtenida "
                    + "es: Bien");
        }
        else if (nota >= 7 && nota < 9){
            System.out.println("La calificación obtenida "
                    + "es de: Notable");
        }
        else if (nota >= 9 && nota < 10){
            System.out.println("La calificación obtenida "
                    + "es: Sobresaliente");
        }
        else{
            System.out.println("La calificación obtenida "
                    + "es: Matrícula de Honor");
        }
        
    }
    
}
