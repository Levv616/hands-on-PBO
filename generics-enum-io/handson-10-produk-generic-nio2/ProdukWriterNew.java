import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class ProdukWriterNew {
    // Method generik: menyimpan list bertipe apa pun ke file
    static <T> void simpan(Path path, List<T> data) throws IOException {
        List<String> lines = new ArrayList<>();
        for (T item : data) lines.add(item.toString());
        Files.write(path, lines);
    }

    public static void main(String[] args) {
        List<Produk<String, Double>> produkList = new ArrayList<>();
        produkList.add(new Produk<>("Laptop", 15000000.0, 10));
        produkList.add(new Produk<>("Mouse", 150000.0, 50));
        produkList.add(new Produk<>("Keyboard", 350000.0, 25));

        Path filePath = Paths.get("produk_output.txt");

        try {
            simpan(filePath, produkList);
            System.out.println("Data produk berhasil disimpan menggunakan NIO.2");

            // Baca kembali dan tampilkan di konsol
            for (String line : Files.readAllLines(filePath))
                System.out.println(line);

            // Pelanggan (nama, kota, umur)
            List<DataRecord<String, String, Integer>> pelanggan = new ArrayList<>();
            pelanggan.add(new DataRecord<>("Andi", "Medan", 21));
            simpan(Paths.get("pelanggan.txt"), pelanggan);

            // Transaksi (id, total, status)
            List<DataRecord<String, Double, String>> transaksi = new ArrayList<>();
            transaksi.add(new DataRecord<>("TRX001", 15150000.0, "LUNAS"));
            simpan(Paths.get("transaksi.txt"), transaksi);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan file: " + e.getMessage());
        }
    }
}
