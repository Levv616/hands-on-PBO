// Class generik untuk jenis data lain (pelanggan, transaksi)
public class DataRecord<A, B, C> {
    private A a;
    private B b;
    private C c;

    public DataRecord(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return a + "," + b + "," + c;
    }
}
