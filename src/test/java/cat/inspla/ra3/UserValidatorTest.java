package cat.inspla.ra3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    private final UserValidator validator = new UserValidator();

    // Exercici 2: isValidUsername

    @Test
    void usernameCorrecteEsValid() {
        assertTrue(validator.isValidUsername("anna"));
    }

    @Test
    void usernameMassaCurtNoEsValid() {
        assertFalse(validator.isValidUsername("ab"));
    }

    @Test
    void usernameDeTresCaractersEsValid() {
        assertTrue(validator.isValidUsername("bob"));
    }

    @Test
    void usernameNulNoEsValid() {
        assertFalse(validator.isValidUsername(null));
    }

    @Test
    void usernameAmbEspaisBlancsNoEsValid() {
        // "  " té 2 caràcters però trim() el deixa buit (<3)
        assertFalse(validator.isValidUsername("  "));
    }

    // Exercici 2: isAdult

    @Test
    void edatDissetAnysNoEsAdult() {
        assertFalse(validator.isAdult(17));
    }

    @Test
    void edatDivuitAnysEsAdult() {
        assertTrue(validator.isAdult(18));
    }

    @Test
    void edatDenouAnysEsAdult() {
        assertTrue(validator.isAdult(19));
    }

    // Exercici 2: validateRequiredText

    @Test
    void validateRequiredTextAmbCadenaBuidaLlancaExcepcio() {
        assertThrows(IllegalArgumentException.class, () -> {
            validator.validateRequiredText("");
        });
    }

    @Test
    void validateRequiredTextAmbNulLlancaExcepcio() {
        assertThrows(IllegalArgumentException.class, () -> {
            validator.validateRequiredText(null);
        });
    }

    @Test
    void validateRequiredTextAmbEspaisLlancaExcepcio() {
        assertThrows(IllegalArgumentException.class, () -> {
            validator.validateRequiredText("   ");
        });
    }

    @Test
    void validateRequiredTextAmbTextValidNoLlancaExcepcio() {
        assertDoesNotThrow(() -> validator.validateRequiredText("Hola"));
    }
}