/******************************************************
 * ACS-1904 : Assignement 3 - Rent A Car
 * Name : Ekamjot Singh
 * Student ID: 3167888
 * 
 * Github Link: https://github.com/ejdhindsa/RentACar
 *****************************************************/

// import statements
import java.util.ArrayList;
import java.util.Collections;

public class Inventory
{
    // FIELDS
    private String name;
    private ArrayList<Vehicle> vehicleList;
    
    // CONSTRUCTOR
    public Inventory()
    {
        this.name = "unknown";
        vehicleList = new ArrayList<>();
    } // end of no-arg constructor
    
    public Inventory(String name)
    {
        this.name = name;
        vehicleList = new ArrayList<>();
    } // end of full-arg constructor
    
    // ** add getter information **
    public String getInventoryName()
    {
        return this.name;
    } // end of getName()
    
    public ArrayList<Vehicle> getVehicles()
    {
        return vehicleList;
    } // end of getVehicles()
    
    // ** add setter information **
    public void setInventoryName(String name)
    {
        this.name = name;
    } // end of setName
    
    public void setVehicles(ArrayList<Vehicle> vehicleList)
    {
        this.vehicleList = vehicleList;
    } // end of setVehicles()
    
    // UTILITY METHODS
    
    /*****************************************
     * addVehicle() - This method adds the vehicles in the ArrayList
     * Furthermore, as required, this method also sets the inventory of that vehicle
     * as the current inventory thus creating a many to one association
     * 
     * (This could have also been done in the driver code but doing it here to follow
     * the assignment requirements)
     * 
     * @param Vehicle object
     ****************************************/
     public void addVehicle(Vehicle vehicle)
     {
         vehicleList.add(vehicle);      // adds vehicle to the Inventory
         vehicle.setInventory(this);    // sets inventory of the vehicle
         Collections.sort(vehicleList);     // sorts the collection 
         
     } // end of addVehicle()
     
     /**************************************
      * displayVehicleList() - This method displays the list of the vehicles in th 
      * alphabetical ordering with the use of collections.sort()
      * 
      **************************************/
    public String displayVehicleList()
    {
        // creating a StringBuilder to hold the info of vehicles list
        StringBuilder st = new StringBuilder();
        
        st.append(this.name + " Inventory:\n\n");
        
        // sorting the arraylist using collections.sort
        for(Vehicle v: vehicleList)
        {
            st.append(v.getMake() + " " + v.getModel() + ": ");
            st.append(v.getID() + " $");
            st.append(v.calculatePrice() + "\n");
            
        } // end of enhanced for
        
        // returning the stringbuilder
        return st.toString();
        
    } // end of displayDisplayList()
    
} // end of class