package DeliveryManagement;

import Exceptions.*;

import Vehicle.DeliveryVehicle;
import Vehicle.Motorcycle;
import Vehicle.Truck;
import Vehicle.Van;

public class DeliveryManagement {

    public static void main(String[] args) {
        System.out.println("Welcome to the Delivery Management System");

        try {
            // Create subclass object
            Motorcycle mCycleOne = new Motorcycle("M001", "Thabo", "Available", true);
            Van vOne = new Van("V001", "Kim", "Available", 0);
            Truck tOne = new Truck("T001", "Jack", "Available", 0);

            // Array of objects
            DeliveryVehicle[] vehicles = new DeliveryVehicle[3];

            // Specify which objects should populate the array
            vehicles[0] = mCycleOne;
            vehicles[1] = vOne;
            vehicles[2] = tOne;

            // Display vehicle information (display the contents of the array)
            for (DeliveryVehicle vehicle : vehicles) {

                System.out.println(vehicle);
                vehicle.startDelivery();

                // dynamic method binding
                vehicle.deliverPackage();

                // call interface method
                vehicle.trackVehicle();

                // Object getClass method to display the objects class
                System.out.println("Vehicle type: " + vehicle.getClass());
            }
        } catch (InvalidVehicleIDException e) {
            System.out.println("Vehicle ID error: " + e.getMessage());
        } catch (InvalidCapacityException e) {
            System.out.println("Capacity error: " + e.getMessage());
        } catch (VehicleNotAvailableException e) {
            System.out.println("Delivery error: " + e.getMessage());
        } finally {
            System.out.println("System operation is complete");
        }
    }
}
