/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jcfm.gestion;

import com.jcfm.modelo.Articulos;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Carlos
 */
public class GestorBD {

    private ObjectContainer bd;
    final private String URL_BD = "productos.yap";

    public void gestorBD() {
        try {
            bd = Db4oEmbedded.openFile(
                    Db4oEmbedded.newConfiguration(), URL_BD);
        } catch (Exception e) {
            ErrorshowDialog("Ha habido un error al conectar con la base de datos" + e.getMessage());
        }

    }

    /**
     * Inserta un artículo en la Base de Datos
     *
     * @param articulo
     * @return
     */
    public String insert(Articulos articulo) {
        try {
            gestorBD();
            bd.store(articulo);
            bd.close();
            return "El articulo se ha insertado correctamente";
        } catch (Exception e) {
            return "Ha ocurrido un error";
        }
    }

    public Articulos buscar(String codigo) {
        Articulos articulo = new Articulos(codigo, null, null, null);

        ObjectSet<Articulos> resultado = consultar(articulo);

        if (resultado.isEmpty()) {
            return null;
        } else {
            return resultado.next();
        }
    }

    public void eliminar(Articulos articulo) {
        bd.delete(articulo);
    }

    public void mostrar() {

        ObjectSet<Articulos> resultado = bd.query(Articulos.class);

        if (resultado.isEmpty()) {
            System.out.println("No hay articulos para mostrar");
        } else {
            System.out.println("Números de articulos: " + resultado.size());
            while (resultado.hasNext()) {
                Articulos Articulo_actual = resultado.next();
                System.out.println(
                        "\n\tCodigo: " + Articulo_actual.getNombre()
                        + "\n\tNombre: " + Articulo_actual.getNombre()
                        + "\n\tCantidad: " + Articulo_actual.getNombre()
                        + "\n\tDescripcion: " + Articulo_actual.getNombre());
            }
        }
        bd.close();
    }

    public ObjectSet<Articulos> consultar(Articulos articulo) {
        Query consulta = bd.query();
        consulta.constrain(articulo);
        ObjectSet<Articulos> resultado = consulta.execute();
        return resultado;
    }

    public void ErrorshowDialog(String msg) {
        JOptionPane.showMessageDialog(null, msg,
                "Error", JOptionPane.ERROR_MESSAGE);
    }

}
