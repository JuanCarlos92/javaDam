/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;


public class Pais {
    private Integer id;
    private String nombrePais;
    
    public Pais(){ 
        this.id = null;
        this.nombrePais = null;
    }
    
    public Pais(Integer id, String nombrePais){
        this.id = id;
        this.nombrePais = nombrePais;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public Integer getId(){
        return this.id;
    }
    
    public void setNombrePais(String nombrePais){
        this.nombrePais = nombrePais;
    }
    public String getNombrePais(){
        return this.nombrePais;
    }
}