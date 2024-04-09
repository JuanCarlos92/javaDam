/**
 *
 * @author Juan Carlos
 */

import java.util.Scanner;

public class scann {

    public static void main(String[] args) {
        // Para instanciarlo
        Scanner sc = new Scanner(System.in);

        System.out.println("Hola, escribe una palabra: ");
        String str1 = sc.next();
        System.out.println("Hola, escribe una palabra: ");
        String str2 = sc.next();
        System.out.println(str1);
        System.out.println(str2);

        System.out.println("Hola, escribe una palabra: ");
        str1 = sc.next();
        System.out.println("Hola, escribe una palabra: ");
        str2 = sc.next();
        System.out.println(str1);
        System.out.println(str2);

        System.out.println("Hola, escribe una linea: ");
        String str3 = sc.nextLine();
        System.out.println(str3);


        System.out.println("Hola, escribe un int: ");
        int int1 = sc.nextInt();
        System.out.println(int1);

        System.out.println("Hola, escribe un double: ");
        double double1 = sc.nextDouble();
        System.out.println(double1);

        // Para cerrar y que no ocupe espacio en memoria
        sc.close();
    }
}
    

