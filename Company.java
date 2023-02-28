
public abstract class Company {
     
    protected double stockPrice;
       
    public Company(double stockPrice) {
        this.stockPrice = stockPrice;
    }
      
    protected void setStockPrice(double stockPrice) 
    {
        this.stockPrice = stockPrice;
    }
             
    protected double getStockPrice()     
    {
        return this.stockPrice;
    }
       
    @Override    
    public String toString()        
    {        
        return String.format("$%.2f\n", getStockPrice()); 
    }
        
   public abstract void update();   
}
