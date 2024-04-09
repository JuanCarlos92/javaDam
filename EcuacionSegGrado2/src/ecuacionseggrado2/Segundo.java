/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecuacionseggrado2;

/**
 *
 * @author Juan Carlos
 */
public class Segundo {

 /**Para ello vamos a realizar una aplicación que resuelva ecuaciones de segundo grado.
            --> aX2 – bX – c =0
    
    * Los datos se los vamos a propocionar a través de la línea de comandos. De ese modo
    vamos a llamar a nuestro programa del siguiente modo:
    
    * C:/> segundo 5 12 3

    *Vamos a considerar que los datos que proporcionamos son correctos. Es decir el
    programa no tiene que tener ningún tipo de control sobre los valores.

    *Para ello vamos a declarar 3 variables y asignándoles unos valores iniciales. Con estos
    valores iniciales se realizarán los cálculos.

    *El programa mostrará los resultados. 
     * @param args
     */
    public static void main(String[] args) {
    //Obtenemos los parametros
    String parametro1 = args[0];
    String parametro2 = args[1];
    String parametro3 = args[2];
    
    //Convertimos los parametros a enteros
    //La función parseInt convierte un String a un int
    int a = Integer.parseInt(parametro1);
    int b = Integer.parseInt(parametro2);
    int c = Integer.parseInt(parametro3);
    
    //Resolvemos la ecuación
    //La función sqrt realiza la raiz cuadrada
    double raiz = Math.sqrt(b*b - 4*a*c);
    double numeradorSumando = -b + raiz;
    double numeradorRestando = -b - raiz;
    int denominador = 2*a;
    
    double solucion1 = numeradorSumando/denominador;
    double solucion2 = numeradorRestando/denominador;
    
    System.out.println("Solucion 1= "+solucion1);
    System.out.println("Solucion 2= "+solucion2);
  }
}
