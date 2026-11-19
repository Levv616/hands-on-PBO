public class Main {
    public static void main(String[] args) {
        new VehicleController(new ElectricCar()).operate();
        new VehicleController(new GasCar()).operate();
        new VehicleController(new Bicycle()).operate();
    }
}
