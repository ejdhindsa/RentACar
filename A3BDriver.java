// import statements
import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class A3BDriver
{
    public static void main(String [] args) throws IOException
    {
        // creating a decoder that will read the files
        XMLDecoder decoder = new XMLDecoder(new FileInputStream("As3-vehicles.xml"));
        
        // creating arraylists that will hold premium and standard vehicles
        ArrayList<Vehicle> premium = new ArrayList<>();
        ArrayList<Vehicle> standard = new ArrayList<>();
        
        // creating an arraylist that will read value from the XML file
        // we cast the object into an arraylist as it is a java object
        ArrayList<Vehicle> vehicles = (ArrayList) decoder.readObject();
        
        System.out.println(vehicles.get(0).calculatePrice());
        
        decoder.close();        // closing the decoder
        
        // using a for loop to got through the file and adding vehicles to either
        // of the arrays based on what kind of vehicles they are
        for (Vehicle v : vehicles)
        {
            if (v instanceof Premium)
            {
                premium.add(v);
            } // end of if
            else if (v instanceof Standard)
            {
                standard.add(v);
            } // end of if
            
        } // end of enhanced for
        
        
        // now sorting the values using the custom comparator
        Collections.sort(premium, new InventoryComparator());   // sorting premium
        Collections.sort(standard, new InventoryComparator());  // sorting standard
        
        // printing the vlaues as required by the output
        System.out.println("Premium Vehicles of Price:");
        for (Vehicle p : premium)
        {
            System.out.println(p.getID() + " $" + p.calculatePrice() );
        } // end of enhanced for - printing premium vehicles
        
        
    } // end of main
    
} // end of class