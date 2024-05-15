package consulta1;

import java.sql.*;

public class Consulta1 {
      
    public static void main(String[] args) {
        try {
            //Se carga el driver
            Class.forName("org.mariadb.jdbc.Driver");
            //Establecer la conexión con la Base de Datos
            Connection conexion =
                DriverManager.getConnection
                    ("jdbc:mariadb://localhost/empresa","foc","fomento");

            //Consultas

            //Se prepara la consulta
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = 
            sentencia.executeQuery("SELECT nombre,apellidos,trabajo,salario"
                    + " FROM empleados WHERE fecha_contratacion < '2010-1-01'"
                    + " ORDER BY apellidos ASC;"
            );

            // Se recorre la colección para visualizar cada fila
            // se hace un bucle mientras haya registros, se van visualizando
            System.out.println("Empleados anteriores a 2010");
            System.out.println("nombre\t\tapellido\t\tsalario");
            while (resultado.next()){
                System.out.println(resultado.getString("nombre")+
                        "\t\t"+resultado.getString("apellidos")+
                        "\t\t"+resultado.getFloat("salario"));
            }

            resultado =
                sentencia.executeQuery("SELECT nombre,apellidos,id_empleado"
                        + " as id FROM empleados WHERE trabajo like"
                        + " '%informatico%' ORDER BY apellidos DESC"
                );
            System.out.println("\nEmpleados que son informaticos");
            System.out.println("id\tnombre\t\tapellido");
            while (resultado.next()){
                System.out.println(resultado.getInt("id")+
                        "\t"+resultado.getString(1)+
                        "\t\t"+resultado.getString(2));
            }
            
            //Se liberan los recursos
            resultado.close(); //Cerrar el ResultSet
            sentencia.close(); //Cerrar el Statement
            conexion.close(); //Cerrar la Conexion

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}