/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Clase para aplicar descuentos a los productos.
 *
 * @author Juan Carlos
 */
public class Tarea6ED {

    //Constantes
    private static final double DESCUENTO_CERO_PRODUCTOS = 0.95;
    private static final double DESCUENTO_HASTA_TRES_PRODUCTOS = 0.8;
    private static final int DESCUENTO_MAS_TRES_PRODUCTOS = 5;

    /**
     * Aplicamos un descuento al producto segun el numero de productos.
     *
     * @param precioProducto Precio del producto.
     * @param numProductos Numeros de productos.
     */
    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;

        if (numProductos > 3) {
            precioProducto -= DESCUENTO_MAS_TRES_PRODUCTOS;
        }
        if (numProductos != 0) {
            total = precioProducto * DESCUENTO_HASTA_TRES_PRODUCTOS;
            mostrarResultado(total);
        } else {
            total = precioProducto * DESCUENTO_CERO_PRODUCTOS;
            mostrarResultado(total);
        }
    }

    /**
     * Muestra el resultado de precio a pagar
     *
     * @param total Precio total a pagar
     */
    public void mostrarResultado(double total) {
        System.out.println("El total a pagar es: " + total);
        System.out.println("Enviado");
    }
}
