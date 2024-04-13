
package clase_rectangulo_i;

public class Rectangulo {
    private int base; //Atributo que representa la base del rectángulo
    private int altura; //Atributo que representa la altura del rectángulo

    //Método que permite asignar un valor al atributo base del rectangulo
    public void setBase (int base){
        this.base = base;
    }

    //Método que permite asignar un valor al atributo altura del triángulo
    public void setAltura (int a){
        altura = a; //se puede omitir el this
    }

    public Rectangulo incrementarAncho(){
        base++; //Podemos omitir el this
        return this; //Se devuelve el objeto rectángulo actual usando this 
    }

    public Rectangulo incrementarAlto(){
        altura++; //Podemos omitir el this
        return this; //Se devuelve el objeto rectángulo actual haciendo uso de this 
    }
}
