package Vehicle;

import Exceptions.*;

public class Van extends DeliveryVehicle {

    private int capacity;

    public Van(String vehicleId, String driverName, String deliveryStatus, int capacity) throws InvalidVehicleIDException, InvalidCapacityException {
        super(vehicleId, driverName, deliveryStatus);
        setCapacity(capacity);
    }

    // Getter
    public int getCapacity() {
        return capacity;
    }

    // Setter: Called when the user provides a value for the van's capacity
    public void setCapacity(int capacity) throws InvalidCapacityException {
        
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero.");
        }
        this.capacity = capacity;
    }

    @Override
    public void deliverPackage() {
        System.out.println(getDriverName() + " is delivering the package by van.");

        System.out.println("This van can carry a max capacity of " + capacity + "KG");
    }

    @Override
    public void trackVehicle() {

    }
}
