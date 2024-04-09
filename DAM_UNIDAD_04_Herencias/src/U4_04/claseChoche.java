/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package U4_04;

import vehiculos.claseVehiculo;

/**
 *
 * @author Juan Carlos
 */
public class claseChoche extends claseVehiculo{
    private int cilindrada;
    
    public claseChoche(){
        super("", 0);
        cilindrada = 0;
    }
    public claseChoche(String marca, double  precio, int cilindrada){
        super(marca, precio);
        this.cilindrada =cilindrada;
    }
    public int getCilindrada(){
        return cilindrada;
    }
    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }
}
