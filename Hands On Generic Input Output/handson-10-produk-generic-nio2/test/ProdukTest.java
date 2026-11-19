import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProdukTest {
    @Test
    void toStringHarusSesuaiFormatFile() {
        Produk<String, Double> p = new Produk<>("Mouse", 150000.0, 50);
        assertEquals("Mouse,150000.0,50", p.toString());
    }
}
