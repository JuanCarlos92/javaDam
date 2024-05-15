package ejerc2.Explotacion_de_una_bd_con_bd4o;

import Database.Departamento;

public interface DepartamentoDAO {
    public void insertarDep(Departamento d);
    public void eliminarDep(Departamento d);
    public void modificarDep(Departamento old, Departamento newOne);
    public void consultarDep(Departamento d);
}

