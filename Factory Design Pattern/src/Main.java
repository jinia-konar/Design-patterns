import vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Design Pattern: vehicles.Vehicle Factory");
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle myVehicle = vehicleFactory.getVehicle(VehicleType.TRUCK);
        myVehicle.drive();
    }
}