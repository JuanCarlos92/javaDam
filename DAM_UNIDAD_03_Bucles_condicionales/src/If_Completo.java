/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class If_Completo {

    /*Realiza una aplicación que nos calcule una ecuación de segundo grado. Partimos de
    unos valores dados para a, b y c y debemos comprobar antes que el discriminante para
    no tener errores a la hora de calcular la raíz cuadrada. Para la raíz cuadrada usa el
    método sqlrt de Math.
     */
    public static void main(String[] args) {
        int a=2;
        int b=6;
        int c=3;
        double discriminante=Math.pow(b, 2)-(4*a*c);
  
        System.out.println(">>"+discriminante);
  
        if (discriminante>0){
            double x1=((b*(-1))+Math.sqrt(discriminante))/(2*a);
            double x2=((b*(-1))-Math.sqrt(discriminante))/(2*a);
  
            System.out.println("El valor de x1 es "+x1+" y el valor de x2 es "+x2);
        }else{
            System.out.println("El discriminante es negativo");
        }
    }
    
}