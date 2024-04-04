/******************************************************
 * ACS-1904 : Assignement 3 - Rent A Car
 * Name : Ekamjot Singh
 * Student ID: 3167888
 * 
 * Github Link: https://github.com/ejdhindsa/RentACar
 *****************************************************/

// import statements
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class A3BDriver
{
    public static void main(String [] args) throws IOException
    {
        // creating a decoder that will read the files
        XMLDecoder decoder;
        try
        {
            decoder = new XMLDecoder(new FileInputStream("As3-vehicles.xml"));
        } // end of try
        catch (FileNotFoundException e)
        {
            decoder = null;
            JOptionPane.showMessageDialog(null, "File not Found.");
        } // end of catch
        
        // creating arraylists that will hold premium and standard vehicles
        ArrayList<Vehicle> premium = new ArrayList<>();
        ArrayList<Vehicle> standard = new ArrayList<>();
        
        // creating an arraylist that will read value from the XML file
        // we cast the object into an arraylist as it is a java object
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        
        if (decoder != null)
        {
           vehicles = (ArrayList) decoder.readObject();
           decoder.close();        // closing the decoder 
            
        } // end of if
        

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
        System.out.println();       // printing an empty line
        
        for (Vehicle p : premium)
        {
            // creating a stringbuilder that will be used to format the printing of vehicles
            StringBuilder sb = new StringBuilder();
        
            // appending all the required information to the string builder created above
            sb.append(p.getMake() + " " + p.getModel() + ": ");
            sb.append(p.getID() + " $" + (int) p.calculatePrice());
            
            System.out.println(sb.toString());
            
        } // end of enhanced for - printing premium vehicles
        
        System.out.println();       // printing an empty line
        
        System.out.println("Standard Vehicles of Price:");
        System.out.println();       // printing an empty line
        
        for (Vehicle p : standard)
        {
            // creating a stringbuilder that will be used to format the printing of vehicles
            StringBuilder sb = new StringBuilder();
            
            // appending all the required information to the string builder created above
            sb.append(p.getMake() + " " + p.getModel() + ": ");
            sb.append(p.getID() + " $" + (int) p.calculatePrice());
            
            System.out.println(sb.toString());
            
        } // end of enhanced for - printing premium vehicles
        
        // writing all the information in an XML file
        XMLEncoder encoder = new XMLEncoder(new FileOutputStream("As3B-Vehicles.xml"));
        // writing standard and premium to the xml file
        encoder.writeObject(premium);
        encoder.writeObject(standard);
        
        encoder.close();        // closing the encoder
        
        // printing tht all the information has been writtent to the file
        System.out.println();       // printing an empty line
        System.out.println("*** Registration info has been written to As3B-vehicles.xml ***");
        
        // end of program
        System.out.println();       // printing an empty line
        System.out.println("end of program");
        
    } // end of main
    
} // end of class