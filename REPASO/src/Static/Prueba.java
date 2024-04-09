package Static;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class Prueba {
    private static int id = 1;
    public final String STR = "Patata";
    private int id2;

    public Prueba(int id2) {
        id++;
        this.id2 = id2;
    }

    public Prueba() {
        this.id2 = id++;
    }

    public static int getId() {
        return id;
    }

    public int getId2() {
        return id2;
    }

    public void patata() {
        int num = id2;
    }

    public int patata3(int num) {
        return num * id;
    }
}
