
package ejerciciocomposicionclases;

public class Punto {
    
    private int x = 0;
    private int y = 0;
        
    public Punto() {
        x = 0;
        y = 0;
    }
    
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
        
    public int getY(){
        return y;
    }
    
    public void desplazar(int desplazamiento_x, int desplazamiento_y){
        x += desplazamiento_x;
        y += desplazamiento_y;
    }
    
}