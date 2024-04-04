/******************************************************
 * ACS-1904 : Assignement 3 - Rent A Car
 * Name : Ekamjot Singh
 * Student ID: 3167888
 * 
 * Github Link: https://github.com/ejdhindsa/RentACar
 *****************************************************/

public interface Special
{   
    // creating abstract methods that are to be instantiated by the vehicle class
    public abstract String getVehicleInfo();        // gets info go the vehicle      
    
    public abstract int getSpecialCode();           // ges the special code of the vehicle
    
    public abstract void setSpecialCode(int specialCode);          // sets the special code of the vehicle
    
} // end of interface