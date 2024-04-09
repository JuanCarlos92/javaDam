
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class Ejercicio10Circunferencias {

    //    Ejercicio 10: Realiza un programa que pida los puntos centrales de dos circunferencias (x1, y1), (x2, y2) 
    //    y los radios de las mismas (r1, r2). El programa debe clasificar según corresponda como: exteriores,
    //    tangentes exteriores, secantes, tangentes interiores, interiores o concéntricas.
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1;
        int x2;
        int y1;
        int y2;
        int r1;
        int r2;
        double distancia;

        //Solicitud de datos al usuario
        System.out.println("Este programa calcula como son dos circuferencias entre si, "
                + " conociendo sus centros y radios: ");
        System.out.println("Introduce el valor \"x\" de la primera circunferencia ");
        x1 = sc.nextInt();
        System.out.println("Introduce el valor \"y\" de la primera circunferencia ");
        y1 = sc.nextInt();
        System.out.println("Introduce el radio de la primera circunferencia ");
        r1 = sc.nextInt();
        x2 = sc.nextInt();
        System.out.print("Introduce el valor \"y\" de la segunda circunferencia: ");
        y2 = sc.nextInt();
        System.out.print("Introduce el radio de la segunda circunferencia: ");
        r2 = sc.nextInt();

        // Realizamos Cálculos de la distancia entre ambas circunferencias
        distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        // Hacemos comparaciones y mostramos en pantalla.
        if (distancia == 0) {
            System.out.println("Concéntricas.");
        } else if (distancia > (r1 + r2)) {
            System.out.println("Exteriores.");
        } else if ((distancia > 0) && distancia < Math.abs(r1 - r2)) {
            System.out.println("Interiores.");
        } else if (distancia == (r1 + r2)) {
            System.out.println("Tangentes exteriores.");
        } else if (distancia == Math.abs(r1 - r2)) {
            System.out.println("Tangentes interiores.");
        } else if (distancia < (r1 + r2) && distancia > Math.abs(r1 - r2)) {
            System.out.println("Secantes.");

        }

    }
}
