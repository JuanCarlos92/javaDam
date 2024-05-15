/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Juan Carlos
 */
public class CamposVaciosJFrame {

    public static String controlarCamposVacios(String codigo, String nombre, String id_localizacion, String id_manager) {
        String msg = null;
        //Control de posibles errores, si cualquier textField está vacío... entra a su if, guarda la cadena de texto en la variable msgError
        if (codigo.equals("") & nombre.equals("") & id_localizacion.equals("") & id_manager.equals("")) {
            msg = "Te has dejado todos los campos en blanco";
        } else if (codigo.equals("")) {
            msg = "Te has dejado el CODIGO en blanco";
        } else if (nombre.equals("") || id_localizacion.equals("") || id_manager.equals("")) {
            msg = "Te has dejado nombre, cantidad o descripcion en blanco";

        }
        return msg;
    }

    /**
     * Controla que el campo codigo no se encuentre vacío
     *
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
}
