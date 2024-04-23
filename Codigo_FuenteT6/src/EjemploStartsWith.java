

public class EjemploStartsWith {
    public static void main(String[] args) {
        String cadena = "La ALHAMBRA es muy bonita";
        String prefijo1 = "La MEZQUITA";
        String prefijo2 = "La ALHAMBRA";
        
        if(cadena.startsWith(prefijo1)){
            System.out.println(cadena+ " comienza por: "+prefijo1);
        }
        else if(cadena.startsWith(prefijo2)){
            System.out.println(cadena+" comienza por: "+prefijo2);
        }
        else{
            System.out.println(cadena+ " no comienza ni por: "
                    +prefijo1+" ni por: "+prefijo2);
        }
    }
}


