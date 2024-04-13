
package implementacion_metodos_clase_triangulo;

public class Triangulo {
    private int lado; //Atributo que representa el lado del triángulo
    private int altura; //Atributo que representa la altura del triángulo

    //Método que permite asignar un valor al atributo lado del triángulo
    void setLado (int l){
        lado = l;
    }
    //Método que permite asignar un valor al atributo altura del triángulo
    void setAltura (int a){
        altura = a;
    }
    //Definición del método área del rectángulo
    public int perimetro(){
        return 3*lado;
    }
}


