/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U2_04_Solucion;

/**
 *
 * @author FOC
 */
public class alumnos {
    private static int numAlumnos=0;
    private String nombre="";
    private int nota=0;
    
    public static int getnumAlumnos (){
        return numAlumnos;
    }
    
    public static void incrementarnumAlumnos (){
       numAlumnos++;
    }    
    public void setNombre (String n){
        nombre = n;
    }
    public void setNota (int nt){
        nota = nt;
    }
    public String getNombre (){
        return nombre;
    }
    public int getNota () {
        return nota;
    }
}
