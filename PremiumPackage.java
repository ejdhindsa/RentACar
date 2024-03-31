public enum PremiumPackage
{
    // creating list of all the enums required as per the assignment
    NONE("None", 0),
    SPORT("Sport", 15),
    LUXURY("Luxury", 12),
    BUSINESS("Business", 14);
    
    // FIELDS
    private String display;
    private int pricePerDay;
    
    // creating a constructor
    // since enum constructors are automatically private
    private PremiumPackage(String display, int pricePerDay)
    {
        this.display = display;
        this.pricePerDay = pricePerDay;
    } // end of premiumPackage()
    
    /****************************************
     * Following methods are the methods that return required data of the class
     * 
     * getDisplay() - returns the display of the enum
     * getPricePerDay() - returns the pricePerDay of the enum
     ***************************************/
    public String getDisplay()
    {
        return this.display;
    } // end of getDisplay()
    
    public int getPricePerDay()
    {
        return this.pricePerDay;
    } // end of getPricePerDay()

} // end of enum