/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class MostrarPremioOlimpiadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int posicion = 2;

        switch (posicion) {

            case 1:
                System.out.println("Medalla de Oro");
                break;
            case 2:
                System.out.println("Medalla de Plata");
                break;
            case 3:
                System.out.println("Medalla de Bronce");
                break;
            case 4:
                System.out.println("Diploma");
                break;
            case 5:
                System.out.println("Diploma");
                break;
            default:
                System.out.println("Sin premio");
                break;
        }
    }

}
