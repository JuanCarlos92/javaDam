/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juancarlosfiltermartintarea6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author Juan Carlos
 */
public class Fichero {

    //Creamos la ruta con una constante
    final private String URL = "productos.dat";
    //Variable contador para controlar si hay errores
    private boolean contador = false;
    //ArrayList de la clase Producto
    private ArrayList<Producto> almacen = new ArrayList<>();

    public Fichero() {
        try {

            File fichero = new File(URL);
            //Fichero de  Lectura.
            //Fichero binario Lectura.
            FileInputStream dos = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(dos);

            //Si el fichero no existe lo creas
            if (!fichero.exists()) {
                fichero.createNewFile();
            }

            //Creamos un objeto de la clase Producto
            Producto prodAux = new Producto();
            //vamos a establecer en prodAux el codigo -> lo asignamos a la variable codigo mediante el set
            prodAux.setCodigo(dis.readUTF());

            //Si matricula != nulo... asigna el segundo componente a 'Nombre' y  añade el objeto al array
            while (prodAux.getCodigo() != null) {
                prodAux.setNombre(dis.readUTF());
                prodAux.setCantidad(dis.readUTF());
                prodAux.setDescripcion(dis.readUTF());
                almacen.add(prodAux);

                //Limpiamos el objeto prodAux para volver a tenerlo vacio
                prodAux = new Producto();

                //Obtenemos de nuevo l codigo y volvemos al while
                prodAux.setCodigo(dis.readUTF());
            }
            dis.close();
        } catch (IOException e) {

        }
    }

    public String mostrarListado() {
        String texto = "";
        //Desde la posicion 0 hasta el tamaño del arraylist datos recoge la posicion (i) 
        for (int i = 0; i < almacen.size(); i++) {
            //Almacena en texto la posicion (i) y cogiendo cada campo con su get.
            texto = texto + "---  PRODUCTO  " + (almacen.get(i).getNombre()).toUpperCase() + "  ---" + System.lineSeparator();
            texto = texto + "->Código:  " + almacen.get(i).getCodigo() + System.lineSeparator();
            texto = texto + "->Nombre:  " + almacen.get(i).getNombre() + System.lineSeparator();
            texto = texto + "->Cantidad:  " + almacen.get(i).getCantidad() + System.lineSeparator();
            texto = texto + "->Descripción:  " + almacen.get(i).getDescripcion() + System.lineSeparator();
        }
        return texto;
    }

