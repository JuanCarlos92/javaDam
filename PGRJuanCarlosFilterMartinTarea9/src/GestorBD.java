
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Juan Carlos
 */
public class GestorBD {

    private Connection conexion;
    private PreparedStatement ps;
    private ResultSet rs;

    //Constructor sin parámetros
    public GestorBD() {

    }

    //Metodo para conectar con la BD
    public void conectar() {
        try {
            //Decir que tipo de bbdd tengo
            Class.forName("com.mysql.jdbc.Driver");
            //Se crea la conexión (url, usuario, pwd)
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/15456141a", "jcfm", "jcfm");

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Metodo para desconectar con la BD
    public void desconectar() {
        try {
            //En caso de que Connection, preparedStatement o ResultSet no sea null se desconecta con la BD
            if (conexion != null) {
                conexion.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            InfoshowDialog("Error de desconexión: " + e.getMessage());
        }
    }

    //Metodo para insertar Departamentos
    public void alta(int codigo, String nombre, int id_localizacion, int id_manager) {

        try {
            conectar();
            String resultado;

            //Variable que almacena el INSERT INTO
            //Se le dice a java que en un punto dado las "?" deben ser sustituidas
            String sql = "INSERT INTO Departamentos VALUES (?,?,?,?)";

            //Se Prepara el statement
            ps = conexion.prepareStatement(sql);

            ps.setInt(1, codigo);       //1º ?
            ps.setString(2, nombre);    // 2º ?
            ps.setInt(3, id_localizacion);  // 3º ?
            ps.setInt(4, id_manager);   // 4º ?

            //Se realiza el insert into
            ps.executeUpdate();
            resultado = "Insertado";
            InfoshowDialog(resultado);

        } catch (SQLException e) {
            InfoshowDialog("Error al insertar en el departamento: " + e.getMessage());
        } finally {
            desconectar();
        }

    }

    //Metodo para consultar en la BBDD y mostrar el resultado del SELECT
    public ArrayList<Departamento> mostrar() {
        //Se crea un arraylist
        ArrayList<Departamento> respuesta = new ArrayList<Departamento>();

        try {
            conectar();
            //Variable que almacena el SELECT
            String sql = "Select * from departamentos";

            //Se prepara la consulta
            Statement consulta = conexion.createStatement();
            rs = consulta.executeQuery(sql);

            //Bucle para recorrer y mostrar cada departamento
            while (rs.next()) {
                //Se crea objeto Departamento 
                Departamento depart = new Departamento();

                //Se va añadiendo cada valor en el objeto depart
                depart.setCodigo(rs.getInt(1));
                depart.setNombre(rs.getString(2));
                depart.setIdLocalizacion(rs.getInt(3));
                depart.setIdManager(rs.getInt(4));

                //Se añade el objeto al arrayList llamada respuesta
                respuesta.add(depart);

            }
            return respuesta;

        } catch (SQLException e) {
            InfoshowDialog("Error al mostrar departamentos: " + e.getMessage());
            return null;
        } finally {
            desconectar();
        }

    }

    public String Borrar(int codigo) {
        try {
            conectar();
            String resultado;
            //Si el el metodo retorna vacio entonce devuelve que no existe
            if (!consultarCodigoBaseDatos(codigo).next()) {
                resultado = "Este registro no existe en la BBDD.";
                return resultado;
            }
            
            //Preguntamos si se desea borrar
            int pregunta = PreguntashowDialog("¿Desea borrar el departamento con código " + codigo + "?", "SI", "NO");

            if (pregunta == 0) {
                //Variable que almacena el DELETE 
                String sql = "DELETE FROM Departamentos WHERE codigo =?";

                //Preparar el Statement para realizar el delete
                ps = conexion.prepareStatement(sql);
                ps.setInt(1, codigo);
                ps.executeUpdate();
                resultado = "Departamento eliminado de la BBDD.";

                return resultado;
            }

            resultado = "No se ha borrado el Departamento de la BBDD";
            return resultado;

        } catch (SQLException e) {
            InfoshowDialog("Error al borrar departamento: " + e.getMessage());
            return null;
        } finally {
            desconectar();
        }

    }

    public void actualizar(int codigo, String nombre, int id_localizacion, int id_manager) {
        try {
            conectar();
            String resultado;

            //Si el el metodo retorna vacio entonce devuelve que no existe
            if (!consultarCodigoBaseDatos(codigo).next()) {
                resultado = "Este registro no existe en la BBDD.";
                InfoshowDialog(resultado);
            } else {
                //Variable que almacena el UPDATE 
                String sql = "UPDATE Departamentos SET nombre = ?, id_localizacion = ?, id_manager = ? WHERE codigo = ?";
                //Se prepara el Statement
                ps = conexion.prepareStatement(sql);
                ps.setString(1, nombre);
                ps.setInt(2, id_localizacion);
                ps.setInt(3, id_manager);
                ps.setInt(4, codigo);

                //Se realiza el update
                ps.executeUpdate();
                resultado = "Actualizado.";
                InfoshowDialog(resultado);
            }

        } catch (SQLException e) {
            InfoshowDialog("Error al borrar departamento: " + e.getMessage());
        } finally {
            desconectar();
        }
    }

    public Departamento mostrarTextField() {

    }

    //Metodo para comprobar que el registro ya existe en la BD
    public ResultSet consultarCodigoBaseDatos(int codigo) {

        try {
            //Variable para consultar dentro de Departamento el codigo introducido
            String sql = "SELECT * FROM Departamentos WHERE codigo = ?";

            //Se prepara el Statement para realizar la consulta
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, codigo);

            //return la consulta
            return ps.executeQuery();

        } catch (SQLException e) {
            InfoshowDialog("Error al comprobar el departamento: " + e.getMessage());
            return null;
        }

    }

    public static int PreguntashowDialog(String msg, String option1, String option2) {
        int pregunta = JOptionPane.showOptionDialog(null, msg,
                "Ventana de confirmación", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{option1, option2}, "SI");
        return pregunta;
    }

    public void ErrorshowDialog(String msg) {
        JOptionPane.showMessageDialog(null, msg,
                "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void InfoshowDialog(String msg) {
        JOptionPane.showMessageDialog(null, msg,
                "ÉXITO", JOptionPane.INFORMATION_MESSAGE);
    }

}
