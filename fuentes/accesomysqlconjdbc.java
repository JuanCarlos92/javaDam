package accesomysqlconjdbc;

import java.sql.*;

public class AccesoMySQLconJDBC {
      
    public static void main(String[] args) {
        try {
            //Se carga el driver
            Class.forName("org.mariadb.jdbc.Driver");
            //Establecer la conexión con la Base de Datos
            Connection conexion =
                DriverManager.getConnection
                    ("jdbc:mariadb://localhost/empresa","foc","fomento");

            //Se prepara la consulta
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = 
            sentencia.executeQuery("SELECT * FROM empleados");

            // Se recorre la colección para visualizar cada fila
            // se hace un bucle mientras haya registrosd, se van visualizando
            System.out.println("id_empleado\tnombre\t\ttrabajo");
            while (resultado.next()){
                System.out.println(
                    resultado.getInt(1)+
                    "\t\t"+resultado.getString(2)+
                    "\t\t"+resultado.getString(3)
                );
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