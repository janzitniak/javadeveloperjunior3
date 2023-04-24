package ulohy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Viac informacii ohladom jUnit testov na https://www.vogella.com/tutorials/JUnit/article.html

@DisplayName("Testy pre metody obdlznika")
class TestujObdlznik {

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("Testy na vypocet obvodu")
    public void testVypocitajObvod() {
        assertEquals(10, Obdlznik.vypocitajObvod(2, 3));
        assertEquals(13, Obdlznik.vypocitajObvod(2.5, 4));
    }

    @Test
    @DisplayName("Testy na vypocet obsahu")
    public void testVypocitajObsah() {
        assertEquals(6, Obdlznik.vypocitajObsah(2, 3));
        assertEquals(10, Obdlznik.vypocitajObsah(2.5, 4));
        assertEquals(5, Obdlznik.vypocitajObsah(1, 5));
    }
}
// TODO Prestavka do 19.20
