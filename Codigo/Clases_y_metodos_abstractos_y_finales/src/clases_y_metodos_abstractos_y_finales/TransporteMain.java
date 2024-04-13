/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_y_metodos_abstractos_y_finales;


public class TransporteMain {

    public static void main(String[] args) {
        
        Empresa c = new Empresa();

        //Se llenaría la empresa con una flota de vehículos
        c.addVehiculo( new Camion(10000.0) );
        c.addVehiculo( new Camion(15000.0) );
        c.addVehiculo( new Barcaza(500000.0) );
        c.addVehiculo( new Camion(9500.0) );
        c.addVehiculo( new Barcaza(750000.0) );

        informeCombustibleNecesario informe = 
                new informeCombustibleNecesario(c);
        
        informe.generateText(System.out);

    }
}
