public abstract class Vehicle
{
    // FIELDS
    protected String make;           // make of the vehicle
    protected String model;          // model of the vehicle
    protected String id;             // id of the vehicle
    protected int basePrice;         // base price of the vehicle
    
    private static int idValue = 1045;  // ID at which value starts
    private int nextID;                 // next number after idValue;
    
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
     * getBasePrice() - return the basePrice of the vehicle
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
    } // end of getID();
    
    public int getBasePrice()
    {
        return this.basePrice;
    } // end of getBasePrice();
    
    /****************************************
     * Following methods are the methods that set the required data of the class
     * 
     * setMake() - Takes string as an argument and sets the make of the vehicle
     * setModel() - Takes string as an argument and sets the model of the vehicle
     * setBasePrice() - Takes int as an argument and sets the basePrice of the vehicle
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
        this.basePrice = this.basePrice;
    } // end of setBasePrice
    
    // UTILITY METHODS
    
    /***************************************
     * calculatePrice() is an abstract method that will be implemented in the
     * subclasses of the vehicle class, i.e. Premium & Standard
     * 
     **************************************/
     
    public abstract void calculatePrice();
    
    
    
     
} // end of class