package uso_operador_super;

public class Gerente extends Empleado {
    
    private String departamento;

    public Gerente(String nombre, double salario, String depto) {
            super(nombre, salario);
            departamento = depto;
    }
    public Gerente(String nombre, String depto) {
            super(nombre);
            departamento = depto;
    }
}

