/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentasbancarias;

import modeloBancario.*;

/**
 *
 * @author Juan Carlos
 */
public class CuentasBancarias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Crear cliente1 
        Cliente cliente1 = new Cliente(1, "Juan Carlos",
                "Calle Arrecife 23", "699699699");

        //Crear cliente2
        Cliente cliente2 = new Cliente();

        cliente2.setIdCliente(2);
        cliente2.setNombre("Francisco");
        cliente2.setDireccion("Calle La Liberta 13");
        cliente2.setTelefono("688688688");

        //Crear cuenta corriente para cliente1
        CuentaCorriente cc = new CuentaCorriente(1011, 15000,
                cliente1);

        //Crear cuenta corriente para cliente2
        CuentaAhorro ca = new CuentaAhorro(1022, 28000,
                cliente2, 0.02, 20000);

        //Realizar operaciones cuentaCorriente con los metodos
        try {
            cc.ingresar(200);  //Depositar
            cc.retirar(1000);    //retirar
            cc.actualizarSaldo();         //Actualizar Saldo con interes fijo
            System.out.println("Saldo final en la cuenta Corriente: " + cc.getSaldo());

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        //Realizar operaciones cuentaAhorro con los metodos 
        try {
            ca.ingresar(200);  //Depositar
            ca.retirar(2300);    //retirar
            ca.actualizarSaldo();         //Actualizar Saldo con interes fijo
            System.out.println("Saldo final en la cuenta Ahorro: " + ca.getSaldo());

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
