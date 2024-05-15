package altayconsulta;

import java.sql.*;

public class AltaYConsulta {

  public static Connection conexion;
    
    public static void consultaEmpleados() throws SQLException {
        Statement consulta = conexion.createStatement();
        ResultSet sentencia = consulta.executeQuery("SELECT * FROM empleados");

        // Se recorre la colección para visualizar cada fila
        // se hace un bucle mientras haya registros, se van visualizando
        System.out.println("Lista de empleados");
        System.out.println
            ("nombre\t\tapellido\t\ttrabajo\t\t\tFecha de contratacion");
        while (sentencia.next()){
            System.out.println
                (sentencia.getString("nombre")+"\t\t"
                        +sentencia.getString("apellidos")+"\t\t"
                        +sentencia.getString("trabajo")+"\t\t"
                        +sentencia.getDate("fecha_contratacion"));
        }

        sentencia.close(); //Cerrar el Statement
    }

    public static void main(String[] args) {
        try {
            //Se carga el driver
            Class.forName("org.mariadb.jdbc.Driver");
            //Establecer la conexión con la Base de Datos
            conexion = DriverManager.getConnection(
                "jdbc:mariadb://localhost/empresa","foc","fomento");

            // Se inserta el nuevo empleado
            String insercion = "INSERT INTO empleados VALUES" 
            + "(8, 'Julian', 'Alcausa', '-', ?, 980.00)";
            PreparedStatement prepStatement =
                conexion.prepareStatement(insercion);

            java.sql.Timestamp fecha =
                new java.sql.Timestamp(new java.util.Date().getTime());
            prepStatement.setTimestamp(1, fecha);

            int insertados = prepStatement.executeUpdate();
            System.out.println("------- ------- ------- ");
            System.out.println("Se han insertado "+insertados+" empleado/s.");
            System.out.println("------- ------- ------- ");

            // Libero recursos para esta consulta
            prepStatement.close();

            consultaEmpleados();
            
            // Se añade un trabajo para el empleado
            Statement sentencia = conexion.createStatement();
            int actualizados = sentencia.executeUpdate(
                "UPDATE empleados SET trabajo = 'Analista' WHERE id_empleado=8"
            );
            System.out.println("------- ------- ------- ");
            System.out.println("Se han actualizado "+actualizados+" empleado/s.");
            System.out.println("------- ------- ------- ");

            consultaEmpleados();

                //Se liberan los recursos
            sentencia.close(); //Cerrar el ResultSet
            prepStatement.close(); //Cerrar el Statement
            conexion.close(); //Cerrar la Conexion siempre
        }
        catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        }
        catch (SQLException e) {
                System.out.println("SE HA PRODUCIDO UNA EXCEPCIÓN:");
                System.out.println("Mensaje: "+e.getMessage());
                System.out.println("SQL estado: "+e.getSQLState());
                System.out.println("Cod error: "+e.getErrorCode());
        }
    }
  
}

