/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referencias_a_objetos;

/**
 *
 * @author pcr
 */
public class Racional {

    private int numerador;
    private int denominador;

    public void AsignarDatos(int num, int den) {
        numerador = num;
        if (den == 0) {
            den = 1; //el denominador no puede ser cero
        }
        denominador = den;
    }

    public void VisualizarRacional() {
        System.out.println(numerador + "/" + denominador);
    }

    public static Racional sumar(Racional a, Racional b) {
        Racional r = new Racional();

        int num = a.numerador * b.denominador + a.denominador * b.numerador;
        int den = a.denominador * b.denominador;
        r.AsignarDatos(num, den);

        return r;
    }

}
