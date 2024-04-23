
package racional;

class Racional {

    private int numerador;
    private int denominador;

    public void AsignarDatos(int num, int den){
        numerador = num;
        if(den == 0){
             den = 1; //el denominador no puede ser cero
        }
        denominador = den;
    }

    public void VisualizarRacional(){
            System.out.println(numerador + "/" + denominador);
    }

    public static Racional sumar(Racional a, Racional b){
            Racional r = new Racional();

            int num = a.numerador*b.denominador + a.denominador*b.numerador;
            int den = a.denominador*b.denominador;
            r.AsignarDatos(num, den);

            return r;
    }
    
    public static void main (String [] args)
    {
        //Punto de entrada en la aplicación
        Racional r1, r2;
        r1 = new Racional(); //Crear un objeto racional
        r1.AsignarDatos(2,5);
        r2 = r1;

        r1.AsignarDatos(3,7);
        r1.VisualizarRacional(); //Se visualiza 3/7
        r2.VisualizarRacional(); //Se visualiza 3/7

        Racional r3;
        r2 = new Racional(); //Crear un objeto racional
        r2.AsignarDatos(2,5);
        r3 = Racional.sumar(r1,r2); //r3 = 3/7 + 2/5
        r3.VisualizarRacional(); //Se visualiza el número 29/35

    }
}
 
