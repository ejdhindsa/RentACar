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

public class A3CDriver
{
    public static void main(String[] args) throws IOException
    {
        // creating a WeeklySPecial object
        WeeklySpecial weeklySpecial = new WeeklySpecial();
        weeklySpecial.setDate("March 20");
        
        // using the XML file created from the previous driver code
        XMLDecoder decoder;
        try
        {
            decoder = new XMLDecoder(new FileInputStream("As3B-Vehicles.xml"));
        } // end of try
        catch (FileNotFoundException e)
        {
            decoder = null;
            JOptionPane.showMessageDialog(null, "File Not Found!");
        } // end of catch
        
        // declaring two arraylists that will hold premium and standard vehicles
        ArrayList<Vehicle> premium = new ArrayList<>();
        ArrayList<Vehicle> standard = new ArrayList<>();
        
        if (decoder != null)
        {
            premium = (ArrayList<Vehicle>) decoder.readObject();
            standard = (ArrayList<Vehicle>) decoder.readObject();
            decoder.close();
        } // end of if
        
        // creating an arraylist that will read value from the XML file
        // we cast the object into an arraylist as it is a java object
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        
        // addig values from premium and standard to vehicles
        for (Vehicle v : premium)
        {
            vehicles.add(v);
        } // end of enhanced for
        
        for (Vehicle v : standard)
        {
            vehicles.add(v);
        } // end of enhanced for 
        
        // printing all the vehicles to check if they are properly read
        // for(int i = 0; i < vehicles.size(); i++)
        // {   
            // System.out.print(vehicles.get(i));
        // } // end of for-loop
        
        // using a for loop to add required cars to the special class
        for(int i = 0; i < vehicles.size(); i++)
        {
            // using an if loop to check for the fords, lotuses and nissans and adding
            // that to the specials
            String make = vehicles.get(i).getMake();
            
            if (make.equalsIgnoreCase("Ford") || make.equalsIgnoreCase("Lotus") || make.equalsIgnoreCase("Nissan") )
            {
                // adding the said vehicles to the weeklySpecial
                weeklySpecial.addSpecial(vehicles.get(i));
                
            } // end of if
            
        } // end of for loop
        
        // printing the list
        weeklySpecial.displaySpecialsList();
        
        // writing the files to an XMLFile
        XMLEncoder encoder = new XMLEncoder(new FileOutputStream("As3C-specialInfo.xml"));
        encoder.writeObject(weeklySpecial);
        encoder.close();
        
        // final messages
        System.out.println("\nWeekly special info written to file.");
        System.out.println("\nend of program");
        
    } // end of main
    
} // end of class