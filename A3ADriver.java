// import statements
import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * ACS-1904 Assignment 3
 * driver code for part A
 */

public class A3ADriver
{
    public static void main(String[] args)throws IOException
    {
        // list of vehicles for the inventory
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Inventory inventory = new Inventory("St Mary's Hot Rod Rentals");
        
        // some Premium and some Standard
        // Premium: String make, String model, int bp, PremiumPackage pp
        // Standard: String ma, String mo, int bp
        vehicles.add(new Premium("Ford", "Mustang", 25, PremiumPackage.NONE));
        vehicles.add(new Premium("Ford", "Mustang", 25, PremiumPackage.SPORT));
        vehicles.add(new Premium("Ford", "Mustang", 25, PremiumPackage.SPORT));
        vehicles.add(new Premium("Ford", "Cortina", 18, PremiumPackage.SPORT));
        vehicles.add(new Premium("Ford", "Mondeo", 18, PremiumPackage.BUSINESS));
        vehicles.add(new Premium("Lotus", "Europa", 22, PremiumPackage.SPORT));
        vehicles.add(new Premium("Lotus", "Elan", 23, PremiumPackage.SPORT));
        vehicles.add(new Premium("Lotus", "Seven", 22, PremiumPackage.NONE));
        vehicles.add(new Premium("Maserati", "Quatra", 26, PremiumPackage.LUXURY));
        vehicles.add(new Premium("Chevrolet", "Camaro", 22, PremiumPackage.SPORT));
        vehicles.add(new Premium("Chevrolet", "Camaro", 22, PremiumPackage.LUXURY));
        vehicles.add(new Premium("Chevrolet", "Camaro", 22, PremiumPackage.SPORT));
        vehicles.add(new Premium("Chevrolet", "Corvette", 19, PremiumPackage.SPORT));
        vehicles.add(new Premium("Audi", "R8", 23, PremiumPackage.LUXURY));
        
        // instantiate Standard vehicles and add options
        Standard temp = new Standard("Renault", "Megane", 17);
        temp.addOption(Option.SATNAV);
        temp.addOption(Option.ROADSIDE);
        vehicles.add(temp);
        
        temp = new Standard("Renault", "R5", 17);
        temp.addOption(Option.BLUETOOTH);
        vehicles.add(temp);
        
        temp = new Standard("Nissan", "Micra", 14);
        temp.addOption(Option.KEYLESS);
        temp.addOption(Option.ROADSIDE);
        temp.addOption(Option.SATNAV);
        temp.addOption(Option.BLUETOOTH);
        vehicles.add(temp);
        
        // no option for the next two
        temp = new Standard("Toyota", "Yaris", 15);
        temp.addOption(Option.NONE);
        vehicles.add(temp);
        
        temp = new Standard("Toyota", "Yaris", 16);
        temp.addOption(Option.NONE);
        vehicles.add(temp);
        
        temp = new Standard("Toyota", "Yaris", 17);
        temp.addOption(Option.KEYLESS);
        temp.addOption(Option.SATNAV);
        vehicles.add(temp);
        
        temp = new Standard("Nissan", "Micra", 15);
        temp.addOption(Option.KEYLESS);
        vehicles.add(temp);
        
        temp = new Standard("Honda", "Civic", 14);
        temp.addOption(Option.ROADSIDE);
        temp.addOption(Option.BLUETOOTH);
        vehicles.add(temp);
        
        temp = new Standard("Honda", "Civic", 15);
        temp.addOption(Option.KEYLESS);
        temp.addOption(Option.ROADSIDE);
        temp.addOption(Option.BLUETOOTH);
        vehicles.add(temp);

        
        // add the vehicles to the inventory 
        for(Vehicle v : vehicles){
            inventory.addVehicle(v);
        }
        
        // print the inventory list
        System.out.println(inventory.displayVehicleList());

        // check the association is set in a vehicle
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("Print the inventory name for one Vehicle object.");
        Vehicle vt = inventory.getVehicles().get(0);        
        System.out.println(vt.displayVehicleInfo());
        System.out.println(vt.getInventory().getInventoryName());
        
        // write to XML files
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("XML files are bein written.");
        
        // creating an XML Encoder in order to write the XML files
        
        // XML encoder to write the vehicles to an XML file
        XMLEncoder vehicleEncoder = new XMLEncoder(new FileOutputStream("As3-vehicles.xml"));
        vehicleEncoder.writeObject(vehicles);      // writing the vehicles
        vehicleEncoder.close();                    // closing the encoder
        System.out.println("Vehicles ArrayList has been writtem to an XML file.");
        
        // XML encoder to write the inventory to an XML file
        XMLEncoder inventoryEncoder = new XMLEncoder(new FileOutputStream("As3-inventory.xml"));
        inventoryEncoder.writeObject(inventory);    // writing the inventory
        inventoryEncoder.close();                   // closing the encoder
        System.out.println("Inventory object has been writtem to an XML file.");
        
        System.out.println("end of program.");
        
    } // end of main
    
} // end of class