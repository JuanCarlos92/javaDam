/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tryandcatch;

/**
 *
 * @author Juan Carlos
 */
public class TryAndCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String var= "M";
            int entero = Integer.parseInt(var);
            //Aqui voy a meter mi codigo
        } catch (Exception e) {
            //voy a controlar las excepciones de tipo general
            System.out.println("Tenemos un error " + e.getMessage());
            
        } finally{
            System.out.println("Instrucciones que se ejecutan finalmente tanto si se produce errores, como si no");
        }
    }
    
}
