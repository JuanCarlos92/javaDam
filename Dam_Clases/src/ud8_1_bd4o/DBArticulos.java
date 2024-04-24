/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud8_1_bd4o;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

/**
 *
 * @author Juan Carlos
 */
public class DBArticulos {

    private final String path = "Articulos.yap";
    private ObjectContainer db;

    public DBArticulos() {

    }

    public String alta(Articulos articulo) {
        try {
            //variable que almacena el codigo del articulo
            boolean existeCodigo = ComprobarCodigoExistente(articulo.getCodigo());

            //si existeCodigo (es true)
            if (existeCodigo) {
                return " El codigo introducdo ya existe, utilice otro";

            }
            //sino existe....(es false)
            //creamos la conexion con la bd
            db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), path);

            //añadimos el articulo a la bd
            db.store(articulo);

            db.close();

            //return un mensaje de exito String
            return "El articulo se ha guardado correctamente";

        } catch (Exception e) {
            return "Ha habido un error conectando con la base de datos" + e.getMessage();
        }

    }

    private boolean ComprobarCodigoExistente(int codigo) {
        db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), path);
        Articulos articuloConsulta = new Articulos(codigo, null, 0, null);

        //llamamos al ObjectSet (tipo de arraylist'coleccion') con nombre resultadConsulta que 
        //recoge el codigo del articulo.
        ObjectSet<Articulos> resultadoConsulta = db.queryByExample(articuloConsulta);

        //condiconamos que el resultado consulta es o no vacio (lo mismo que size()==0)
        if (resultadoConsulta.isEmpty()) {
            //no existe ese articulo con el codigo indicado y retornamos false.
            db.close();
            return false;
        }
        //existe entonces retornamos true.
        db.close();
        return true;
    }

    public String mostrar() {
        String resultado = "";
        db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), path);
        Articulos articuloConsulta = new Articulos();

        //llamamos al ObjectSet (tipo de arraylist'coleccion') con nombre resultadConsulta que 
        //recoge el articulo.
        ObjectSet<Articulos> resultadoConsulta = db.queryByExample(articuloConsulta);

        //Si resultadoConsulta es 0
        if (resultadoConsulta.size() == 0) {
            //ceramos la bd y retornamos que no se encontraron articulos
            db.close();
            return "No se han encontrado articulos";
        }
        //si resultadoConsulta es !=0 entra al while para imprimir cada articulo
        while (resultadoConsulta.hasNext()) {

            Articulos art = (Articulos) resultadoConsulta.next();
            resultado = resultado + art.getCodigo() + "\t" + art.getNombre() + "\t"
                    + art.getPrecio() + "\t" + art.getDescricion() + "\n";

        }
        //retornamos el resultado.
        db.close();
        return resultado;
    }

    public String borrar(int codigo) {
        String resultado = "";
        db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), path);

        Articulos articuloBorrar = new Articulos(codigo, null, 0, null);

        //llamamos al ObjectSet (tipo de arraylist'coleccion') con nombre resultadConsulta que 
        //recoge el articulo.
        ObjectSet<Articulos> resultadoConsulta = db.queryByExample(articuloBorrar);

        //Si resultadoConsulta es 0
        if (resultadoConsulta.size() == 0) {
            //ceramos la bd y retornamos que no se encontraron articulos
            db.close();
            return "No se han encontrado articulos a borrar";
        }
        Articulos borrar = resultadoConsulta.next();
        db.delete(borrar);
        resultado = "El articulo se ha borrado correctamente";

        db.close();
        return resultado;
    }

    public String modificar(int codigo, String nombre, int precio, String descripcion) {
        String resultado = "";
        db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), path);

        Articulos articuloModificar = new Articulos(codigo, null, 0, null);

        //llamamos al ObjectSet (tipo de arraylist'coleccion') con nombre resultadConsulta que 
        //recoge el articulo.
        ObjectSet<Articulos> resultadoConsulta = db.queryByExample(articuloModificar);

        //Si resultadoConsulta es 0
        if (resultadoConsulta.size() == 0) {
            //ceramos la bd y retornamos que no se encontraron articulos
            db.close();
            return "No se han encontrado articulo para modificar";
        }

        Articulos art = resultadoConsulta.next();
        //si nombre no es nulo...
        if (nombre != null) {
            art.setNombre(nombre);
        }
        //si precio es 0...
        if (precio != 0) {
            art.setPrecio(precio);
        }
        //si descripcion es nulo...
        if (descripcion != null) {
            art.setDescricion(descripcion);

        }
        db.store(art);
        resultado = "El articulo se ha actualizado correctamente";

        db.close();
        return resultado;
    }
}
