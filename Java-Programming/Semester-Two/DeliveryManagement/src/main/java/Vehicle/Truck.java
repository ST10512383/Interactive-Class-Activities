package Vehicle;

import Exceptions.*;

public class Truck extends DeliveryVehicle {

    private int weight;

    public Truck(String vehicleId, String driverName, String deliveryStatus, int weight) throws InvalidVehicleIDException, InvalidCapacityException {
        super(vehicleId, driverName, deliveryStatus);
        setMaximumWeight(weight);
    }

    public int getWeight() {
        return weight;
    }

    // Setter: Accepts the value of the truck's maxumum weight
    public void setMaximumWeight(int weight) throws InvalidCapacityException {
        if (weight <= 0) {
            throw new InvalidCapacityException("Maximum weight " + weight + " must be greater than zero.");
        }
        this.weight = weight;
    }

    @Override
    public void deliverPackage() {
        System.out.println(getDriverName() + " is delivering the package by Truck.");

        System.out.println("This truck can carry a max capacity of " + weight + "KG");
    }

    @Override
    public void trackVehicle() {

    }
}
