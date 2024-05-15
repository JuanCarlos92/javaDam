/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_bd_contactos;

import java.sql.*;

public class Database {

    private Connection conn;

    public Database() {
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            this.conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@172.16.90.99:1521:orcl",
                    "sys as SYSDBA",
                    "oracle"
            );
            System.out.println("\n-------------Conexión "
                    + "establecida-------------");
        } catch (SQLException e) {
            System.err.println("Error al conectarse a la "
                    + "base de datos");
        }
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión");
        }
    }

    public void showAll() {
        System.out.println("-------------Mostrando todos"
                + " los contactos-------------");
        String q = "SELECT * from contactos";
        executeSelect(q);
    }

    public void addContact(String dni, String nombre,
            String apellidos, int telefono, String email) {
        System.out.println("-------------Añadiendo el contacto "
                + "con matricula " + dni + "-------------");
        String query = "INSERT INTO contactos values ('"
                + dni + "', '" + nombre + "', '"
                + apellidos + "', " + telefono + ", '"
                + email + "')";
        executeQuery(query, "insertado");
    }

    public void updateContact(String dni, String nombre,
            String apellidos, int telefono, String email) {
        System.out.println("-------------Modificando el contacto"
                + "con dni " + dni + "-------------");
        String query = "update contactos set "
                + "nombre='" + nombre + "'," + "apellidos='" + apellidos + "',"
                + "telefono=" + telefono + ", email='" + email + "' "
                + "where dni='" + dni + "' ";
        executeQuery(query, "actualizado");
    }

    public void deleteContact(String dni) {
        System.out.println("-------------Eliminado el contacto"
                + "con dni " + dni + "-------------");
        String query = "delete from contactos "
                + "where dni='" + dni + "'";
        executeQuery(query, "eliminado");
    }

    public void searchContact(String dni) {
        System.out.println("-------------Mostrando el contacto"
                + "con dni " + dni + "-------------");
        String q = "SELECT * from contactos where dni='" + dni + "'";
        executeSelect(q);
    }

    private void executeQuery(String q, String action) {
        try {
            Statement stm = conn.createStatement();
            int n = stm.executeUpdate(q);

            System.out.println("\nSe han " + action + " " + n + " contactos");

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("\nNo se pudo realizar la operacion");
        }

    }

    private void executeSelect(String q) {
        try {
            ResultSet result = conn.createStatement().executeQuery(q);
            System.out.println("\nContactos encontrados en la BD: ");
            while (result.next()) {
                System.out.println("\nDni: " + result.getString(1)
                        + "\nNombre: " + result.getString(2)
                        + "\nApellidos: " + result.getString(3)
                        + "\nTelefono: " + result.getDouble(4)
                        + "\nEmail: " + result.getString(5));
            }
        } catch (SQLException e) {
            System.err.println("No se pudo realizar la consulta");
        }
    }
}
