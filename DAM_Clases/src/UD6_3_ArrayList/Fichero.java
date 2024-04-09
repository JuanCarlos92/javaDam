/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD6_3_ArrayList;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Juan Carlos
 */
public class Fichero {

    //Creamos la ruta  con una constante
    final private String URL = "coche.dat";
    //Creamos un arrayList del objeto coche llamado datosEnMemoria
    private ArrayList<Coche> datos = new ArrayList<>();

    public Fichero() {
        try {

            File fichero = new File(URL);
            //Fichero binario Lectura.
            FileInputStream dos = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(dos);

            //Si el fichero no existe lo creas
            if (!fichero.exists()) {
                fichero.createNewFile();
            }

            //Creamos un objeto de la clase coche
            Coche cocheAux = new Coche();
            //vamos a establecer en cocheAux la matricula -> lo asignamos a la variable Matricula mediante el set
            cocheAux.setMatricula(dis.readUTF());

            //Si matricula != nulo... asigna el segundo componente a 'Marca' y  añade el objeto al array
            while (cocheAux.getMatricula() != null) {
                cocheAux.setMarca(dis.readUTF());
                datos.add(cocheAux);

                //Limpiamos el objeto coche para volver a tenerlo vacio
                cocheAux = new Coche();

                //Obtenemos de nuevo l matricula y volvemos al while
                cocheAux.setMatricula(dis.readUTF());
            }
            dis.close();
        } catch (IOException e) {

        }
    }

    public String listado() {
        String texto = "";
        //Desde la posicion 0 hasta el tamaño del arraylist datos recoge la posicion (i) 
        for (int i = 0; i < datos.size(); i++) {
            //la almacena en getMatricula y getMarca en la variable texto con saltos de linea
            texto = texto + "Matricula: " + datos.get(i).getMatricula() + System.lineSeparator();
            texto = texto + "Marca: " + datos.get(i).getMarca() + System.lineSeparator();

        }
        return texto;
    }

    public String guardar() {
        try {
            File fichero = new File(URL);
            //Fichero binario Lectura.
            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);

            //Desde la posicion 0 hasta el tamaño del arraylist datos recoge la posicion (i) 
            for (int i = 0; i < datos.size(); i++) {
                //escribiendo en el fichero cada getMatricula y getMarca
                dos.writeUTF(datos.get(i).getMatricula());
                dos.writeUTF(datos.get(i).getMarca());
            }
            dos.close();
            return "Se ha guardado correctamente";

        } catch (Exception e) {
            return "Ha habido un fallo";
        }
    }

    public String altaCoche(String matricula, String marca) {
        //Creo un coche auxiliar
        Coche nuevoCoche = new Coche();
        nuevoCoche.setMatricula(matricula);
        nuevoCoche.setMarca(marca);

        //Guardo el coche en mi arrayList y return al metodo guardar para guardar los datos introducidos en el arrayList en el fichero
        this.datos.add(nuevoCoche);
        return this.guardar();
    }

    public String eliminarCoche(String matricula) {
        boolean existe = false;
        int indice = 0;

        //Desde la posicion 0 hasta el tamaño del arraylist datos recoge la posicion (i)
        for (int i = 0; i < this.datos.size(); i++) {
            //Comparamos si en (i) getMatricula es igual a matricula
            if (this.datos.get(i).getMatricula().equals(matricula)) {
                //Guardamos la posicion i en indice, existe = true y cortamos el for.
                indice = i;
                existe = true;
                break;
            }
        }
        //Si existe elimina del arraylist la posicion que vale indice y guardamos la modificacion con el metodo guardar
        if (existe) {
            this.datos.remove(indice);
            this.guardar();
            return "Elemento borrado correctamente";
        }
        return "El elemento no existe";
    }

    public Coche buscar(String matricula) {
        //Desde la posicion 0 hasta el tamaño del arraylist datos recoge la posicion (i)
        for (int i = 0; i < this.datos.size(); i++) {
            //Comparamos si en (i) getMatricula es igual a matricula
            if (this.datos.get(i).getMatricula().equals(matricula)) {
                //retornamos la posicion (i)
                return this.datos.get(i);
            }
        }
        //sino retnornamos null. El coche no existe.
        return null;
    }
    public String modificarCoche(String matricula, String marca) {
        boolean modificado = false;
        int indice = 0;

        //Desde la posicion 0 hasta el tamaño del arraylist datos recoge la posicion (i)
        for (int i = 0; i < this.datos.size(); i++) {
            //Comparamos si en (i) getMatricula es igual a matricula
            if (this.datos.get(i).getMatricula().equals(matricula)) {
                //Guardamos la posicion i en indice, existe = true y cortamos el for.
                indice = i;
                modificado = true;
                break;
            }
        }
        //Si modificado = true vamos a obtener el indice y con el setMarca vamos a establecer la nueva marca
        if (modificado) {
            this.datos.get(indice).setMarca(marca);
            this.guardar();
            return "Elemento modificar correctamente";
        }
        return "El elemento no existe";
    }

}
