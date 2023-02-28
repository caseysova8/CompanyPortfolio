// Casey Sova 10/30/2022
// Week 9 Homework
// Create a Java application demonstrating polymorphism using information about companies.

// The 'Manufacturer' class is a subclass of the 'Company' class.
public class Manufacturer extends Company {
    
// The following is the one-argument constructor that takes a double as the argument,
// and invokes the constructor of its superclass.    
    public Manufacturer(double stockPrice) {
        super(stockPrice);
    }
  
// The following implements an override of the 'toString' method of its superclass.    
    @Override
// The following is the 'toString' method. This method returns a string including the 
// name of this class, 'Manufacturer', and a portion it gets from invoking the 'toString'
// method of the superclass.     
    public String toString() 
    {
        return "Manufacturer   " + super.toString();     
    }
    
// The following implements an override of the 'update' method of its superclass.    
    @Override
    public void update() 
    {
// The 'setStockPrice' method is called, and passes in the updated stock price value.       
        setStockPrice(getStockPrice() - 0.85);
    }   
}