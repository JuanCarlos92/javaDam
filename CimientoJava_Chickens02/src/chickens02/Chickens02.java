
package chickens02;

public class Chickens02 {
    public static void main(String[] args) {
        //variables
        final double dolares = 0.18, luneshuevos = 100, marteshuevos = 121, miercoleshuevos = 117;
        double dailyAverage, monthlyAverage, monthlyProfit;
        //diario
        dailyAverage = (luneshuevos+marteshuevos+miercoleshuevos) /3;
        //mensual
        monthlyAverage = dailyAverage *30;
        //profit
        monthlyProfit = monthlyAverage * dolares;
        
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
