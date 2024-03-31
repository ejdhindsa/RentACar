public abstract class Vehicle implements Comparable<Vehicle>
{
    // FIELDS
    protected String make;           // make of the vehicle
    protected String model;          // model of the vehicle
    protected String id;             // id of the vehicle
    protected int basePrice;         // base price of the vehicle
    
    private Inventory inventory;
    
    private static int idValue = 1045;  // ID at which value starts
    //private int nextID;                 // next number after idValue;
    
    // CCONSTRUCTORS
    public Vehicle()
    {
        this.make = "unknown";
        this.model = "unknown";
        this.id = setID(make, model);
        this.basePrice = 0;
        
    } // end of no-arg constructor
    
    public Vehicle(String make, String model, int basePrice)
    {
        this.make = make;
        this.model = model;
        this.id = setID(make, model);
        this.basePrice = basePrice;
        
    } // end of full-arg constructor
    
    /****************************************
     * Following methods are the methods that return required data of the class
     * 
     * getMake() - returns the make of the vehicle
     * getModel() - returns the model of the vehicle
     * getID() - returns the ID of the vehicle
     * getBasePrice() - returns the basePrice of the vehicle
     * getInventory() - returns the inventory of the vehicle
     * 
     ***************************************/
    
    public String getMake()
    {
        return this.make;
    } // end of getMake()
    
    public String getModel()
    {
        return this.model;
    } // end of getModel()
    
    public String getID()
    {
        return this.id;
    } // end of getID()
    
    public int getBasePrice()
    {
        return this.basePrice;
    } // end of getBasePrice()
    
    public Inventory getInventory()
    {
        return this.inventory;
    } // end of getInverntory()
    
    /****************************************
     * Following methods are the methods that set the required data of the class
     * 
     * setMake() - Takes string as an argument and sets the make of the vehicle
     * setModel() - Takes string as an argument and sets the model of the vehicle
     * setBasePrice() - Takes int as an argument and sets the basePrice of the vehicle
     * setInventory() - Takes Inventory as an argument and set sthe inventory of the vehicle
     * 
     ***************************************/
    
    public void setMake(String make)
    {
        this.make = make;
    } // end of setMake()
    
    public void setModel(String model)
    {
        this.model = model;
    } // end of setModel()
    
    public void setBasePrice(int basePrice)
    {
        this.basePrice = basePrice;
    } // end of setBasePrice()
    
    public void setID(String id){
        this.id = id;
    }
    public void setInventory(Inventory inventory)
    {
        this.inventory = inventory;
    } // end of setInventory()
    
    // UTILITY METHODS
    
    /***************************************
     * compareTo() method that returns an int comparing two vehicles
     * @param vehicle that is a vehicle object
     * @return returns the int based on the compareTo method
    ***************************************/
    public int compareTo(Vehicle vehicle)
    {
        return this.id.compareTo(vehicle.getID());
        
    } // end of compareTo()
    
    /***************************************
     * calculatePrice() is an abstract method that will be implemented in the
     * subclasses of the vehicle class, i.e. Premium & Standard
     * 
     **************************************/
    public abstract double calculatePrice();
    
    /**************************************
     * The following method sets up the ID in the method that is described in
     * the assignment requirements in the XXYY-0000 pattern
     * 
     * @param make make of the vehicle
     * @param model model of the behicle
     * @return unique ID of the vehicle
     *************************************/
     public static String setID(String make, String model)
     {
         // creating the strings of the first to letters of the make and model of
         // the vehicle to which the ID is set
         String makeCatenation = make.substring(0, 2);
         String modelCatenation = model.substring(0, 2);
         
         // creating the ID
         int nextID = idValue++;
         
         // creating and returning the catenation of all the values
         return makeCatenation + modelCatenation + "-" + nextID;
         
         
     } // end of setID()
     
     /**************************************
      * The following method returns information of the vehicle as required in
      * the assigment
      * @return vehicle information
      ***********************************/
      public String displayVehicleInfo()
      {
          // creating a string builder
          StringBuilder sb = new StringBuilder();
          
          // using stringbuilder to add required information
          sb.append(getMake() + " ");       // adds the make of the vehicle
          sb.append(getModel() + " ");      // adds the model of the vehicle
          sb.append(getID());               // adds the ID of the vehicle
          
          return sb.toString();             // returns the string builder as a string 
          
      } // end of displayVehicleInformation()
      
      /*********************************
       * toString method of the class
       * @return as required information
       ********************************/
       @Override
       public String toString()
       {
           return getMake() + ", " + getModel();
       } // end of toString()
     
} // end of class