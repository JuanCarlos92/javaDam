import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class actualizacionEmpresa {
    public static void main(String[] args){
        String urlBD = "C:\\BasesDatos\\db4o\\DBEmpresas.yap";
        
        ObjectContainer db = Db4oEmbedded.openFile(
                Db4oEmbedded.newConfiguration(),
                urlBD
        );
        Empresa emp = new Empresa("Scroolem", null, null, null);
        
        ObjectSet<Empresa> resultado = db.queryByExample(emp);
        if(resultado.isEmpty()){
            System.out.println("No existe la empresa Scroolem");
        }
        else{
            Empresa emp_actual = resultado.next();
            emp_actual.setTelefono("12-1345-1479");
            db.store(emp_actual); //Guardamos la empresa actualizada
        }
        db.close();
    }
}


