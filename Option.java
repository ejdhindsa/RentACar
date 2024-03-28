public enum Option
{
    // creating enums
    NONE("None", 0),
    SATNAV("SatNav", 5),
    BLUETOOTH("Bluetooth", 7),
    KEYLESS("Keyless Entry", 4),
    ROADSIDE("Roadside Assitance", 7);
    
    // fields
    private String display;
    private int pricePerDay;
    
    // creating a constructor
    // since enum constructors are automatically private
    private Option(String display, int pricePerDay)
    {
        this.display = display;
        this.pricePerDay = pricePerDay;
    } // end of premiumPackage()
    
    /***************************
     * Getter Information:
     * getDisplay() - returns the display of the class
     * getPricePerDay() - returns the pricePerDay of the class
     ***************************/
    
    public String getDisplay()
    {
        return this.display;
    } // end of getDisplay()
    
    public int getPricePerDay()
    {
        return this.pricePerDay;
    } // end of getPricePerDay()

    /***************************
     * Setter Information:
     * setDisplay() - @param String - sets the display of the class
     * setPricePerDay() - @param int - sets the pricePerDay of the class
    ***************************/

    public void setDisplay(String display)
    {
        this.display = display;
    } // end of setDisplay()

    public void setPricePerDay(int pricePerDay)
    {
        this.pricePerDay = pricePerDay;
    } // end of setPricePerDay()
    
} // end of enum
