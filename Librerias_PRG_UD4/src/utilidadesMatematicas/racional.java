
package utilidadesMatematicas;

public class racional {
    
    private int numerador;
    private int denominador;
    
    public racional(){
        this.numerador=0;
        this.denominador=1;
    }
    
    public racional(int numerador, int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
    }
    
    public int getNumerador(){
        return this.numerador;
    }
    
    public int getDenominador(){
        return this.denominador;
    }
    
    public void setNumerador(int numerador){
        this.numerador=numerador;
    }
    
    public void setDenominador(int denominador){
        this.denominador=denominador;
    }
    
    public void imprimirRacional(){
        System.out.println("El valor del número racional es: "+this.numerador+" / "+this.denominador);
    }
    
    public racional sumar(racional r){
        racional resultado_suma;
        
        int numerador_suma=this.numerador*r.getDenominador()+this.denominador*r.getNumerador();
        int denominador_suma=this.denominador*r.getDenominador();
        
        resultado_suma=new racional(numerador_suma, denominador_suma);
        return resultado_suma;
    }
    
    public racional restar(racional r){
        racional resultado_resta;
        
        int numerador_resta=this.numerador*r.getDenominador()-this.denominador-r.getDenominador();
        int denominador_resta=this.denominador*r.getDenominador();
        
        resultado_resta=new racional(numerador_resta,denominador_resta);
        return resultado_resta;
        
    }
    
    public racional multiplicacion(racional r){
        racional resultado_multiplicacion;
        
        int numerador_multiplicacion=this.numerador*r.getNumerador();
        int denominador_multiplicacion=this.denominador*r.getDenominador();
        
        resultado_multiplicacion=new racional(numerador_multiplicacion,denominador_multiplicacion);
        return resultado_multiplicacion;
    }
    
    public racional division(racional r){
        racional resultado_division;
        
        int numerador_division=this.numerador*r.getDenominador();
        int denominador_division=this.denominador*r.getNumerador();
        
        resultado_division=new racional(numerador_division,denominador_division);
        return resultado_division;
    }
    
    public boolean equals(racional r){
        
        if(this.numerador==r.getNumerador() && this.denominador==r.getDenominador()){
            return true;
        }
        else{
            return false;
        }
        
    }
    
   public boolean menor(racional r){
       
       double resultado1=this.numerador/this.denominador;
       double resultado2=r.getNumerador()/r.getDenominador();
       
       if(resultado1<resultado2){
           return true;
       }
       else{
           return false;
       }
   }
   
   public boolean mayor(racional r){
       
       double resultado1=this.numerador/this.denominador;
       double resultado2=r.getNumerador()/r.getDenominador();
       
       if(resultado1>resultado2){
           return true;
       }
       else{
           return false;
       }
   }
   
   public void cambioSigno(){
       this.numerador=(-1)*this.numerador;
   }
   
   public void incrementar(){
       this.numerador+=this.denominador;
   }
   
   public void decrementar(){
       this.numerador-=this.denominador;
   }
    
}
