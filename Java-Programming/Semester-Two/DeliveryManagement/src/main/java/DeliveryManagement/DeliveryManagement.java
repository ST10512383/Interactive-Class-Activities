package DeliveryManagement;

import Vehicle.DeliveryVehicle;
import Vehicle.Motorcycle;
import Vehicle.Truck;
import Vehicle.Van;

public class DeliveryManagement {

    public static void main(String[] args) {
        System.out.println("Welcome to the Delivery Management System");

        // Create subclass object
        Motorcycle mCycleOne = new Motorcycle("M001", "Thabo", "Available", true);
        Van vOne = new Van("V001", "Kim", "Available", 200);
        Truck tOne = new Truck("T001", "Jack", "Available", 5000);

        // Array of objects
        DeliveryVehicle[] vehicles = new DeliveryVehicle[3];

        // Specify which objects should populate the array
        vehicles[0] = mCycleOne;
        vehicles[1] = vOne;
        vehicles[2] = tOne;
        
        // Display vehicle information (display the contents of the array)
        for(DeliveryVehicle vehicle : vehicles) {
            
            System.out.println(vehicle);
            vehicle.startDelivery();
            
            // dynamic method binding
            vehicle.deliverPackage();
            
            // call interface method
            vehicle.trackVehicle();
            
            // Object getClass method to display the objects class
            System.out.println("Vehicle type: " + vehicle.getClass());
        }
    }
}
