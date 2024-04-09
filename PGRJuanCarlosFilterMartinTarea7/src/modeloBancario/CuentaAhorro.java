/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloBancario;

/**
 *
 * @author Juan Carlos
 */
public class CuentaAhorro extends Cuenta {

    //Atributos
    protected double interesVariable;
    protected double saldoMinimo;

    //Constructor con parametros
    public CuentaAhorro(int numeroDeCuenta, double saldo, Cliente titular,
            double interesVariable, double saldoMinimo) {
        super(numeroDeCuenta, saldo, titular);
        this.interesVariable = interesVariable;
        this.saldoMinimo = saldoMinimo;
    }

    //metodos abstractos
    @Override
    public void retirar(double retirarSaldo) throws Exception {
        if (retirarSaldo <= 0) {
            throw new Exception("La cantidad que desea retirar tiene que ser positiva");
        } else if (this.saldo - retirarSaldo < saldoMinimo) {
            throw new Exception("Saldo insuficiente. El saldo debe se mayor o igual al saldo Minimo");
        } else {
            this.saldo -= retirarSaldo;
            System.out.println("Se ha retirado " + retirarSaldo + " euros");
        }

    }

    @Override
    public void actualizarSaldo() {
        this.saldo += this.saldo * interesVariable;
        System.out.println("El saldo ha sido actualizado con los intereses variables");
    }

}
