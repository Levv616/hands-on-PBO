public class Cell<T> {
    private T data;

    public void setValue(T data) { this.data = data; }

    public T getValue() { return data; }

    public void displayType() {
        System.out.println("Tipe data: " + data.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        Cell<Integer> a = new Cell<Integer>();
        a.setValue(10);
        a.displayType();

        Cell<String> b = new Cell<String>();
        b.setValue("Halo");
        b.displayType();

        // a.setValue("teks"); // ERROR saat compile
        int angka = a.getValue(); // tanpa casting
        System.out.println(angka + " dan " + b.getValue());
    }
}
