
package clases_y_metodos_abstractos_y_finales;

import java.io.PrintStream;

public class informeCombustibleNecesario {
    
 	private Empresa empresa;

 	public informeCombustibleNecesario(Empresa empresa) {
            this.empresa = empresa;
 	}

 	public void generateText(PrintStream output) {
            Vehiculo v;
            double combustible;
            double total_combustible = 0.0;

            for ( int i = 0; i < empresa.getTamanoFlota(); i++ ) {
                    v = empresa.getVehiculo(i);

            //Calcula el combustible necesario para este viaje
            combustible= v.calcDistanciaViaje() / v.calcEficienciaConsumo();

            System.out.println("El Vehículo " + v.getName() + " necesita "
 		   + combustible + " litros de combustible.");
 		   total_combustible += combustible;
		}
                
            System.out.println("La cantidad total de combustible necesario es " 
                    + total_combustible + " litros.");
   }

}
