/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import com.db4o.ObjectSet;
import javax.swing.JOptionPane;
import modelo.Articulos;

/**
 *
 * @author Juan Carlos
 */
public class ControladorErrores {

    /**
     * Controla que ningun campo se encuentre vacío
     * @param codigo
     * @param nombre
     * @param cantidad
     * @param descripcion
     * @return retorna el mensaje
     */
    public static String controlarCamposVacios(String codigo, String nombre, String cantidad, String descripcion) {
        String msg = null;
        //Control de posibles errores, si cualquier textField está vacío... entra a su if, guarda la cadena de texto en la variable msgError
        if (codigo.equals("") & nombre.equals("") & cantidad.equals("") & descripcion.equals("")) {
            msg = "Te has dejado todos los campos en blanco";
        } else if (codigo.equals("")) {
            msg = "Te has dejado el CODIGO en blanco";
        } else if (nombre.equals("") || cantidad.equals("") || descripcion.equals("")) {
            msg = "Te has dejado nombre, cantidad o descripcion en blanco";

        }
        return msg;
    }
    
    /**
     * Controla que el campo codigo no se encuentre vacío
     * @param codigo
     * @return retorna el mensaje 
     */
    public static String controlarCampoCodigo(String codigo) {
        String msg = null;
        //Control de posibles errores, si cualquier textField está vacío... entra a su if, guarda la cadena de texto en la variable msgError
        if (codigo.equals("")) {
            msg = "Te has dejado el CODIGO en blanco";

        }
        return msg;
    }
    
    /**
     * JoptionPanel de error
     * @param msg mensaje a mostrar
     */
    public static void ErrorshowDialog(String msg) {
        JOptionPane.showMessageDialog(null, msg,
                "Error", JOptionPane.ERROR_MESSAGE);
    }
    /**
     * JoptionPanel para preguntar
     * @param msg  mensaje a mostrar
     * @param option1 Si
     * @param option2 NO
     * @return 
     */
    public static int PreguntashowDialog(String msg, String option1, String option2) {
        int pregunta = JOptionPane.showOptionDialog(null, msg,
                "Ventana de confirmación", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{option1, option2}, "SI");
        return pregunta;
    }

    /**
     * JoptionPanel de informacion
     * @param msg mensaje a mostrar
     */
    public static void InfoshowDialog(String msg) {
        JOptionPane.showMessageDialog(null, msg,
                "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
    }
}
