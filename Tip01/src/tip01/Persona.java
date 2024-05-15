/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tip01;

/**
 *
 * @author Juan Carlos
 */
public class Persona {
    double dolar;
    double total;
    double impuestos = 0.05;
    double propina = 0.15;
    
    public double getTotal() {
        this.total = dolar *(1+ this.impuestos + this.propina);
        
        return total;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
        
    }
    
}
