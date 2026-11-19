public class VehicleController {
    private final Vehicle vehicle;

    public VehicleController(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void operate() {
        vehicle.move();
    }
}
