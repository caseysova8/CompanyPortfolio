// Casey Sova 10/30/2022
// Week 9 Homework
// Create a Java application demonstrating polymorphism using information about companies.

// The following is the needed import statement to utilize the SecureRandom library.
import java.security.SecureRandom;

public class Portfolio {
    public static void main(String[] args) {
        
// The following is the initalization of an array of Company objects called 'myArray'.
// 'myArray' has a size of 20.
        Company[] myArray = new Company[20];
        
// The following initalizes two integer variables used to print the counts for each
// type of company.
        int tCount = 0;
        int mCount = 0;
        
// The following displays the label "Original Portfolio" to the screen.        
        System.out.printf("Original Portfolio\n");
        
// The following for loop will execute exactly 20 times.        
        for (int i=0; i < 20; i++) {
            
// The following is the instantiation of an object of the SecureRandom class.            
            SecureRandom randomNum = new SecureRandom();
// The following generates a random number, 1 or 2, and sets it equal to the 
// integer field 'num'.            
            int num = 1 + randomNum.nextInt(2);
            
// If 'num' is equal to 1, a new 'Technology' object is created.            
            if (num == 1) {
// The following creates the 'Technology' object and passes the stock price to
// the constructor. The stock price formula is: (current loop index * 0.11) + 1.
                Technology technology1 = new Technology((i * 0.11) + 1);
                
// The following adds the newly created object into 'myArray'.                
                myArray[i] = technology1;
                
// The following prints the value of the 'Technology' object to the screen.                
                System.out.print(technology1);
                
// Each time a technology object is created, 1 is added to the variable 'tCount'.                
                tCount += 1;
            }
            
// If 'num' is equal to 2, a new 'Manufacturer' object is craeted.            
            else if (num == 2) {
// The following creates the 'Manufacturer' object and passes the stock price to
// the constructor.                 
                Manufacturer manufacturer1 = new Manufacturer((i * 0.11) + 1);
                
// The following adds the newly created object into 'myArray'.                
                myArray[i] = manufacturer1;
                
// The following prints the value of the 'Manufacturer' object to the screen.                
                System.out.print(manufacturer1);
                
// Each time a manufacturer object is created, 1 is added to the variable 'mCount'.                
                mCount +=1;
            }
        }
// The following displays the label "Updated Portfolio" to the screen.        
        System.out.printf("\nUpdated Portfolio\n");
        
// The following is a counter-controlled for loop that loops through the array.        
        for (int i=0; i < myArray.length; i++) {
            
// The following calls the 'update' method for each object in the array.            
            myArray[i].update();
            
// The following prints all the updated items in the array.             
            System.out.print(myArray[i]);
        }
// The following displays the counts for each type of company.       
        System.out.printf("\nTechnology count: %d\n", tCount);
        System.out.printf("Manufacturer count: %d\n", mCount);
    }  
}
