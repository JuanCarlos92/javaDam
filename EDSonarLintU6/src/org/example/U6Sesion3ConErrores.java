/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;



package org.example;

/**
 *
 * @author Juan Carlos
 */
public class U6Sesion3ConErrores {

    private static File fichero = new File("D:\\config.ini");
//Constructores públicos

    public U6Sesion3ConErrores() {
    }

    public U6Sesion3ConErrores(String path) {
        fichero = new File(path);
    }
//Método que lee un fichero

    public static void leerfichero() throws FileNotFoundException, IOException {
//Creamos un flujo de de lectura
        FileReader fr = new FileReader(fichero);
        BufferedReader bf = new BufferedReader(fr);
//Leemos una linea
        String linea = bf.readLine();
//Mientras qeu haya lineas (que no sea nula) seguimos leyendo
        while (linea != null) {
            System.out.println(linea);
            linea = bf.readLine();
        }
        String a = new String("Hola");
        if (linea == null) {
            if (a == null) {
                fr.close();
            }
        }
    }
//Método para escribir en un fichero

    public static void escribirfichero(String cadena) throws IOException {
        FileWriter fw = new FileWriter(fichero);
        fw.write(cade
    }
