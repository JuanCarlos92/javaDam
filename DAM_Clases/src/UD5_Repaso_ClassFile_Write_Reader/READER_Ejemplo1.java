package UD5_Repaso_ClassFile_Write_Reader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class READER_Ejemplo1 {
    public static void main(String[] args) throws IOException{
        File fich = new File("C:\\Users\\Juan Carlos\\Desktop\\DirectorioEjemplo\\ficherol.txt");
        FileReader fr = new FileReader(fich);
        int caracter_leido=1;
        
        while(caracter_leido!=-1) { 
            try {
                caracter_leido=fr.read(); 
            }catch (IOException ex){
                ex.printStackTrace();
            }
            System.out.println((char) caracter_leido);
        }
        fr.close();
    }
    
}
