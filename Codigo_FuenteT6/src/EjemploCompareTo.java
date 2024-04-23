

public class EjemploCompareTo {
    public static void main(String[] args) {
        String cadena1 = " La alhambra es muy bonita";
        String cadena2 = " La ALHAMBRA es muy bonita";

        String mensajeResultado;
        int resultado = cadena1.compareToIgnoreCase(cadena2);
        
        if(resultado>0) {
            mensajeResultado=" mayor que";
        }
        else if(resultado<0){
            mensajeResultado=" menor que";
        }
        else{
            mensajeResultado=" igual que";
        }
        
        System.out.println(cadena1+" es "+mensajeResultado+cadena2);
    }
}


