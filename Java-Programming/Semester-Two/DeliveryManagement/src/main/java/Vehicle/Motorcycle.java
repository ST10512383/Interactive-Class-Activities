package Vehicle;

public class Motorcycle extends DeliveryVehicle {
    
    private boolean hasDeliveryBox;
    
    public Motorcycle(String vehicleID, String driverName, String deliveryStatus, boolean hasDeliveryBox) {
        
        super(vehicleID, driverName, deliveryStatus);
        this.hasDeliveryBox = hasDeliveryBox;
        
    }
    
    public boolean hasDeliveryBox() {
        return hasDeliveryBox;
    }
    
    @Override
    public void deliverPackage() {
        System.out.println(getDriverName() + " is delivering the package by motorcycle.");
        
        System.out.println("Motorcycles are suitable for small packages");
    }
    
    @Override
    public void trackVehicle() {
        System.out.println("Tracking motorcycle " + getVehicleId());
    }
}
