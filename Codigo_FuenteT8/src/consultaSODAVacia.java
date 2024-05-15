import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;

public class consultaSODAVacia {
    public static void main(String[] args){
        String urlBD = "C:\\BasesDatos\\db4o\\DBEmpresas.yap";
        ObjectContainer db = Db4oEmbedded.openFile(
                Db4oEmbedded.newConfiguration(),
                urlBD
        );
        Query consulta = db.query();
        consulta.constrain(Empresa.class);
        
        ObjectSet<Empresa> resultado = consulta.execute();
        if(resultado.isEmpty()){
            System.out.println("No existen empresas con los datos"
                    + "especificados");
        }
        else{
            System.out.println("Número de empresas recuperadas: "+
                    resultado.size());
            while(resultado.hasNext()){
                Empresa emp_actual = resultado.next();
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