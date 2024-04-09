/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package U2_07;

/**
 *
 * @author Usuario
 */
public class EjercicioRealizado_02_07 {

    public static void main(String[] args) {
        persona persona1 = new persona();
        persona persona2 = new persona("Juan", "15456141A", 31);
        
        persona1.setNombre("Manuel");
        persona1.setDni("15456141S");
        persona1.setEdad(30);
        
        System.out.println("""
                           ----Primera persona----
                           Nombre:  """+ " "+persona1.getNombre() +
                "\n"+ "DNI: "+ persona1.getDni()+
                "\n"+ "Edad: "+ persona1.getEdad());
        
        System.out.println("""
                           ----Primera persona----
                           Nombre:  """+ " "+persona2.getNombre() +
                "\n"+ "DNI: "+ persona2.getDni()+
                "\n"+ "Edad: "+ persona2.getEdad());
        
    }
}
