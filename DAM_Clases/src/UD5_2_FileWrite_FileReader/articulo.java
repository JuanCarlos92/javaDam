/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD5_2_FileWrite_FileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Juan Carlos
 */
public class articulo {
     private int codigo;
        private String nombre;
        private double precio;
        private String descripcion;
        private final String  urlTrabajo= "C:\\Users\\Juan Carlos\\Desktop\\";

    public articulo(int codigo, String nombre, double precio, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public articulo() {
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
        
    public void grabar(){
        File fichero = new File(urlTrabajo + "ficheroDeArticulo.txt");
        
        try {
            if (!fichero.exists()) {
                fichero.createNewFile();
            }
            FileWriter fw =new FileWriter(fichero, true);
            fw.write(this.codigo + ", ");
            fw.write(this.nombre + ", ");
            fw.write(Double.toString(this.precio) + ", ");
            fw.write(this.descripcion);
            
            fw.close();
        } catch (IOException ex) {
            System.out.println("Se ha producido un error");
        }
    }
    public void listar(){
        File fichero = new File(urlTrabajo + "ficheroDeArticulo.txt");
        
        try {
            FileReader fr = new FileReader(fichero);
            BufferedReader bf = new BufferedReader(fr);
            
            String linea = bf.readLine();
            
            while (linea != null) {
                System.out.println(linea);                
                linea =bf.readLine();
            }
            fr.close();
        } catch (IOException ex) {
            System.out.println("Se ha producido un error");
        }
    }
        
        
    }
 
