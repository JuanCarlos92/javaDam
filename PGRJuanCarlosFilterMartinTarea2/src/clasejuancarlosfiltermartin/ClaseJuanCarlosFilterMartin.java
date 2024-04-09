package clasejuancarlosfiltermartin;
/**
 *
 * @author Juan Carlos
 */
public class ClaseJuanCarlosFilterMartin {

    public static void main(String[] args) {
        //Variable tipo String con nombre y apellido
        String nombreApellido = "Juan Carlos Filter Martin";
        //Tamaño en caracteres
        System.out.println(nombreApellido.length());
        //Primer caracter y último caracter del nombre (J y n)
        System.out.println(nombreApellido.charAt(0) + " y " + nombreApellido.charAt(nombreApellido.length()-1));
        //Extraer el nombre Juan
        System.out.println(nombreApellido.substring(0, nombreApellido.indexOf(" ")));
        //El segundo apellido Martin
        System.out.println(nombreApellido.substring(nombreApellido.lastIndexOf(" ")+1));
        //Cambiar todas las "a" por "_" 
        System.out.println(nombreApellido.replace("a", "_"));
       
        //Objetos de clase
        NombreApellidos persona1 = new NombreApellidos(); // por defecto
        NombreApellidos persona2 = new NombreApellidos("Julian", 24); //con parametros
        NombreApellidos miPersona = new NombreApellidos(); //Crear objeto para mis datos
        
        //Parametros en metodos setter
        persona1.setNombre("Alvaro");
        persona1.setEdad(34);
        
        //Mis parámetros con metodos setter
        miPersona.setNombre("Juan Carlos Filter Martin");
        miPersona.setEdad(31);
        
        //mostramos por pantalla ayuda con el método static getAyuda
        System.out.println(NombreApellidos.Ayuda());
        //Resultados:
        System.out.println("Persona1 -> Nombre: " + persona1.getNombre() + " edad: " + persona1.getEdad());
        System.out.println("Persona2 -> Nombre: " + persona2.getNombre() + " edad: " + persona2.getEdad());
        System.out.println("Me llamo " + miPersona.getNombre() + " y tengo " +miPersona.getEdad() + " anios.");
        
    }
    
}
