
package UD2_2;

public class Operaciones {
            //Atributos contastes y estaticos
    private static final double IVA = 0.21;
    private static final double PI = Math.PI;
            //Atributos estaticos
    private static int contador;
            //Atributos normales
    private int operador1;
    private int operador2;
    
            //Constructores
    public Operaciones(int op1, int op2){
        this.operador1 = op1;
        this.operador2 = op2;
    }
    public Operaciones(){ 
    }
            //Metodo statico contador
    public static int Contador(){
        return contador;
    }
            //Metodos set y get de  operador1 y operador2
    //set operador1
    public void SetOperador1(int op1){
        this.operador1 = op1;
    }
    //get operador1
    public int GetOperador1(){
        return operador1;
    }
    //set operador2
    public void SetOperador2(int op2){
        this.operador2 = op2;
    }
    //get operador2
    public int GetOperador2(){
        return operador2;
    }
    
            //Metodos estaticos
    //suma
    public static double Suma(int op1, int op2){
        double resultado;
        resultado = op1 + op2;
        contador++;
        return resultado;
    }
    //resta
    public static double Resta(int op1, int op2){
        double resultado;
        resultado = op1 - op2;
        contador++;
        return resultado;
    }
    
            //Metodos normales
    //multiplicacion
    public double Multiplicacion(int op1, int op2){
        double resultado;
        resultado = op1 * op2;
        contador++;
        return resultado;
    }
    //division
    public double Division(int op1, int op2){
        double resultado;
        resultado = op1 / op2;
        contador++;
        return resultado;
    }
}
