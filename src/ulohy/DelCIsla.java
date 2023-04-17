package ulohy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DelCIsla {

    public static double vydelCisla(int cisloA, int cisloB) {
        return cisloA / cisloB;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 4;
    }

    @Test
    void otestujDelenieCisiel() {
        assertEquals(2.5, vydelCisla(10, 4));
    }

}
