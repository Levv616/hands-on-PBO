public class GasCar implements Vehicle, EngineStartable, Refuelable {
    public void move() { System.out.println("Mobil bensin berjalan."); }
    public void startEngine() { System.out.println("Menyalakan mesin bensin..."); }
    public void isiBahanBakar() { System.out.println("Mengisi bahan bakar..."); }
}
