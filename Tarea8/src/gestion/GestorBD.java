/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import modelo.Articulos;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.io.Closeable;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Carlos
 */
public class GestorBD {

    private ObjectContainer bd;
    final private String URL_BD = "productos.yap";

    /**
     * Abrir conexion con la BD pasándole una configuración vacía y la ruta
     * donde se va a almacenar la BD
     */
    public void conectionBD() {
        try {
            bd = Db4oEmbedded.openFile(
                    Db4oEmbedded.newConfiguration(), URL_BD);
        } catch (Exception e) {
            ErrorshowDialog("Ha habido un error al conectar con la base de datos\n" + e.getMessage());
        }

    }

    /**
     * Inserta un artículo en la Base de Datos
     *
     * @param articulo
     * @return
     */
    public String insert(Articulos articulo) {
        //variable que almacena el codigo del articulo
        boolean existeCod = ComprobarSiExisteArticulo(articulo.getCodigo());
        try {
            //si existeCodigo (es true)
            if (existeCod) {
                return " Este codigo de articulo ya existe";
            }
            //sino existe....(es false)
            //Establecemos conexión con la BD, añadimos el articulo y cerramos la conexión
            conectionBD();
            bd.store(articulo);
            bd.close();
            return "El articulo se ha insertado correctamente";

        } catch (Exception e) {
            return "Ha ocurrido un error";
        }
    }

    /**
     * Busca un articulo a partir de del código introducido
     *
     * @param codigo
     * @return el articulo rellenando los campos nombre, cantidad, descripcion
     */
    public Articulos select(int codigo) {
        //Establecemos conexión a la BD, creamos un objeto articulo con el codigo
        conectionBD();
        Articulos articuloSelect = new Articulos(codigo, null, 0, null);

        //llamamos al ObjectSet(coleccion 'parecido a un ArrayList') con nombre resultSelect que recoge el articulo.
        ObjectSet<Articulos> resultSelect = bd.queryByExample(articuloSelect);

        //Si no encuentra articulos con ese codigo retorna null.
        if (resultSelect.isEmpty()) {
            bd.close();
            return null;
            //Si resultadoSelect no es vacio entonces retorna el contenido.
        } else {
            return resultSelect.next();
        }

    }

    public String delete(int codigo) {
        String resultado;
        //Establecemos conexión a la BD, creamos un objeto articulo con el codigo
        conectionBD();

        Articulos articuloDelete = new Articulos(codigo, null, 0, null);

        //llamamos al ObjectSet (coleccion 'parecido a un ArrayList') con nombre resultSelect que recoge el articulo.
        ObjectSet<Articulos> resultSelec = bd.queryByExample(articuloDelete);

        //Si resultadoConsulta es 0
        if (resultSelec.isEmpty()) {
            //cerramos la bd y retornamos que no se encontraron articulos
            bd.close();
            return "No se han encontrado articulo para borrar";
        }
        Articulos borrar = resultSelec.next();
        bd.delete(borrar);
        resultado = "El articulo se ha borrado correctamente";

        bd.close();
        return resultado;
    }

    public String update(int codigo, String nombre, int cantidad, String descripcion) {
        String resultado;
        //Establecemos conexión a la BD, creamos un objeto articulo con el codigo
        conectionBD();

        Articulos articuloUpdate = new Articulos(codigo, null, 0, null);

        //llamamos al ObjectSet (tipo de arraylist'coleccion') con nombre resultadConsulta que 
        //recoge el articulo.
        ObjectSet<Articulos> resultSelect = bd.queryByExample(articuloUpdate);

        //Si resultadoConsulta es vacio
        if (resultSelect.isEmpty()) {
            //cerramos la bd y retornamos que no se encontraron articulos
            bd.close();
            return "No se han encontrado articulo para modificar";
        }
        //Si resultadoC
        Articulos art = resultSelect.next();
        //si nombre no es nulo...
        if (nombre != null) {
            art.setNombre(nombre);
        }
        //si precio es 0...
        if (cantidad != 0) {
            art.setCantidad(cantidad);
        }
        //si descripcion es nulo...
        if (descripcion != null) {
            art.setDescripcion(descripcion);

        }
        //Actualizamos el articulo y guardamos el mensaje en resultado
        bd.store(art);
        resultado = "El articulo se ha actualizado correctamente";

        //ceramos la BD y retornamos la variable resultado
        bd.close();
        return resultado;
    }

    public String view() {
        String resultado = "";
        //Establecemos conexión a la BD, creamos un objeto articulo con el codigo
        conectionBD();
        Articulos articuloSelec = new Articulos();

        //llamamos al ObjectSet (tipo de arraylist'coleccion') con nombre resultadConsulta que 
        //recoge el articulo.
        ObjectSet<Articulos> resultSelec = bd.queryByExample(articuloSelec);

        //Si resultadoConsulta es 0
        if (resultSelec.isEmpty()) {
            //ceramos la bd y retornamos que no se encontraron articulos
            bd.close();
            return "No se han encontrado articulos";
        }
        //si resultadoConsulta es !=0 entra al while para recoger cada articulo 
        //almacenandolo en la variable resultado y repitiendo el while hasta no obtener más articulos.
        while (resultSelec.hasNext()) {

            Articulos art = (Articulos) resultSelec.next();
            resultado = resultado + art.getCodigo() + "\t" + art.getNombre() + "\t"
                    + art.getCantidad() + "\t" + art.getDescripcion() + "\n";

        }
        //retornamos el resultado.
        bd.close();
        return resultado;
    }

    public ObjectSet<Articulos> consultar(Articulos articulo) {
        Query consulta = bd.query();
        consulta.constrain(articulo);
        ObjectSet<Articulos> resultado = consulta.execute();
        return resultado;
    }

    private boolean ComprobarSiExisteArticulo(int codigo) {

        conectionBD();
        Articulos articuloConsulta = new Articulos(codigo, null, 0, null);

        //llamamos al ObjectSet (tipo de arraylist'coleccion') con nombre resultadConsulta que 
        //recoge el codigo del articulo.
        ObjectSet<Articulos> resultadoConsulta = bd.queryByExample(articuloConsulta);

        //condiconamos que el resultado consulta es o no vacio (lo mismo que size()==0)
        if (resultadoConsulta.isEmpty()) {
            //no existe ese articulo con el codigo indicado y retornamos false.
            bd.close();
            return false;
        }
        //existe entonces retornamos true.
        bd.close();
        return true;
    }

    public void ErrorshowDialog(String msg) {
        JOptionPane.showMessageDialog(null, msg,
                "Error", JOptionPane.ERROR_MESSAGE);
    }

}
