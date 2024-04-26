/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import modelo.Articulos;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

/**
 *
 * @author Juan Carlos
 */
public class GestorBD {

    private ObjectContainer bd;
    final private String URL_BD = "Tarea8.yap";

    /**
     * Abrir conexion con la BD pasándole una configuración vacía y la ruta
     */
    public void conectarBD() {
        try {
            bd = Db4oEmbedded.openFile(
                    Db4oEmbedded.newConfiguration(), URL_BD);
        } catch (Exception e) {
            ControladorErrores.ErrorshowDialog("Ha habido un error al conectar con la base de datos\n" + e.getMessage());
        }

    }

    /**
     * Inserta un artículo en la BD
     *
     * @param articulo
     */
    public void insertar(Articulos articulo) {

        try {
            //si existe el codigo de articulo (es true)... indicamos que ya existe
            if (ComprobarSiExisteArticulo(articulo.getCodigo())) {
                ControladorErrores.ErrorshowDialog(" Este codigo de articulo ya existe");
                return;
            }

            //Conectamos con la BD
            conectarBD();
            //sino existe(es false)... añadimos el articulo 
            bd.store(articulo);
            ControladorErrores.InfoshowDialog("El articulo se ha insertado correctamente");

        } catch (Exception e) {
            ControladorErrores.ErrorshowDialog("Ha habido un error al insertar el artículo en la BD\n" + e.getMessage());
        } finally {
            bd.close(); //cerramos conexión con la BD
        }
    }

    /**
     * Busca un articulo a partir del código introducido
     *
     * @param codigo
     * @return el articulo rellenando los campos nombre, cantidad, descripcion o
     * null si no se encuentra
     */
    public Articulos buscar(int codigo) {
        //Establecemos conexión a la BD
        conectarBD();

        try {
            //llamamos al ObjectSet(coleccion 'parecido a un ArrayList') 
            //con nombre resultBuscar que recoge el articulo con el codigo.
            ObjectSet<Articulos> resultBuscar = bd.queryByExample(new Articulos(codigo, null, 0, null));

            //Si no hay articulo con el codigo retorna null.
            if (resultBuscar.isEmpty()) {
                return null;

                //Si hay articulo con el codigo hay articulo con el codigo entonces retorna el contenido.   
            } else {
                return resultBuscar.next();
            }

        } catch (Exception e) {
            ControladorErrores.ErrorshowDialog("Ha habido un error al buscar el artículo en la BD\n" + e.getMessage());
            return null;
        } finally {

            bd.close();
        }

    }

    /**
     * Borra un articulo a partir del código introducdo
     *
     * @param codigo
     */
    public void borrar(int codigo) {

        //Establecemos conexión a la BD
        conectarBD();
        try {
            //llamamos al ObjectSet (coleccion 'parecido a un ArrayList') 
            //con nombre resultBuscar que recoge el articulo con el codigo.
            ObjectSet<Articulos> resultBuscar = bd.queryByExample(new Articulos(codigo, null, 0, null));

            //Si resultBuscar es vacio... cerramos la BD y indicamos que no hay articulos
            if (resultBuscar.isEmpty()) {
                ControladorErrores.ErrorshowDialog("No se ha encontrado el articulo referente a ese codigo");
            } else {

                int pregunta = ControladorErrores.PreguntashowDialog("¿Estás seguro de que deseas borrar este artículo?", "SI", "NO");

                //Si la pregunta es 0 (significa "SI")... Borramos el articulo de la bd
                if (pregunta == 0) {
                    bd.delete(resultBuscar.next());
                    ControladorErrores.InfoshowDialog("Se ha borrado correctamente");

                    //Si la pregunta no es 0(significa "NO")... No eliminamos el articulo   
                } else {

                    ControladorErrores.InfoshowDialog("El articulo no se ha eliminado");
                }
            }
        } catch (Exception e) {
            ControladorErrores.ErrorshowDialog("Ha habido un error al borrar el artículo en la BD\n" + e.getMessage());
        } finally {
            bd.close(); //cerramos conexión con la BD
        }

    }

