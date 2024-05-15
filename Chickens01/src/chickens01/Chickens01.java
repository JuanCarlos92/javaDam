
package chickens01;

public class Chickens01 {
    public static void main(String[] args) {
        //5 huevos * gallina (5) | total huevos 0
        int eggsPerChicken = 5, chickenCount = 3, totalEggs;
        
        //Lunes
        totalEggs = eggsPerChicken * chickenCount;
        
        //Martes 1º> 1 gallina más, 2º calcular huevos
        chickenCount ++;
        totalEggs = totalEggs + (eggsPerChicken * chickenCount);
        
        //Miercoles 1º> mitad de las gallinas, 2º calcular huevos
        chickenCount /=2;
        totalEggs = totalEggs + (eggsPerChicken * chickenCount);
        
        System.out.println(totalEggs);
     
        
        //4 huevos * gallina (8)
        eggsPerChicken = 4;
        chickenCount = 8;
        
        //Lunes
        totalEggs = eggsPerChicken * chickenCount;
        
        //Martes 1º> 1 gallina más, 2º calcular huevos
        chickenCount ++;
        totalEggs = totalEggs + (eggsPerChicken * chickenCount);
        
        //Miercoles 1º> mitad de las gallinas, 2º calcular huevos
        chickenCount /=2;
        totalEggs = totalEggs + (eggsPerChicken * chickenCount);
        
        System.out.println(totalEggs);
        
    }
        
}
