/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U4_03;

/**
 *
 * @author Juan Carlos
 */
public class Alumno extends clasePersona{

    int nota;

    public Alumno() {
        super("",0);
        this.nota=0;
    }
    public Alumno(int nota, String nombre, int edad){
        super(nombre,edad);
        this.nota =nota;
    }
    public int getNota(){
        return nota;
    }
    public void setNota(int nota){
        this.nota = nota;
    }
}