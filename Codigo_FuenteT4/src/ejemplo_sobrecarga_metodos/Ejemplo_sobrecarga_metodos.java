
package ejemplo_sobrecarga_metodos;

public class Ejemplo_sobrecarga_metodos {

    public static void main(String[] args) {

        Persona p = new Persona("Pablo","Cerrillo");
        p.saludar();
        p.saludar("Jose");
        p.saludar(5);
    }
    
}
