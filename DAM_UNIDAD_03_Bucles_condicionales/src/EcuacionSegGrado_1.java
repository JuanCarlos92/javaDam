public class EcuacionSegGrado_1 {

    /**
     vamos a realizar una aplicación que resuelva ecuaciones de segundo grado.
    
    * ---> aX2 – bX – c =0
    
    * Vamos a considerar que los datos que proporcionamos son correctos. Es decir el
    programa no tiene que tener ningún tipo de control sobre los valores.
    
    * Para ello vamos a declarar 3 variables y asignándoles unos valores iniciales. Con estos
    valores iniciales se realizarán los cálculos.
    
    * El programa mostrará los resultados. 
     * @param args
     */
    public static void main(String[] args) {
        double a = 15;
        double b = 7.5;
        double c = -1;
        
        //Resolvemos la ecuacion
        //La funcion sqrt realiza la raiz cuadrada
        double raiz = Math.sqrt(b*b - 4*a*c);
        double numeradorSumado = -b + raiz;
        double numeradorRestando = -b - raiz;
        double denominador = 2*a;
        
        double solucion1 = numeradorSumado/denominador;
        double solucion2 = numeradorRestando/denominador;
        
        System.out.println("solucion1= "+ solucion1);
        System.out.println("solucion2= "+ solucion2);
    }
    
}
