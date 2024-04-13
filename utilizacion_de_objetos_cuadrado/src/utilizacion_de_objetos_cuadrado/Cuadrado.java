package utilizacion_de_objetos_cuadrado;

public class Cuadrado {
    private double lado;

    public Cuadrado(){
	lado = 0;
    }

    public Cuadrado(double lado){
	this.lado = lado;
    }
	
    public double getLado(){
        return lado;
    }

    public void setLado(double l){
        lado = l;
    }

    public double perimetro(){
        return 4*lado;
    }

    public double area(){
        return lado*lado;
    }
}

