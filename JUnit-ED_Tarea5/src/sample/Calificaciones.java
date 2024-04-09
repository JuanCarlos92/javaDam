/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sample;

/**
 *
 * @author Juan Carlos
 */
public class Calificaciones {
    
    

    public static float calificaciones(float examenTeorico, float examenPracticas, boolean practicaConvalidada) {

        if (examenTeorico > 7F || examenTeorico <0F) {
            System.out.println("Error rango Examen Teorico");
            return -1;
        } else if (examenPracticas > 3F || examenPracticas < 0F) {
            System.out.println("Error rango Examen Practico");
            return -1;
        } else {
            if (examenTeorico >= 3.5F) {
                if (practicaConvalidada) {
                    return examenTeorico + 1.5F;
                } else {
                    return examenTeorico + examenPracticas;
                }
            } else {
                return examenTeorico;
            }
        }
    }
}
