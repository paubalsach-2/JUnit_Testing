package cat.inspla.ra3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    private final TemperatureConverter converter = new TemperatureConverter();

    // Exercici 3: CelsiusToFahrenheit
    // S'usa assertEquals amb delta perquè les operacions amb double
    // poden produir errors d'arrodoniment de coma flotant.
    @ParameterizedTest
    @CsvSource({
            "0.0,   32.0",
            "100.0, 212.0",
            "-40.0, -40.0",
            "37.0,  98.6"
    })
    void convertCelsiusToFahrenheitRetornaValorCorrecte(double c, double expected) {
        assertEquals(expected, converter.convertCelsiusToFahrenheit(c), 0.001);
    }

    // Exercici 3: FahrenheitToCelsius
    @ParameterizedTest
    @CsvSource({
            "32.0,   0.0",
            "212.0,  100.0",
            "-40.0,  -40.0",
            "98.6,   37.0"
    })
    void convertFahrenheitToCelsiusRetornaValorCorrecte(double f, double expected) {
        assertEquals(expected, converter.convertFahrenheitToCelsius(f), 0.001);
    }
}

