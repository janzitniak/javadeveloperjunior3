package ulohy;

/*
Vytvorte triedu Obdlznik, v ktorej budú 2 statické metódy. Prvá na výpočet obvodu obdĺžnika (vypocitajObvod), druhá na
výpočet jeho obsahu (vypocitajObsah).
*/


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Obdlznik {

    public static double vypocitajObvod(double stranaA, double stranaB) {
        return 2 * (stranaA + stranaB);
    }

    public static void main(String[] args) {
        double a = 2; // Strana a
        double b = 3; // Strana b

        System.out.println("Obvod obdĺžnika je: " + vypocitajObvod(a, b));
    }


    // Vlozime jUnit test
    // Otestujeme funkcnost metody vypocitajObvod
    @Test
    void otestujVypocitajObvod() {
        assertEquals(10.0, vypocitajObvod(2, 3));
        assertEquals(7.0, vypocitajObvod(1, 2));
    }
}
