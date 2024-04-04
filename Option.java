/******************************************************
 * ACS-1904 : Assignement 3 - Rent A Car
 * Name : Ekamjot Singh
 * Student ID: 3167888
 * 
 * Github Link: https://github.com/ejdhindsa/RentACar
 *****************************************************/

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
    
} // end of enum
