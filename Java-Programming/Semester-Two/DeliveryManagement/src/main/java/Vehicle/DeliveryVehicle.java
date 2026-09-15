package Vehicle;

import Interfaces.Trackable;
import Exceptions.*;

public abstract class DeliveryVehicle implements Trackable {

    // Encapsulation - Information hiding
    private String vehicleId;
    private String driverName;
    private String deliveryStatus;

    // Constructor
//    public DeliveryVehicle(String vID, String dName, String delStatus) throws InvalidVehicleIDException {
//        validateVehicleId(vID);
//        this.vehicleId = vID;
//        this.driverName = dName;
//        this.deliveryStatus = delStatus;
//    }
    public DeliveryVehicle(String vID, String dName, String delStatus) {
        validateVehicleId(vID);
        this.vehicleId = vID;
        this.driverName = dName;
        this.deliveryStatus = delStatus;
    }

//    private void validateVehicleId(String vehicleId) throws InvalidVehicleIDException {
//        if (vehicleId == null || vehicleId.isBlank()) {
//            throw new InvalidVehicleIDException("Vehicle ID cannot be empty.");
//        }
//    }
    private void validateVehicleId(String vehicleId) {
        if (vehicleId == null || vehicleId.isBlank()) {
            throw new IllegalArgumentException("Vehicle ID cannot be empty.");
        }
    }

    // Getters
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    // Setters
    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    // Common superclass method 
//    public void startDelivery() throws VehicleNotAvailableException {
//
//        if (!deliveryStatus.equalsIgnoreCase("Available")) {
//            throw new VehicleNotAvailableException(
//                    "Vehicle " + vehicleId + " is currently not available");
//        }
//
//        System.out.println(
//                driverName + " has started a delivery."
//        );
//    }
    public void startDelivery() {

        if (!deliveryStatus.equalsIgnoreCase("Available")) {
            throw new IllegalArgumentException(
                    "Vehicle " + vehicleId + " is currently not available");
        }

        System.out.println(
                driverName + " has started a delivery."
        );
    }

    // Method to be overridden
    public abstract void deliverPackage();
    // Interface method

    @Override
    public abstract void trackVehicle();

    // Object.toString() overridden
    @Override
    public String toString() {

        return "Vehicle ID: " + vehicleId
                + ", Driver: " + driverName
                + ", Status: " + deliveryStatus;
    }

    // Object.equals() overridden
    @Override
    public boolean equals(Object obj) {

        // Same object
        if (this == obj) {
            return true;
        }

        // Null check
        if (obj == null) {
            return false;
        }

        // Check type
        if (!(obj instanceof DeliveryVehicle)) {
            return false;
        }

        DeliveryVehicle other
                = (DeliveryVehicle) obj;

        // Compare vehicle IDs
        return vehicleId.equals(other.vehicleId);
    }

    // Object.hashCode()
    @Override
    public int hashCode() {

        return vehicleId.hashCode();
    }

}
