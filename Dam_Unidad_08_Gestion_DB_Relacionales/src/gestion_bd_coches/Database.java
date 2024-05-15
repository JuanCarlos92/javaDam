/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_bd_coches;

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
                    "jdbc:mariadb://localhost/COCHES",
                    "root", ""
            );
            System.out.println("\n-------------Conexión "
                    + "establecida-------------");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("No se puedo establecer la"
                    + "conexión");
            System.exit(0);
        }
    }

    public void showAll() {
        System.out.println("-------------Mostrando todos"
                + " los vehiculos-------------");
        String q = "SELECT * from coche";
        executeSelect(q);
    }

    public void addCar(String matricula, double precio,
            String color, String marca) {
        System.out.println("-------------Añadiendo el vehiculo"
                + "con matricula " + matricula + "-------------");
        String query = "INSERT INTO coche values ('"
                + matricula + "', " + precio + ", '"
                + color + "', '" + marca + "')";
        executeQuery(query, "insertado");
    }

    public void updateCar(String matricula, double precio,
            String color, String marca) {
        System.out.println("-------------Modificando el vehiculo"
                + "con matricula " + matricula + "-------------");
        String query = "update coche set "
                + "precio=" + precio + "," + "color='" + color + "',"
                + "marca='" + marca + "' " + "where matricula='" + matricula + "'; ";
        executeQuery(query, "actualizado");
    }

    public void deleteCar(String matricula) {
        System.out.println("-------------Eliminado el vehiculo"
                + "con matricula " + matricula + "-------------");
        String query = "delete from coche "
                + "where matricula='" + matricula + "'; ";
        executeQuery(query, "eliminado");
    }

    public void searchCar(String matricula) {
        System.out.println("-------------Mostrando el vehiculo"
                + "con matricula " + matricula + "-------------");
        String q = "SELECT * from coche where matricula='" + matricula + "';";
        executeSelect(q);
    }

    private void executeQuery(String q, String action) {
        try {
            int n = conn.prepareStatement(q).executeUpdate();
            System.out.println("\nSe han " + action + " " + n + " vehiculos");
        } catch (SQLException e) {
            System.err.println("\nNo se pudo realizar la operacion");
        }

    }

    private void executeSelect(String q) {
        try {
            ResultSet result = conn.createStatement().executeQuery(q);
            System.out.println("\nCoches encontrados en la BD: ");
            while (result.next()) {
                System.out.println("\nMatricula: " + result.getString(1)
                        + "\nPrecio: " + result.getDouble(2)
                        + "\nColor: " + result.getString(3)
                        + "\nMarca: " + result.getString(4));
            }
        } catch (SQLException e) {
            System.err.println("No se pudo realizar la consulta");
        }
    }
}
