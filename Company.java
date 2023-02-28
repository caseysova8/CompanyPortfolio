// Casey Sova 10/30/2022
// Week 9 Homework
// Create a Java application demonstrating polymorphism using information about companies.

// The Company class is an abstract class.
public abstract class Company {
    
// The following is the initialization of the stockPrice field. The access modifier for
// this field is 'protected' because it is used in the current class, and in this
// class' subclasses.    
    protected double stockPrice;
    
// The following is the one-argument constructor.     
    public Company(double stockPrice) {
        this.stockPrice = stockPrice;
    }
    
// The following is the setter method for the 'stockPrice' field. This method is protected
// because it is used in this class' subclasses.    
    protected void setStockPrice(double stockPrice) 
    {
        this.stockPrice = stockPrice;
    }
        
// The following is the getter method for the 'stockPrice' field. This method is protected
// because it is used in this class' subclasses.     
    protected double getStockPrice()     
    {
        return this.stockPrice;
    }
    
// The following implements an override of the 'toString' method.    
    @Override
// The following is the 'toString' method. This method is public because other classes
// outside of this one use the method.     
    public String toString()        
    {
// The following returns a string representing the stock price with a dollar sign and
// two decimal place precision.         
        return String.format("$%.2f\n", getStockPrice()); 
    }
    
// The following is the abstract 'update' method.     
   public abstract void update();   
}