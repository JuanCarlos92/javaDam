/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud2_3_paquete_objetos;

/**
 *
 * @author Juan Carlos
 */
public class Monedas {

    static final double usd = 1.18;
    static final double jpy = 132.53;
    static final double gbp = 0.88;
    private double euros;

    public Monedas(double valor, String tipo) {
        
        switch (tipo) {
            case "USD":
                euros = valor / usd;
                break;
            case "JPY":
                euros = valor / jpy;
                break;
            case "GBP":
                euros = valor / gbp;
                break;
            default:
                euros = valor;
                break;
        }

    }

    public double getDolares() {
        return euros * usd;

    }

    public double getLibras() {
        return euros * gbp;
    }

    public double getYenes() {
        return euros * jpy;
    }

}
