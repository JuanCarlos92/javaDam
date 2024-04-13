
package utilizacion_de_objetos_cuadrado;

public class Utilizacion_de_objetos_cuadrado {

    public static void main(String[] args) {
    
        // Cuadrado creado a partir del constructor por defecto
        Cuadrado c1 = new Cuadrado();
        
        // Cuadrado creado a partir del constructor por defecto
        Cuadrado c2 = new Cuadrado();
        
        // Cuadrado creado a partir del constructor por parámetro
        Cuadrado c3 = new Cuadrado(2);
        
        // Cuadrado creado a partir del constructor por parámetro
        Cuadrado c4 = new Cuadrado(3);
        double area = c4.area();
        double perimetro = c4.perimetro();
    }
    
}

