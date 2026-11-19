public class ElectricCar implements Vehicle, EngineStartable, Chargeable {
    public void move() { System.out.println("Mobil listrik berjalan."); }
    public void startEngine() { System.out.println("Menyalakan motor listrik..."); }
    public void isiBaterai() { System.out.println("Mengisi baterai..."); }
}
