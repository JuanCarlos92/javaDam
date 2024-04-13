/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD6_2_ArrayBidimensional;

/**
 *
 * @author Juan Carlos
 */
public class Bus {
//atributos

    private double precio;
    private int columna;
    private int fila;

    private String[][] asiento;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public String[][] getAsiento() {
        return asiento;
    }

    public void setAsiento(String[][] asiento) {
        this.asiento = asiento;
    }
//    constructores

    public Bus(double precio, int columna, int fila, String[][] asiento) {
        this.precio = precio;
        this.columna = columna;
        this.fila = fila;
        this.asiento = asiento;
    }

    public Bus() {
    }

    public Bus(int columnas, int filas, double precio) {
        this.columna = columnas;
        this.fila = filas;
        this.precio = precio;
        this.asiento = new String[filas][columnas];
        this.CrearBus();

    }

    public void CrearBus() {
        for (int i = 0; i < this.fila; i++) {
            for (int j = 0; j < this.columna; j++) {
                this.asiento[i][j] = "V";

            }

        }
    }

    public void imprimirBus() {
        for (int i = 0; i < this.fila; i++) {
            for (int j = 0; j < this.columna; j++) {
                System.out.println(this.asiento[i][j] + " ");

            }
            System.out.println();

        }
    }

    public double CosteBillete(int numeroBillete) {

        return this.precio * numeroBillete;

    }

    public String venderBillete(int columnaElijo, int filaElijo) {
        String resultado = "";
        if (this.asiento[filaElijo][columnaElijo] == "V") {
            this.asiento[filaElijo][columnaElijo] = "X";
            if (this.asiento[0][0] == this.asiento[filaElijo][columnaElijo]) {
                this.precio = this.precio + 5.0;
            }
            resultado += "billete vendido";

        } else {
            resultado += "asiento ocupado";

        }
        return resultado;
    }

}
