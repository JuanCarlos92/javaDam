package org.example;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;

/**
 *
 * @author Juan Carlos
 */
public class U6Sesion3 {

    private static File fichero = new File("D:\\config.ini");
//Constructores públicos

    private U6Sesion3() {
    }

    public static void setPath(String path) {
        fichero = new File(path);
    }
    //Método que lee un fichero

    public static void leerfichero() throws IOException {
        //Creamos un flujo de de lectura

        try (BufferedReader bf = new BufferedReader(new FileReader(fichero))) {
            //Leemos una linea
            String linea = bf.readLine();
            //Mientras qeu haya lineas (que no sea nula) seguimos leyendo
            while (linea != null) {
                System.out.println(linea);
                linea = bf.readLine();
            }

        } catch (FileNotFoundException f) {
            System.out.println(fichero + "doesn't exists");
            System.out.println(f);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

//Método para escribir en un fichero
    public static void escribirfichero(String cadena) throws IOException {
        try (FileWriter fw = new FileWriter(fichero)) {
            fw.write(cadena);
        } catch (IOException e) {
            System.out.println(e);

        }

    }

}
