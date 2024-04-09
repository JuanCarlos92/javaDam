
package breakandcontinue;


public class BreakAndContinue {

    public static void main(String[] args) {
        
        //break
        for (int i = 0; i <10; i++) {
            if(i == 5){
                break;
            }
            System.out.println(i);
        }
        int j= 0;            
        while (j < 10) {
            if(j == 5){
                break;
            }
            System.out.println(j);
            
        }

        //contine
        for (int i = 0; i <10; i++) {
            if(i % 2 == 0 ){
                continue;
            }
            System.out.println(i);
        }
        int k = 0;
        while (k == 10) {
            if(k == 5){
                break;
            }
            System.out.println(k);
            
        }
    }    
  }      