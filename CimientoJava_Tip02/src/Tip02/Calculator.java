
package Tip02;

public class Calculator {
    public double tax = .05;
    public double tip = .15;  //Change tax and tip if you prefer different values
    public double originalPrice = 0;
    public double total=0;
    
    public void findTotal(){
        this.total = this.originalPrice*(1+ this.tax + this.tip);
        System.out.println(this.total);

    }
}
