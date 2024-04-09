/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD5_4_Interfaz_ventana;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Juan Carlos
 */
public class Coche {

    private String marca;
    private String matricula;
    private String color;

    public Coche(String marca, String matricula, String color) {
        this.marca = marca;
        this.matricula = matricula;
        this.color = color;
    }

    public Coche() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String altas() {
        String salida = "";
        File fichero = new File("coches.txt");

        try {
            if (!fichero.exists()) {
                fichero.createNewFile();
            }

            FileWriter fw = new FileWriter(fichero, true);
            fw.write("--- Nuevo coche ---");
            fw.write(this.matricula + "\n");
            fw.write(this.marca + "\n");
            fw.write(this.color + "\n");

            fw.close();

            salida = "Coche insertado correctamente";

        } catch (Exception e) {
            salida = "Ha surgido un error insertando el coche" + e.getMessage();
        }

        return salida;
    }

    public String listado() {
        String salida = "";

        String l = "";

        File fichero = new File("coches.txt");

        try {

            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            l = br.readLine();
            
                while (l!=null) {                
                salida = salida + System.lineSeparator() +l;
                l = br.readLine();
            }

        } catch (Exception e) {
            salida= "Ha ocurrido un error en la lectura";
        }
        return salida;
    }
}
