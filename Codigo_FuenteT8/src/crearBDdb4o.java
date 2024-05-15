import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class crearBDdb4o {

    public static void main(String[] args) {
        String urlBD = "C:\\BasesDatos\\db4o\\DBEmpresas.yap";
        
        ObjectContainer db = Db4oEmbedded.openFile(
                Db4oEmbedded.newConfiguration(),
                urlBD
        );
        
        Empresa emp1 = new Empresa(
                "MicroHard", "Software", "07-345-92465",
                "Poligono Alboran, S/N, Badajoz"
        );
        Empresa emp2 = new Empresa(
                "CompuNet", "Hardware", "058-60-34-49",
                "Plaza. Sol, 24, Madrid"
        );
        Empresa emp3 = new Empresa(
                "Globaldot", "Software", "123-456-9875",
                "C. Gasset, Bajo 1, Bilbao"
        );
        Empresa emp4 = new Empresa(
                "Scroolem", "Soporte", "132-658-7435",
                "Avda. Luis VII, 7, Granada"
        );
        
        db.store(emp1);
        db.store(emp2);
        db.store(emp3);
        db.store(emp4);
        db.close();
    }
}