/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U2_04;

/**
 *
 * @author Juan Carlos
 */
public class Alumnos {
    private static int numAlumnos = 0;
    private String nombre="";
    private int nota = 0;
    
    public static int getnumAlumnos ( ){
        return numAlumnos;
    }
    public static void masAlumnos(){
        numAlumnos++;
    }
    public void setNombre(String n) {
        nombre = n;       
    }
    public void setNota (int nt){
        nota = nt;
    }
    public int getNota () {
        return nota;
    }
    public String getNombre (){
        return nombre;
    }
}