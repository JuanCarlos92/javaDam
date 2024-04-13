/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud5_1_class_file;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author Juan Carlos
 */
public class Ud5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String urlTrabajo="C:\\Users\\Juan Carlos\\Desktop\\TrabajoFicheros";
        
        String fichero1="fichero1.txt";
        String fichero2="fichero2.txt";
        
        String directorioInterno ="DirectorioInterno";
        
        File directorio = new File(urlTrabajo);
        
        if (!directorio.isDirectory()) {
            directorio.mkdir();
        }
        
        File ficheroUno = new File(urlTrabajo + "\\" + fichero1);
        File ficheroDos = new File(urlTrabajo + "\\" + fichero2);
        
        File directorioInterno1 = new File(directorioInterno);
        if (!directorioInterno1.isDirectory()) {
            directorioInterno1.mkdir();
        }
        
        File ficheroTres = new File(directorioInterno + "\\" + "fichero3,txt");
        
        try{
            ficheroUno.createNewFile();
            ficheroDos.createNewFile();
            ficheroTres.createNewFile();
            ficheroUno.delete();
        }catch(IOException e){
            System.out.println("Existen errores");
            e.printStackTrace();
        }
        
    }
    
}
