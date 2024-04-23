import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.io.File;

public class principal {
    static String urlBD = "C:\\BasesDatos\\db4o\\DBEmpresas2.yap";

    public static void crearBD(){
        new File(urlBD).delete();
        ObjectContainer db = Db4oEmbedded.openFile(
            Db4oEmbedded.newConfiguration(),
            urlBD
        );

        Direccion dir1 = new Direccion(
                "Poligo Alborán", 12, "Badajoz", 
                "España", "20960"
        );
        Empresa emp1 = new Empresa(
                "MicroHard","Software","07-345-92465",dir1
        );

        Direccion dir2 = new Direccion(
                "Plza. Sol", 24, "Madrid", "España", "00900"
        );
        Empresa emp2 = new Empresa(
                "CompuNet", "Hardware","058-60-34-49", dir2
        );

        Direccion dir3 = new Direccion(
                "C. Gasset", 1, "Bilbao", "España", "40200"
        );
        Empresa emp3 = new Empresa(
                "Globaldot","Software","123-456-9875",dir3
        );

        Direccion dir4 = new Direccion(
                "Rue Napoleon", 345, "Lyon", "Francia", "75941"
        );
        Empresa emp4 = new Empresa(
                "Moonde BR", "Servicio","132-658-7435",dir4
        );

        db.store(emp1);
        db.store(emp2);
        db.store(emp3);
        db.store(emp4);

        db.close();
    }

    public static void consultaEmpresas(){
        ObjectContainer db=Db4oEmbedded.openFile(
                Db4oEmbedded.newConfiguration(),
                urlBD
        );
        Empresa emp = new Empresa();

        ObjectSet<Empresa> result = db.queryByExample(emp);
        if(result.isEmpty()){
            System.out.println("No existe ninguna empresa");
        }
        else{
            System.out.println("Número de empresas: "+result.size());

            while(result.hasNext()){
                Empresa actual = result.next();
                System.out.println(
                        "\n\tNombre: "+actual.getNombre()+
                        "\n\tCampo: "+actual.getCampo()+
                        "\n\tTeléfono: "+actual.getTelefono()+
                        "\n\tPais: "+actual.getDireccion().getPais());
            }
        }
        db.close();
    }

    public static void consultaEmpresasEspanolas(){
        ObjectContainer db = Db4oEmbedded.openFile(
                Db4oEmbedded.newConfiguration(),
                urlBD
        );
        
        Direccion dir = new Direccion(null, 0, null, "España", null);
        Empresa emp = new Empresa(null, null, null, dir);

        ObjectSet<Empresa> result = db.queryByExample(emp);

        if(result.isEmpty()){
            System.out.println("No existen empresas españolas");
        }
        else{
            System.out.println
                   ("Número de empresas españolas: "+result.size());

            while(result.hasNext()){
                Empresa actual = result.next();
                System.out.println(
                        "\n\tNombre: "+actual.getNombre()+
                        "\n\tCampo: "+actual.getCampo()+
                        "\n\tTeléfono: "+actual.getTelefono()+
                        "\n\tPais: "+actual.getDireccion().getPais());
            }
        }
        db.close();
    }

    public static void main(String[] args) {
        crearBD();
        consultaEmpresas();
        consultaEmpresasEspanolas();
    }

}
