/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesSuperClasesInterfaces;

/**
 *
 * @author Juan Carlos
 */
public class Superman extends Kriptoniano implements IobjetoVolador{
    public void despegar() {
        System.out.println("despegando desde la clase" + getClass() + "\n");
    }

    public void aterrizar() {
        System.out.println("aterrizando desde la clase" + getClass() + "\n");
    }

    public void volar() {
        System.out.println("volando desde la clase" + getClass() + "\n");
    }

    public void saltarEdificio() {
        System.out.println("saltando edificio desde la clase" + getClass() + "\n");
    }

    public void detenerBala() {
        System.out.println("deteniendo bala desde la clase" + getClass() + "\n");
    }

}
