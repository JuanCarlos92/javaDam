package consultapreparedstatement;

import java.sql.*;

public class ConsultaPreparedStatement {
    public static void main(String[] args) {
        try {
            //Se carga el driver
            Class.forName("org.mariadb.jdbc.Driver");
            //Establecer la conexión con la Base de Datos
            Connection conexion =
                DriverManager.getConnection
                    ("jdbc:mariadb://localhost/empresa","foc","fomento");

            //Se prepara la consulta
            String sql = "SELECT nombre, apellidos, " + 
            "salario FROM empleados WHERE trabajo = ?";
            PreparedStatement sentencia = conexion.prepareStatement(sql);

            String trabajo = "Informatico";
            sentencia.setString(1, trabajo);

            ResultSet resultado = sentencia.executeQuery();
            System.out.println("Empleados que son: " + trabajo);
            while(resultado.next()){
                System.out.println(resultado.getString("apellidos") +
                ", "+resultado.getString("nombre")+"\t=>\t" +
                resultado.getFloat("salario"));
            }

            resultado.close(); //Cerrar el ResultSet
            sentencia.close(); //Cerrar el Statement
            conexion.close();  //Cerrar la Conexion
            } catch (ClassNotFoundException cn) {
                    cn.printStackTrace();
            } catch (SQLException e) {
                    e.printStackTrace();
            }
    }

}

