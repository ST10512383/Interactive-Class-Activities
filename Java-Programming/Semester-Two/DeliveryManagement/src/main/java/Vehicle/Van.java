package Vehicle;

public class Van extends DeliveryVehicle {

    private int capacity;

    public Van(String vehicleId, String driverName, String deliveryStatus, int capacity) {
        super(vehicleId, driverName, deliveryStatus);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
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
