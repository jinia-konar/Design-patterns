import vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Design Pattern: vehicles.Vehicle Factory");
        VehicleFactory vehicleFactory = VehicleFactory.getInstance();
        Vehicle myVehicle = vehicleFactory.getVehicle(VehicleType.CAR);
        myVehicle.drive();
    }
}