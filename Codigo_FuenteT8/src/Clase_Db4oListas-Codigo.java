import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.io.File;

public class Db4oListas {
    static String urlBD = "C:\\BasesDatos\\db4o\\DBEmpresas3.yap";

    public static void crearBD(){
        new File(urlBD).delete();
        ObjectContainer db = Db4oEmbedded.openFile(
                Db4oEmbedded.newConfiguration(),
                urlBD
        );

        String tlfn1[] = new String[]{"07345-92465"};
        String dir1 = "Poligo Alborán, 12, Badajoz, España, 20960";
        Empresa emp1 = new Empresa(
                "MicroHard","Software",tlfn1,dir1
        );

        String tlfn2[]= new String[]{
            "058-603-449","38-48614741","0684-432-01"
        };
        String dir2 = "Plza. Sol, 24, Madrid, España, 00900";
        Empresa emp2 = new Empresa(
                "CompuNet", "Hardware",tlfn2,dir2
        );

        String tlfn3[] = new String[]{"123-456-9875","123-456-9876"};
        String dir3 = "C. Gasset, 1, Bilbao, España, 40200";
        Empresa emp3 = new Empresa(
                "Globaldot","Software",tlfn3,dir3
        );

        String tlfn4[] = new String[]{};
        String dir4 = "Rue Napoleon, 345, Lyon, Francia, 75941";
        Empresa emp4 = new Empresa(
                "Moonde BR", "Servicio",tlfn4,dir4
        );

        db.store(emp1);
        db.store(emp2);
        db.store(emp3);
        db.store(emp4);

        db.close();
    }

    public static void consultaEmpresas(){
        ObjectContainer db = Db4oEmbedded.openFile(
                Db4oEmbedded.newConfiguration(),
                urlBD
        );
        Empresa empresa = new Empresa();

        ObjectSet<Empresa> resultadoConsulta = 
                db.queryByExample(empresa);
        if(resultadoConsulta.isEmpty()){
            System.out.println("No existe ninguna empresa");
        }
        else{
            System.out.println("Número de empresas: "
                    +resultadoConsulta.size());

            while(resultadoConsulta.hasNext()){
                Empresa actual = resultadoConsulta.next();
                System.out.print("\n\tNombre: "+actual.getNombre()+
                        "\n\tCampo: "+actual.getCampo());
                System.out.print("\n\tTlfns: ");
                for (String tlfn : actual.getTelefono()){
                      System.out.print("\n\t\t"+tlfn);
                }
                System.out.println();
            }
        }
        db.close();
    }

    public static void consultaEmpresasTelefono(String numero){
        ObjectContainer db = Db4oEmbedded.openFile(
                Db4oEmbedded.newConfiguration(),
                urlBD
        );
        String tlfns[] = new String[]{numero};
        Empresa empresa = new Empresa(null, null, tlfns, null);

        ObjectSet<Empresa> resultadoConsulta = 
                db.queryByExample(empresa);
        if(resultadoConsulta.isEmpty()){
            System.out.println("No existe empresa con tal número");
        }
        else{
            System.out.println("\nEmpresa con número de teléfono "+
                      numero+": "+resultadoConsulta.size());

            while(resultadoConsulta.hasNext()){
                Empresa actual = resultadoConsulta.next();
                System.out.print("\n\tNombre: "+actual.getNombre()+
                        "\n\tCampo: "+actual.getCampo());
                System.out.print("\n\tTlfns: ");
                for (String tlfn : actual.getTelefono()){
                      System.out.print("\n\t\t"+tlfn);
                }
                System.out.println();
            }
        }
        db.close();
    }

    public static void main(String[] args) {
        crearBD();
        consultaEmpresas();
        consultaEmpresasTelefono("38-48614741");
    }

}
