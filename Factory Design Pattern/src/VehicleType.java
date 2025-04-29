import vehicles.*;

import java.util.function.Supplier;

public enum VehicleType {
    CAR("Car", Car::new),
    BIKE("Bike", Bike::new),
    TRUCK("Truck", Truck::new),
    BUS("Bus", Bus::new);

    private final Supplier<Vehicle> supplier;
    private final String value;

    VehicleType(String value, Supplier<Vehicle> supplier) {
        this.supplier = supplier;
        this.value = value;
    }

    /**
     * This is done to incorporate open/close principle, so that addition of new vehicle is easy
     */
    public Vehicle getVehicle() {
        return this.supplier.get();
    }

    public String getValue() {
    return this.value;
    }
}
