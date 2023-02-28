
import java.security.SecureRandom;

public class Portfolio {
    public static void main(String[] args) {
        
        Company[] myArray = new Company[20];
        
        int tCount = 0;
        int mCount = 0;
               
        System.out.printf("Original Portfolio\n");
               
        for (int i=0; i < 20; i++) {
                      
            SecureRandom randomNum = new SecureRandom();          
            int num = 1 + randomNum.nextInt(2);
                        
            if (num == 1) {
                Technology technology1 = new Technology((i * 0.11) + 1);
                                
                myArray[i] = technology1;
                                
                System.out.print(technology1);
                                
                tCount += 1;
            }
                       
            else if (num == 2) {                
                Manufacturer manufacturer1 = new Manufacturer((i * 0.11) + 1);
                                
                myArray[i] = manufacturer1;
                               
                System.out.print(manufacturer1);
                                
                mCount +=1;
            }
        }        
        System.out.printf("\nUpdated Portfolio\n");
               
        for (int i=0; i < myArray.length; i++) {
                       
            myArray[i].update();
                         
            System.out.print(myArray[i]);
        }       
        System.out.printf("\nTechnology count: %d\n", tCount);
        System.out.printf("Manufacturer count: %d\n", mCount);
    }  
}
