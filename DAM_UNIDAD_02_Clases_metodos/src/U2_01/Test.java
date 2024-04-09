package U2_01;


import U2_01.ConversorDist;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConversorDist milla = new ConversorDist (5, "millas");
        System.out.println(milla.getdistancia()+ " " + milla.getmedida()+ " equivalen a " + milla.millasAkilometros() + " kilometros");
        
        ConversorDist km = new ConversorDist (9260.0,"kilometros");
        System.out.println(km.getdistancia() + " " + km.getmedida()+ " equivalen a " + km.kilometrosAmillas()+ " millas");
    }

}
