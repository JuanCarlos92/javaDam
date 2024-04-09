/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD5_5_Interfaz_ventana;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.DefaultListModel;

/**
 *
 * @author Juan Carlos
 */
public class vehiculo {

    //atributos
    private String matricula;
    private String marca;
    private String color;
    final private String fichero = "datos.dat";

    //constructores
    public vehiculo(String matricula, String marca, String color) {
        this.matricula = matricula;
        this.marca = marca;
        this.color = color;
    }

    public vehiculo() {
    }

    //getter/setter
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //metodos de la clase
    public String altas() {
        String respuesta = "";

        try {
            File fch = new File(fichero);
            if (!fch.exists()) {
                fch.createNewFile();
            }
            FileOutputStream fis = new FileOutputStream(fch, true);
            DataOutputStream io = new DataOutputStream(fis);
            
            io.writeUTF(this.matricula);
            io.writeUTF(this.marca);
            io.writeUTF(this.color);
            
            io.close();
            fis.close();
            
            respuesta = "alta correcta";
                     
        } catch (Exception e) {
            respuesta = "Error con el alta..." + e.getMessage();
        }
        
        return respuesta;
    }
    
    public void mostrar(DefaultListModel m){
        try {
            File file = new File(fichero);
            FileInputStream fi = new FileInputStream(file);
            DataInputStream io = new DataInputStream(fi);
            
            this. matricula = io.readUTF();
            
            while (this.matricula != null) {
                this.marca = io.readUTF();
                this.color=io.readUTF();
                m.addElement("Matricula:"+this.matricula+ " Marca:"+this.marca+ "Color:"+this.color);
                
                this.matricula = io.readUTF();
                
                io.close();
            }
        } catch (Exception e) {
        }
        
    }

}
