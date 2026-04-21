package cat.inspla.ra3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    private Cart cart;

    @BeforeEach
    void setUp() {
        // Es crea una instància nova abans de cada test
        // per garantir que els tests siguin independents
        cart = new Cart();
    }

    @Test
    void cartNovaTeTotalZero() {
        // Una cistella nova ha de tenir total 0.0
        assertEquals(0.0, cart.getTotal());
    }

    @Test
    void cartNovaTeZeroElements() {
        assertEquals(0, cart.getItemCount());
    }

    @Test
    void afegirArticleIncrementaTotal() {
        cart.addItem("USB", 8.50);
        assertEquals(8.50, cart.getTotal());
    }

    @Test
    void afegirDosArticlesAcumulaElTotal() {
        cart.addItem("USB", 8.50);
        cart.addItem("Ratolí", 15.00);
        assertEquals(23.50, cart.getTotal());
    }

    @Test
    void clearDeixaLaCistellaAmbTotalZero() {
        cart.addItem("USB", 8.50);
        cart.clear();
        assertEquals(0.0, cart.getTotal());
    }

    @Test
    void clearDeixaElComptadorAZero() {
        cart.addItem("USB", 8.50);
        cart.addItem("Teclat", 25.00);
        cart.clear();
        assertEquals(0, cart.getItemCount());
    }
}

