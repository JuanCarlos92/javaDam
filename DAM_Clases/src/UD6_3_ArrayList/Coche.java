/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD6_3_ArrayList;

/**
 *
 * @author Juan Carlos
 */
public class Coche {
    //ATRIBUTOS DE CLASE
    private String matricula;
    private String marca;
    
    //CONSTRUCTORES DE CLASE
    public Coche(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
    }

    public Coche() {
    }
    
    //METODO GETTERS Y SETTERS
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
    
}

