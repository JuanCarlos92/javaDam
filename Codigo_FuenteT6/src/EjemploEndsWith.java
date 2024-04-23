

public class EjemploEndsWith {
    public static void main(String[] args) {
        String cadena = "La ALHAMBRA es muy bonita";
        String sufijo1 = "es muy bonita";
        String sufijo2 = "es maravillosa";
        
        if(cadena.endsWith(sufijo1)){
            System.out.println(cadena+" termina por: "+sufijo1);
        }
        else if(cadena.endsWith(sufijo2)){
            System.out.println(cadena+" termina por: "+sufijo2);
        }
        else{
            System.out.println(cadena+" no termina ni por: "
                    +sufijo1+" ni por: "+sufijo2);
        }
    }
}


