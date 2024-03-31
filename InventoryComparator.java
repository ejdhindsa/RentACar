// import statements
import java.util.Comparator;

public class InventoryComparator implements Comparator<Vehicle>
{
    public int compare(Vehicle vehicleOne, Vehicle vehicleTwo)
    {
        if (vehicleOne.calculatePrice() > vehicleTwo.calculatePrice())
        {
            return -1;
        } // end of if
        else if (vehicleOne.calculatePrice() < vehicleTwo.calculatePrice())
        {
            return 1;
        } // end of else if
        else
        {
            return 0;
        } // end of else
        
    } // end of compare
    
} // end of class