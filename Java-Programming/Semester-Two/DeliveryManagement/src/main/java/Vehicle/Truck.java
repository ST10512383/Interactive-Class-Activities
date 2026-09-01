package Vehicle;

public class Truck extends DeliveryVehicle {

    private int weight;

    public Truck(String vehicleId, String driverName, String deliveryStatus, int weight) {
        super(vehicleId, driverName, deliveryStatus);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
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
