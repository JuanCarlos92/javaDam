package ejerc2.Explotacion_de_una_bd_con_bd4o;

import Database.Departamento;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class DepartamentoImpl implements DepartamentoDAO{
    private ObjectContainer db;
    
    public DepartamentoImpl(ObjectContainer db){
        this.db = db;
    }

    @Override
    public void insertarDep(Departamento d) {
        db.store(d);
    }

    @Override
    public void eliminarDep(Departamento d) {
        ObjectSet<Departamento> result = db.queryByExample(d);
        if(result.isEmpty()){
            System.out.println("No existe el objeto en la "
                    + "base de datos");
        }
        else{
            Departamento dep = result.next();
            db.delete(dep);
        }
    }

    @Override
    public void modificarDep(Departamento old,Departamento newOne) {
        ObjectSet<Departamento> result = db.queryByExample(old);
        if(result.isEmpty()){
            System.out.println("No existe el objeto en la base "
                    + "de datos");
        }
        else{
            Departamento d = result.next();
            d.setDeptno(newOne.getDeptno());
            d.setDnombre(newOne.getDnombre());
            d.setLoc(newOne.getLoc());
            db.store(d);
        }
    }

    @Override
    public void consultarDep(Departamento d) {
        ObjectSet<Departamento> result = db.queryByExample(d);
        
        if(result.isEmpty()){
            System.out.println("No existen departamentos "
                    + "con ese modelo");
        }
        else{
            System.out.println("\nNúmero de departamentos "
                    + "recuperados: "+result.size());
            while(result.hasNext()){
                Departamento dep = result.next();
                System.out.println(
                        "\ndeptno: "+dep.getDeptno()+
                        "\tdnombre: "+dep.getDnombre()+
                        "\tLocalizacion: "+dep.getLoc()
                );
            }
        }
    }
    
}



