package Static;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Prueba.getId());

        Prueba p1 = new Prueba();
        System.out.println(p1.getId2() + " - " + Prueba.getId());

        Prueba p2 = new Prueba(85);
        System.out.println(p2.getId2() + " - " + Prueba.getId());

        Prueba p3 = new Prueba();
        System.out.println(p3.getId2() + " - " + Prueba.getId());

        Prueba p4 = new Prueba(8);
        System.out.println(p4.getId2() + " - " + Prueba.getId());

        Prueba p5 = new Prueba();
        System.out.println(p5.getId2() + " - " + Prueba.getId());

        Prueba p6 = new Prueba();
        System.out.println(p6.getId2() + " - " + Prueba.getId());
    }
}