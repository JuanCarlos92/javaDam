
package uso_constructor_por_defecto;

import java.util.Date;

public class Persona {
    
    String nombre;
    String apellidos;
    Date fecha_nacimiento;
    int telefono;
    
    public void imprimir(){
        System.out.println("Soy " + nombre + " " + apellidos);
        System.out.println("Naci el día " + fecha_nacimiento);
        System.out.println("Mi número es " + telefono);
    }
}


