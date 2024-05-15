package ejerc2.Explotacion_de_una_bd_con_bd4o;

import Database.Departamento;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class Explotacion_de_una_BD_con_BD4o {

    public static void main(String[] args) {
        String urlBD = "C:\\BasesDatos\\db4o\\Departamentos.db";
        
        ObjectContainer db = Db4oEmbedded.openFile(
                Db4oEmbedded.newConfiguration(),
                urlBD
        );
        
        Departamento d1 = new Departamento(1, "Dep1", "Granada");
        Departamento d2 = new Departamento(2, "Dep2", "Malaga");
        Departamento d3 = new Departamento(3, "Dep3", "Murcia");
        Departamento d4 = new Departamento(4, "Dep4", "Almeria");
        
        DepartamentoImpl depDB = new DepartamentoImpl(db);
        
        depDB.insertarDep(d1);
        depDB.insertarDep(d2);
        depDB.insertarDep(d3);
        depDB.insertarDep(d4);
        
        depDB.consultarDep(new Departamento());
        
        depDB.modificarDep(
                d3, 
                new Departamento(3, "Dep3", "Madrid")
        );
        
        
        depDB.consultarDep(new Departamento());
        
        depDB.eliminarDep(d2);
        
        depDB.consultarDep(new Departamento());
        
        db.close();
    }
}


