// import statements
import java.util.ArrayList;

public class WeeklySpecial
{
    // FIELDS
    private String date;
    private static int lastNumber = 1045;
    private ArrayList<Vehicle> specialsList;
    private int id;
    
    // CONSTRUCTORS
    public WeeklySpecial()
    {
        date = "unknown";
       id = setID();
    } // end of no-arg constructor
    
    public WeeklySpecial(String date)
    {
        this.date = date;
        id = setID();
    } // end of full-arg constructor
    
    /*************************************
     * GETTERS FOR THE CLASS
     * getDate() - @return String - returns the date of the class
     * getID() - @return int - returns the ID of each vehicle
     * getSpecialsList - @return ArrayList<Vehicle> - returns the arraylist of vehicles
    *************************************/
    public String getDate()
    {
        return this.date;
    } // end of getDate()
    
    public int getID()
    {
        return this.id;
    } // end of getID()
    
    public ArrayList<Vehicle> getSpecialsList()
    {
        return this.specialsList;
    } // end of getSpecialsList()
    
    /*************************************
     * SETTERS FOR THE CLASS
     * setDate() - @param String sets the date of the class
     * setID() - @param int sets the ID of the class
     * setSpecialList - @param ArrayList<Vehicle> sets the vehicle list
    *************************************/
    public void setDate(String date)
    {
        this.date = date;
    } // end of setDate()
    
    private int setID()
    {
        // setting an int to return to the constructor
        int returningID = lastNumber++;
        
        // returns the ID
        return returningID;
    } // end of setID()
    
    public void setSpecialsList(ArrayList<Vehicle> specialsList)
    {
        this.specialsList = specialsList;
    } // end of getSpecialsList()
    
    // UTILITY METHODS
    
    /*************************************
     * addSpecial() - adds a special to the specialsList
     * @param Vehicle object
    *************************************/
    public void addSpecial(Vehicle vehicle)
    {
        specialsList.add(vehicle);
    } // end of addSpecial()
    
    public void displaySpecialsList()
    {
        System.out.println("Date: " + this.date);
        System.out.println("Special ID \t \t Vehicle");
        
        // starting a for each loop to print all the vehicles
        for(Vehicle v : specialsList)
        {
            System.out.println(this.id + "\t \t" + v.getMake() + " " + v.getModel());
        } // end of enhanced-for
        
    } // end of displaySpecialsList()
    
} // end of class