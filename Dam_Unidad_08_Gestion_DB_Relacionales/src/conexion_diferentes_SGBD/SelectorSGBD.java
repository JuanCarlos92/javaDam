/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexion_diferentes_SGBD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectorSGBD {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int sel;

        Connection conexion = null;

        do {
            System.out.println("Seleccione que SGBD quiere usar (pulse el número correspondiente):");
            System.out.println("1.- SQLite");
            System.out.println("2.- Derby");
            System.out.println("3.- HSQLDB");
            System.out.println("4.- H2");
            System.out.println("5.- MySQL");
            System.out.println("6.- Oracle");
            System.out.println("0.- Salir");
            entrada = br.readLine();
            sel = Integer.parseInt(entrada);
        } while (sel < 0 && sel > 6);

        try {

            switch (sel) {
                case 1:
                    //SQLITE
                    Class.forName("org.sqlite.JDBC");
                    conexion = DriverManager.getConnection("jdbc:sqlite:D:/DB/SQLITE/ejemplo.db");
                    break;
                case 2:
                    //SQLITE
                    Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
                    conexion = DriverManager.getConnection("jdbc:derby:D:/DB/DERBY/ejemplo");
                    break;
                case 3:
                    //hsqldb
                    Class.forName("org.hsqldb.jdbcDriver");
                    conexion = DriverManager.getConnection("jdbc:hsqldb:file:D:/DB/HSQLDB/ejemplo/ejemplo");
                    break;
                case 4:
                    //H2
                    Class.forName("org.h2.Driver");
                    conexion = DriverManager.getConnection("jdbc:h2:D:/DB/H2/ejemplo/ejemplo", "sa", "");
                    break;
                case 5:
                    //mysql
                    Class.forName("com.mysql.jdbc.Driver");
                    conexion = DriverManager.getConnection("jdbc:mysql://localhost/ejemplo", "ejemplo", "ejemplo");
                    break;
                case 6:
                    //Oracle 
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "ejemplo", "ejemplo");
                    break;
                case 0:
                    //Salir
                    exit(1);
                    break;
            }

            // Preparamos la consulta
            Statement sentencia = conexion.createStatement();
            String sql = "SELECT * FROM personas";
            ResultSet resul = sentencia.executeQuery(sql);

            //Recorremos el resultado para visualizar cada fila
            //Se hace un bucle mientras haya registros y se van visualizando
            while (resul.next()) {
                System.out.printf("%d, %s, %s %n",
                        resul.getInt(1), resul.getString(2), resul.getString(3));
            }

            resul.close();     // Cerrar ResultSet
            sentencia.close(); // Cerrar Statement
            conexion.close();  // Cerrar conexión

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }// fin de main
}// fin de la clase
