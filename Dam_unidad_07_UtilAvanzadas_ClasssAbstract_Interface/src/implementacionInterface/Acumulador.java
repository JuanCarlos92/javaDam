/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementacionInterface;

/**
 *
 * @author Juan Carlos
 */
public class Acumulador {

    private int valor;

    public Acumulador(int i) {
        this.valor = i;
    }

    public int getValor() {
        return this.valor;
    }

    public void incremento(int a) {
        this.valor += a;
    }
}
