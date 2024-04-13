/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud2_1_clases_objetos;

/**
 *
 * @author Juan Carlos
 */
public class Contador {

    private int valor;

    public Contador() {
        this.valor = 0;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int incrementar() {
        valor++;
        if (valor > 100) {
            valor = 0;
        }
        return valor;
    }

    public int decrementar() {
        valor--;
        if (valor < 0) {
            valor = 100;
        }
        return valor;
    }
}
