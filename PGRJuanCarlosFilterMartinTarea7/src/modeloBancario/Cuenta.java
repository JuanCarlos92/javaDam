/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloBancario;

/**
 *
 * @author Juan Carlos
 */
public abstract class Cuenta {

    //Atributos
    protected int numeroDeCuenta;
    protected double saldo;
    protected Cliente titular;

    //Constructores
    public Cuenta() {
        this.titular = null;
        this.saldo = 0;
        this.numeroDeCuenta = 0;
    }

    public Cuenta(int numeroDeCuenta, double saldo, Cliente titular) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }
    
    //Getters y Setters
    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    //Metodo  ingresar
    public void ingresar(double ingresarSaldo) {
        this.saldo += ingresarSaldo; //Incrementa el saldo sumandolo al atributo saldo
        System.out.println("Se ha ingresado " + ingresarSaldo + " euros");

    }
    //metodos abstractos
    abstract public void retirar(double retirarSaldo) throws Exception;

    abstract public void actualizarSaldo();
}
