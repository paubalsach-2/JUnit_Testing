package cat.inspla.ra3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsAppTest {

    private final StringUtilsApp utils = new StringUtilsApp();

    // Exercici 8: prova parametritzada per a normalizeSpaces
    @ParameterizedTest
    @CsvSource({
        "'hola   món',       'hola món'",
        "'  espais  davanters  ',  'espais davanters'",
        "'sense canvis',     'sense canvis'",
        "'a  b  c  d',       'a b c d'",
        "'un sol espai',     'un sol espai'"
    })
    void normalizeSpacesRedueixEspaisMultiples(String input, String expected) {
        assertEquals(expected, utils.normalizeSpaces(input));
    }

    @ParameterizedTest
    @CsvSource({
        // Entrades amb tabuladors i espais barrejats
        "'hola\tmón',    'hola món'"
    })
    void normalizeSpacesTractaTabuladors(String input, String expected) {
        assertEquals(expected, utils.normalizeSpaces(input));
    }
}