    /**
     * Actualiza el articulo en la bd
     *
     * @param codigo Codigo referente para actualizar el articulo
     * @param nombre Nombre a modificar
     * @param cantidad cantidad a modificar
     * @param descripcion descripcion a modificar
     */
    public void actualizar(int codigo, String nombre, int cantidad, String descripcion) {
        //Establecemos conexión a la BD
        conectarBD();
        try {
            //llamamos al ObjectSet (coleccion 'parecido a un ArrayList')
            //con nombre resultBuscar que recoge el articulo con el codigo.
            ObjectSet<Articulos> resultBuscar = bd.queryByExample(new Articulos(codigo, null, 0, null));

            //Si resultbuscar es vacio... cerramos la bd y indicamos que  no hay articulos
            if (resultBuscar.isEmpty()) {
                ControladorErrores.ErrorshowDialog("No se ha encontrado el articulo para modificar");
            }

            //En cambio si tuviera articulos con el codigo indicado... creamos un objeto articulo del resultBuscar
            Articulos articulo = resultBuscar.next();
            //si nombre no es nulo... añadimos el nombre a objeto
            if (nombre != null) {
                articulo.setNombre(nombre);
            }

            //si precio es 0... añadimos el precio a objeto
            if (cantidad != 0) {
                articulo.setCantidad(cantidad);
            }

            //si descripcion es nulo... añadimos la descripcion a objeto
            if (descripcion != null) {
                articulo.setDescripcion(descripcion);

            }

            //Actualizamos el articulo, mostramos mensaje de exito y cerramos la BD
            bd.store(articulo);
            ControladorErrores.InfoshowDialog("El artículo se ha modificado correctamente");

        } catch (Exception e) {
            ControladorErrores.ErrorshowDialog("Ha habido un error al actualizar el artículo en la BD\n" + e.getMessage());
        } finally {
            bd.close();//cerramos conexión con la BD
        }

    }

    /**
     * Muestra todos los articulos de la BD
     *
     * @return una cadena de texto con toda la informacion
     */
    public String mostrar() {
        //Establecemos conexión a la BD
        conectarBD();
        try {
            String resultado;

            //llamamos al ObjectSet (coleccion 'parecido a un ArrayList') con nombre resultBuscar que recoge el articulo
            ObjectSet<Articulos> resultBuscar = bd.queryByExample(new Articulos());

            //Si resultBuscar es vacio (no hay articulos)
            if (resultBuscar.isEmpty()) {
                //Almacenamos en resultado que no se encontraron articulos
                resultado = "No se han encontrado articulos en la BD";

            } else {
                //si resultBuscar no está vacio... entra al while para recoger cada articulo 
                //almacenandolo en la variable resultado y repitiendo el while hasta no obtener más articulos.
                resultado = "Números de articulos: " + resultBuscar.size() + "\n";
                while (resultBuscar.hasNext()) {

                    Articulos art = (Articulos) resultBuscar.next();
                    resultado = resultado + "\nCódigo: " + art.getCodigo()
                            + "\nNombre: " + art.getNombre()
                            + "\nCantidad: " + art.getCantidad()
                            + "\nDescripción: " + art.getDescripcion() + "\n";

                }
            }
            //retornamos el resultado.
            return resultado;

        } catch (Exception e) {
            ControladorErrores.ErrorshowDialog("Ha habido un error al mostrar los artículos en la BD\n" + e.getMessage());
            return null;
        } finally {
            bd.close(); //cerramos conexión con la BD
        }

    }

    /**
     * Comprueba si existe un articulo con el cidog dado en la BD
     *
     * @param codigo
     * @return True si existe, false si no
     */
    private boolean ComprobarSiExisteArticulo(int codigo) {
        conectarBD();
        try {
            //llamamos al ObjectSet (coleccion 'parecido a un ArrayList') con nombre resultBuscar que recoge el codigo del articulo.
            ObjectSet<Articulos> resultBuscar = bd.queryByExample(new Articulos(codigo, null, 0, null));

            return !resultBuscar.isEmpty();

        } finally {
            bd.close(); //cerramos conexión con la BD
        }

    }

}
