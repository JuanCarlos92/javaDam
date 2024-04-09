package U2_01_Solucion;


import U2_01_Solucion.ConversorDistancia;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConversorDistancia distMillas = new ConversorDistancia(5.5,"Millas");
        System.out.println(distMillas.getDistancia()+" "+distMillas.getMedida()+" "+" equivalen a: "+distMillas.millasAKMetros());
        
        ConversorDistancia distKm = new ConversorDistancia(25000,"KMetros");
        System.out.println(distKm.getDistancia()+" "+distKm.getMedida()+" "+" equivalen a: "+distKm.kmetrosAMillas());
        
    }
    
}
