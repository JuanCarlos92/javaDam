
package ejemplostatic;

public class EjemploStatic {

    public static void main(String[] args) {

        Moto m1 = new Moto();
        Moto.aniadirMoto(); // llamada al método estatico a partir de la clase
        m1.setMatricula("123ABC"); // llamada a metodo de la clase desde objeto
        
        Moto m2 = new Moto();
        Moto.aniadirMoto(); // llamada al método estatico a partir de la clase
        m2.setMatricula("456ABC"); // llamada a metodo de la clase desde objeto
        
        System.out.println("La matricula de m1 es: " + m1.getMatricula());
        System.out.println("La matricula de m1 es: " + m1.getMatricula());
        System.out.println("El numero de motos es: " + Moto.getNumMotos());
    }
}

