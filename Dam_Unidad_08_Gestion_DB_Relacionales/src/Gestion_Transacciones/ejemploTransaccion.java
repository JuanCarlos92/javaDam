/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion_Transacciones;

import java.sql.*;

public class ejemploTransaccion {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//Se carga el driver
        Class.forName("com.mysql.jdbc.Driver");
//Se establece la conexión con la BD
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");
        try {
            /*Si una conexión está en modo de confirmación automática, todas las instrucciones SQL se
ejecutan y confirman como transacciones individuales*/
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false); //La ponemos a false para controlar cuando se hace commit
            }
            Statement sentencia = conexion.createStatement();
            String opBorrado = "DELETE FROM Articulos WHERE codArticulo=58"; //Hago una operación
            int filasBorradas = sentencia.executeUpdate(opBorrado);
            System.out.println("Mediante la sentencia de borrado: " + opBorrado + " se han borrado "
                    + filasBorradas + " filas");
            sentencia.executeUpdate(opBorrado);
            conexion.commit();
        } catch (Exception e) {
            System.out.println(" " + e);
            conexion.rollback(); //Si falla deshacemos la transacción
        }
        conexion.close();
    }
}
