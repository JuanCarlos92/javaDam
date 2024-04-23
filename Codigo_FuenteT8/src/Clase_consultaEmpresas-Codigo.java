import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class consultaEmpresas {
    public static void main(String[] args){
        String urlBD = "C:\\BasesDatos\\db4o\\DBEmpresas.yap";
        ObjectContainer db = Db4oEmbedded.openFile(
                Db4oEmbedded.newConfiguration(),
                urlBD
        );
        Empresa emp = new Empresa();
        
        ObjectSet<Empresa> resultadoConsulta = db.queryByExample(emp);
        if(resultadoConsulta.isEmpty()){
            System.out.println("No existen empresas con los datos"
                    + "especificados");
        }
        else{
            System.out.println("Numero de empresas recuperadas: "+
                    resultadoConsulta.size());

            while(resultadoConsulta.hasNext()){
                Empresa emp_actual = resultadoConsulta.next();
                System.out.println(
                        "\n\tNombre: "+emp_actual.getNombre()+
                        "\n\tCampo: "+emp_actual.getCampo()+
                        "\n\tTeléfono: "+emp_actual.getTelefono()+
                        "\n\tDirección: "+emp_actual.getDireccion());
            }
        }
        db.close();
    }
}

