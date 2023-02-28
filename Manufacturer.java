
public class Manufacturer extends Company {
        
    public Manufacturer(double stockPrice) {
        super(stockPrice);
    }
      
    @Override    
    public String toString() 
    {
        return "Manufacturer   " + super.toString();     
    }
       
    @Override
    public void update() 
    {      
        setStockPrice(getStockPrice() - 0.85);
    }   
}
