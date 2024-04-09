package UD5_Repaso_ClassFile_Write_Reader;
import java.io.*;
public class READER_Ejemplo2 {

    public static void main(String[] args) throws IOException {
        File fich = new File ("C:\\Users\\Juan Carlos\\Desktop\\DirectorioEjemplo\\ficherol.txt");
        FileReader fr = new FileReader(fich);
        
        char buffer [] = new char[20];
        int i;
        
        while((i = fr.read(buffer)) !=-1){
            System.out.println(buffer);
        }
        fr.close();
    }
    
}
