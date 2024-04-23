
package ejemplostatic;

public class Moto {
    
    private static int numMotos = 0; // Atributo que indica el numero de motos
    private String matricula;  // Atributo que indica la matricula de la moto
    
    // Método estático de la clase
    public static int getNumMotos(){
        return numMotos;
    }
    
    // Método estático de la clase
    public static void aniadirMoto(){
        numMotos++;
    }
    
    // Método de la clase
    public void setMatricula(String mat){
        matricula = mat;
    }
    
    // Método de la clase
    public String getMatricula(){
        return matricula;
    }
}

