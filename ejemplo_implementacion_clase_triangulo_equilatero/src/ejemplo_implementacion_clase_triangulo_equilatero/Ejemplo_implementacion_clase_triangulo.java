
package ejemplo_implementacion_clase_triangulo_equilatero;

public class Ejemplo_implementacion_clase_triangulo {

    public static void main(String[] args) {
        // TODO code application logic here
        
        TrianguloEquilatero t1 = new TrianguloEquilatero();
        TrianguloEquilatero t2 = new TrianguloEquilatero(4);
        
        System.out.println("El lado de t1 mide: " + t1.getLado());
        System.out.println("El lado de t2 mide: " + t2.getLado());
        System.out.println("El perímetro de t1 mide: " + t1.perimetro());
        System.out.println("El perímetro de t2 mide: " + t2.perimetro());
        System.out.println("El número de lados de un TrianguloEquilatro es: " 
                + TrianguloEquilatero.getNumLados());
    }
}
