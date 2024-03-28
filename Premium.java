public class Premium extends Vehicle
{
    // FIELDS
    private PremiumPackage pack;
    
    // CONSTRUCTORS
    public Premium()
    {
        this.pack = PremiumPackage.NONE;
    } // end of no-arg
    
    public Premium(String make, String model, int basePrice, PremiumPackage pack)
    {
        super(make, model, basePrice);
        this.pack = pack;
        
    } // end of full-arg constructor
    
    
    // UTILITY METHODS
    
    /********************************
     * This method calculates the total daily price of the premium car which is 
     * the sum of the base price and the premium package (if there is any)
     *******************************/
    @Override
    public double calculatePrice()
    {
        // declaring a double to hold the totalPrice value
        double totalPrice = 0;
        
        // adding the required values
        totalPrice += this.basePrice;
        totalPrice += this.pack.getPricePerDay();
        
        // returning the values
        return totalPrice;
        
    } // end of calculatePrice()
    
} // end of Premium()