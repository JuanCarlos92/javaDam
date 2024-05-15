/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud9_1y2;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Juan Carlos
 */
public class ConectorBaseDatos {

    public ConectorBaseDatos() {
    }

    //C
    public int altas(String nombre, String apellidos, int id_persona) {

        int resultado = 0; //Inicializamos una variable resultado a 0

        try {
            //paso1. Decir que tipo de bbdd tengo
            Class.forName("com.mysql.jdbc.Driver");

            //Paso2. Crear la conexion
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/basesRelacionales", "foc1", "foc");

            //Paso3. crear la consulta en la variable sql
            String sql = "insert into personas values (?,?)"; //se le dice a java que en un punto dado las "?" deben ser sustituidas

            //Paso4. Preparo el statement
            PreparedStatement sentencia = cn.prepareStatement(sql);

            sentencia.setInt(1, id_persona);
            sentencia.setString(2, nombre);      //1º ?
            sentencia.setString(3, apellidos);   // 2º ?

            //Paso5. Ejecuto al sentencia
            resultado = sentencia.executeUpdate();

            //Cierro la conexion
            cn.close();

        } catch (Exception e) {
            System.out.println("Problema al conectar con la BBDD: " + e.getMessage());
        }

        return resultado;
    }

    //R
    public ArrayList<Persona> mostrar() {
        //Se crea un arraylist
        ArrayList<Persona> respuesta = new ArrayList<Persona>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/basesRelacionales", "foc1", "foc");
            Statement sentencia = conexion.createStatement();

            String query = "SELECT * from personas";
            ResultSet resultado = sentencia.executeQuery(query);

            while (resultado.next()) {
                //Se crea objeto de la clase persona
                Persona p = new Persona();
                
                //Se va  añadiendo cada  valor en el objeto persona
                p.setId_persona(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setApellidos(resultado.getString(3));
                
                //se añade el objeto completo en la respuesta(Arraylist)
                respuesta.add(p);
            }

            sentencia.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error de sql" + e.getMessage());
        } catch (ClassNotFoundException e) {
            Logger.getLogger(ConectorBaseDatos.class.getName()).log(Level.SEVERE, null, e);
        } catch (Exception e) {
            System.out.println("Error general" + e.getMessage());
        }
        return respuesta;
    }

    //U
    public int actualizar(int id, String nombre, String apellidos) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/basesRelacionales", "foc1", "foc");

            String query = "Update personas set nombre = ?, apellidos = ? where id_persona = ?";
            PreparedStatement sentencia = conexion.prepareStatement(query);

            sentencia.setString(1, nombre);
            sentencia.setString(2, apellidos);
            sentencia.setInt(3, id);

            int filasAfectadas = sentencia.executeUpdate(query);
            sentencia.close();
            conexion.close();
            return filasAfectadas;

        } catch (Exception e) {
            System.out.println("Error general" + e.getMessage());

        }
        return 0;

    }
    
    //D
    public int borrado(int id) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/basesRelacionales", "foc1", "foc");
            Statement sentencia = conexion.createStatement();

            String query = "DELETE FROM personas WHERE id_persona= " + id;

            int salida = sentencia.executeUpdate(query);

            sentencia.close();
            conexion.close();

            return salida;
        } catch (Exception e) {
            System.out.println("Error general" + e.getMessage());
            return 0;
        }
    }

}