    public void guardar() {
        try {
            File fichero = new File(URL);
            //Fichero binario Lectura.
            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);
            //Desde la posicion 0 hasta el tamaño del arraylist datos recoge la posicion (i) 
            for (int i = 0; i < almacen.size(); i++) {
                //escribiendo en el fichero cada get
                dos.writeUTF(almacen.get(i).getCodigo());
                dos.writeUTF(almacen.get(i).getNombre());
                dos.writeUTF(almacen.get(i).getCantidad());
                dos.writeUTF(almacen.get(i).getDescripcion());

            }
            dos.close();
            //Siempre que el contador sea falso significa que tanto borrar producto como modificar 
            //a la hora de pasar por este método no ejecute el JoptionPane de insertar.
            if (!this.contador) {
                InfoshowDialog("Se ha insertado correctamente");
            }

        } catch (IOException e) {
            ErrorshowDialog("Se ha producido un error al insertar el producto");
        }
    }

    public void insertarProducto(String codigo, String nombre, String cantidad, String descripcion) {
        boolean error = false;
        String msg = null;
        //Creo un producto auxiliar
        Producto nuevoProducto = new Producto();
        nuevoProducto.setCodigo(codigo);
        nuevoProducto.setNombre(nombre);
        nuevoProducto.setCantidad(cantidad);
        nuevoProducto.setDescripcion(descripcion);
        //Desde la posicion 0 hasta el tamaño del arraylist datos recoge la posicion (i)
        for (int i = 0; i < this.almacen.size(); i++) {
            if (this.almacen.get(i).getCodigo().equals(codigo)) {
                //Guardamos la posicion i en indice, existe = true y cortamos el for.
                error = true;
                break;
            }
        }
        //Si existe error es true entonces va a mandar el siguiente error
        if (error) {
            msg = "Este código de producto ya existe";

        }
        if (msg != null) {
            ErrorshowDialog(msg);
            return;
        }

        //Control de posibles errores, si cualquier textField está vacío... entra a su if, guarda la cadena de texto en la variable msgError
        if (codigo.equals("") & nombre.equals("") & cantidad.equals("") & descripcion.equals("")) {
            msg = "Te has dejado todos los campos en blanco";
        } else if (codigo.equals("")) {
            msg = "Te has dejado el CODIGO en blanco";
        } else if (nombre.equals("") || cantidad.equals("") || descripcion.equals("")) {
            msg = "Te has dejado nombre, cantidad o descripcion en blanco";

        }
        if (msg != null) {
            ErrorshowDialog(msg);
            return;
        }

        //Si no existe Guardo el producto en mi arrayList y return al metodo guardar() para guardar los datos introducidos en el arrayList en el fichero
        this.almacen.add(nuevoProducto);
        this.guardar();

    }

    public void borrarProducto(String codigo) {
        boolean existe = false;
        int question;
        int indice = 0;
        //Desde la posicion 0 hasta el tamaño del arraylist datos recoge la posicion (i)
        for (int i = 0; i < this.almacen.size(); i++) {
            //Comparamos si en (i) getCodigo es igual a codigo
            if (this.almacen.get(i).getCodigo().equals(codigo)) {
                //Guardamos la posicion i en indice, existe = true y cortamos el for.
                indice = i;
                existe = true;
                break;
            }
        }
        //Si existe va a preguntar si desea borrarlo 
        if (existe) {
            question = PreguntashowDialog("¿Estás seguro de que deseas borrar este producto?","SI","NO");
            /*Si es lo confirma entonces elimina del arraylist la posicion que vale indice y 
            guardamos la modificacion con el metodo guardar*/
            if (question == 0) {
                this.contador = true;
                this.almacen.remove(indice);
                this.guardar();
                InfoshowDialog("Se ha borrado correctamente");
            } else {
                ErrorshowDialog("Ha ocurrido un error al borrar este producto");
            }
        }
    }

    public Producto buscar(String codigo) {
        //Desde la posicion 0 hasta el tamaño del arraylist datos recoge la posicion (i)
        for (int i = 0; i < this.almacen.size(); i++) {
            //Comparamos si en (i) getCodigo es igual a codigo
            if (this.almacen.get(i).getCodigo().equals(codigo)) {
                //retornamos la posicion (i)
                return this.almacen.get(i);
            }
        }
        //sino pues retornamos null (El producto no existe)
        return null;
    }

    public ArrayList<Producto> findCoincidencia(String codigo) {
        //Se crea un arrayAuxiliar para guardar las coincidencias
        ArrayList<Producto> arrayCoincidencia = new ArrayList<>();
        // Búsqueda por cualquier coincidencia que contenga codigo
        Pattern pattern = Pattern.compile(".*" + codigo + ".*");

        // Recorrer desde la posicion 0 hasta el tamaño del arraylist y se 
        for (int i = 0; i < this.almacen.size(); i++) {
            /*va recogiendo el codigo en la posición (i) del array y este se 
           busca una coincidencia del pattern creado con el matcher */
            Matcher matcher = pattern.matcher(this.almacen.get(i).getCodigo());

            if (matcher.find()) {
                /*se va almacenando cada posición que contenga coincidencia
                con el codigo en el array Auxliar*/
                arrayCoincidencia.add(this.almacen.get(i));
            }

        }
        //al llamar a este método retornamos el array
        return arrayCoincidencia;

    }

    public void modificarProducto(String codigo, String nombre, String cantidad, String descripcion) {
        boolean modificado = false;
        int indice = 0;

        //Desde la posicion 0 hasta el tamaño del arraylist datos recoge la posicion (i)
        for (int i = 0; i < this.almacen.size(); i++) {
            //Comparamos si en (i) getCodigo es igual a codigo
            if (this.almacen.get(i).getCodigo().equals(codigo)) {
                //Guardamos la posicion i en indice, existe = true y cortamos el for.
                indice = i;
                modificado = true;
                break;
            }
        }
        /*Si modificado = true vamos a obtener el indice y con el setNombre, setCantidad 
        y setDescripcion vamos a establecer los nuevos datos*/
        if (modificado) {
            this.contador = true;
            this.almacen.get(indice).setNombre(nombre);
            this.almacen.get(indice).setCantidad(cantidad);
            this.almacen.get(indice).setDescripcion(descripcion);
            this.guardar();
            InfoshowDialog("El Producto se ha modificado correctamente");
        } else {
            ErrorshowDialog("Ha ocurrido un error al intentar modificar el producto");
        }
    }

    /**
     * Metodos para los diferentes JOptionPane
     *
     * @param msg recibe el mensaje de error o exito
     */
    public void ErrorshowDialog(String msg) {
        JOptionPane.showMessageDialog(null, msg,
                "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void InfoshowDialog(String msg) {
        JOptionPane.showMessageDialog(null, msg,
                "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
    }

    public int PreguntashowDialog(String msg, String option1, String option2) {
        int question = JOptionPane.showOptionDialog(null, msg,
                "Ventana de confirmación", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{option1, option2}, "SI");
        return question;
    }

}
