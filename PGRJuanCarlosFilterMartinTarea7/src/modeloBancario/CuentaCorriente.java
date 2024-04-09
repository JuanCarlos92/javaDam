/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloBancario;

/**
 *
 * @author Juan Carlos
 */
public class CuentaCorriente extends Cuenta {

    //Atributo constante
    protected final static double INTERES_FIJO = 0.15;

    //Constructor con parametros
    public CuentaCorriente(int numeroDeCuenta, double saldo, Cliente titular) {
        super(numeroDeCuenta, saldo, titular);
    }

    //metodos abstractos
    @Override
    public void retirar(double retirarSaldo) throws Exception {
        if (retirarSaldo <= 0) {
            throw new Exception("La cantidad que desea retirar tiene que ser positiva");
        } else if (this.saldo < retirarSaldo) {
            throw new Exception("Saldo insuficiente");
        } else {
            this.saldo -= retirarSaldo;
            System.out.println("Se ha retirado " + retirarSaldo + " euros");
        }

    }

    @Override
    public void actualizarSaldo() {
        this.saldo += this.saldo * INTERES_FIJO;
        System.out.println("El saldo ha sido actualizado con los intereses fijos");
    }

}
