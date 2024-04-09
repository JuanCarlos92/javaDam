package U2_01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class ConversorDist {
    private double distancia;
    private String medida;
    
    public ConversorDist(){
        this.distancia = 0;
        this.medida = null;
    }
    public ConversorDist(double distancia, String medida){
        this.distancia = distancia;
        this.medida = medida;
    }
    public double getdistancia(){
        return distancia;
    }
    
    public void setdistancia(double distancia){
        this.distancia = distancia;
        
    }
    public String getmedida(){
        return medida;
    }
    public void setmedida(String medida){
        this.medida = medida;
    }
    public double millasAkilometros(){
        double conversor=0;
        
        if(medida == "millas"){
            this.medida = "kilometros";
            conversor = this.distancia * 1852;
            this.distancia = conversor;
            }
        else if(this.medida =="kilometros"){
            conversor = this.distancia;
        }
        return this.distancia;
    }
    public double kilometrosAmillas(){
        double conversor=0;
        
        if(medida=="kmetros"){
            this.medida ="millas";
            conversor = this.distancia /1852;
            this.distancia = conversor;
        }
        else if(this.medida =="millas"){
            conversor = this.distancia;
        }
        return this.distancia;
   }
}
