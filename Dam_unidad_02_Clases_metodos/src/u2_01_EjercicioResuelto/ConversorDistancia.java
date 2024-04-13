package U2_01_Solucion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class ConversorDistancia {
    private double distancia;
    private String medida;
    
    public ConversorDistancia(){
        this.distancia=0;
        this.medida=null;
    }
    
    public ConversorDistancia(double distancia, String medida){
        this.distancia=distancia;
        this.medida=medida;  
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }
    
    public double millasAKMetros() {
        
        double conversion=0;
        
        if(this.medida=="Millas"){
            this.medida="KMetros";
            conversion=this.distancia*1852;
            this.distancia=conversion;
        }
        else if(this.medida=="KMetros"){
            conversion=this.distancia;
        }
        
        return this.distancia;
        
    }
    
    public double kmetrosAMillas() {
        
        double conversion=0;
        
        if(this.medida=="Millas"){
            conversion=this.distancia;
        }
        else if(this.medida=="KMetros"){
            this.medida="Millas";
            conversion=this.distancia/1852;
            this.distancia=conversion;
        }
        
        return this.distancia;
        
    }
    
}
