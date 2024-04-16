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

        double interes = this.interesVariable;
        
        double aumentoSaldo = this.saldo / 5000 * 0.001; //Aumenta en 0.1% por cada 5000 euros de saldo
        interes += aumentoSaldo;
        
        //Actualiza el saldo con el interes calculado
        this.saldo += this.saldo * interes;

        //Desplazamos la coma 2 posiciones a la derecha
        double porcentaje = interes *100;
        //redondeamos a solamente 2 decimales
        porcentaje = Math.round(porcentaje *100)/100d;
        
        System.out.println("El saldo ha sido actualizado con un interes del " + porcentaje + "%");
    }

}
