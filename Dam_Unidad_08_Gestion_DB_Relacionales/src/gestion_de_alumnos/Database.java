/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_de_alumnos;

/**
 *
 * @author Juan Carlos
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {

    private Connection conn;

    public Database() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");

            conn = DriverManager.getConnection(
                    "jdbc:mariadb://localhost/alumnos",
                    "root", ""
            );
        } catch (ClassNotFoundException | SQLException e) {
            System.exit(0);
        }
    }

    public String showAll() {
        String result = "-------------Mostrando todos"
                + " los vehiculos-------------\n";
        String q = "SELECT * from alumno";
        return result += executeSelect(q);
    }

    public String addStudent(int id, String nombre,
            String apellidos, double media, String tutor) {
        String result = "";
        result += "-------------Añadiendo el alumno "
                + "con id " + id + "-------------\n";
        String query = "INSERT INTO alumno values ("
                + id + ", '" + nombre + "', '" + apellidos + "', '"
                + media + "', '" + tutor + "')";
        return result += executeQuery(query, "insertado");
    }

    public String updateStudent(int id, String nombre,
            String apellidos, double media, String tutor) {
        String result = "-------------Modificando el alumno"
                + "con id " + id + "-------------\n";
        String query = "update alumno set "
                + "nombre='" + nombre + "'," + "apellidos='" + apellidos + "',"
                + "media_notas='" + media + "', tutor='" + tutor + "' "
                + "where id_alumno='" + id + "'; ";
        return result += executeQuery(query, "actualizado");
    }

    public String deleteStudent(int id) {
        String result = "-------------Eliminado el alumno"
                + "con id " + id + "-------------\n";
        String query = "delete from alumno "
                + "where id_alumno=" + id + "; ";
        return result += executeQuery(query, "eliminado");
    }

    public String searchStudent(int id) {
        String result = "-------------Mostrando el alumno"
                + "con id " + id + "-------------\n";
        String q = "SELECT * from alumno where id_alumno=" + id + ";";
        return result += executeSelect(q);
    }

    private String executeQuery(String q, String action) {
        try {
            int n = conn.prepareStatement(q).executeUpdate();
            return "\nSe han " + action + " " + n + " alumnos";
        } catch (SQLException e) {
            return "\nNo se pudo realizar la operacion";
        }
    }

    private String executeSelect(String q) {
        try {
            String resultTxt = "";
            ResultSet result = conn.createStatement().executeQuery(q);
            resultTxt += "\nAlumnos encontrados en la BD: \n";
            while (result.next()) {
                resultTxt += "\nId: " + result.getInt(1)
                        + "\n\tNombre: " + result.getString(2)
                        + "\n\tApellidos: " + result.getString(3)
                        + "\n\tMedia: " + result.getDouble(4)
                        + "\n\tTutor: " + result.getString(5);
            }
            return resultTxt;
        } catch (SQLException e) {
            return "No se pudo realizar la consulta";
        }
    }
}
