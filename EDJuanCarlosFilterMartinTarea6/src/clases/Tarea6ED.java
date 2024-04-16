/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Juan Carlos
 */
public class Tarea6ED {

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double Total;
        if (numProductos > 3) {
            precioProducto -= 5;
        }
        if (numProductos != 0) {
            Total = precioProducto * 0.8;
            System.out.println("El total a pagar es:" + Total);
            System.out.println("Enviado");
        } else {
            Total = precioProducto * 0.95;
            System.out.println("El total a pagar es:" + Total);
            System.out.println("Enviado");
        }
    }
}
