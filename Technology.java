
public class Technology extends Company {
        
    public Technology(double stockPrice) {
        super(stockPrice);
    }
        
    @Override   
    public String toString() 
    {
        return "Technology     " + super.toString();     
    }  
      
    @Override
    public void update() 
    {        
        setStockPrice(getStockPrice() + 1.25);
    }  
}
