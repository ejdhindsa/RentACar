// import statements
import java.util.ArrayList;

public class Standard extends Vehicle
{
    // FIELDS
    ArrayList<Option> optionList;
    
    // CONSTRUCTOR
    public Standard()
    {
        optionList = new ArrayList<>();
    } // end of no-arg constructor
    
    public Standard(String make, String model, int basePrice)
    {
        super(make, model, basePrice);
        optionList = new ArrayList<>();
    } // end of full-arg constructor
    
    // UTILITY METHODS
    
    /**************************************
     * The following method adds an option to the vehicle
     * 
     * @param Option enum that is to be added to the standard vehicle
     *************************************/
     public void addOption(Option option)
     {
         // adding the option enum to the arraylist
         optionList.add(option);
         
     } // end of addOption()
     
    /**************************************
     * The following method displays the list of options that are added to the
     * standard car.
    *************************************/
    public void displayOption()
    {
        // using a StringBuilder to create a string
        StringBuilder st = new StringBuilder();
        
        // printing the list using a for-each loop
        for(Option o : optionList)
        {
            st.append(o.getDisplay() + ", ");

        } // end of for-each loop
        
        // printing out the displayOption
        System.out.println(st.toString());
        
    } // end of displayOption()
    
    /**************************************
     * This method calculates the price of the vehicle and completes the abstract
     * requirement from the super class.
     * 
     * @return double sum of the total price
    *************************************/
    public double calculatePrice()
    {
        // to calculate the total price
        // adding the base price along with the option prices from option enum
        double totalPrice = 0;
        
        totalPrice += this.basePrice;
        
        // using a loop to go through the options arraylist and summing the options
        for ( Option o : optionList)
        {
            totalPrice += o.getPricePerDay();
        } // end of enhanced for
        
        // returning the total price
        return totalPrice;
        
    } // end of calculate price
    
} // end of class