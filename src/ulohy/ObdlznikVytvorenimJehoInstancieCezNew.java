package ulohy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
ZADANIE:
Vytvorte triedu Obdlznik, v ktorej budú 2 statické metódy. Prvá na výpočet obvodu obdĺžnika (vypocitajObvod), druhá na
výpočet jeho obsahu (vypocitajObsah).
*/

public class ObdlznikVytvorenimJehoInstancieCezNew {

    public double vypocitajObvod(double stranaA, double stranaB) {
        return 2 * (stranaA + stranaB);
    }

    public double vypocitajObsah(double stranaA, double stranaB) {
        return stranaA * stranaB;
    }

    public static void main(String[] args) {
        double a = 2; // Strana a
        double b = 3; // Strana b
        ObdlznikVytvorenimJehoInstancieCezNew obdlznik1 = new ObdlznikVytvorenimJehoInstancieCezNew(); // Vytvorili sme objekt (=instanciu triedy) Obdlznik
        System.out.println("Obvod prvého obdĺžnika je: " + obdlznik1.vypocitajObvod(a, b));
        System.out.println("Obsah prvého obdĺžnika je: " + obdlznik1.vypocitajObsah(a, b));

        double c = 3;
        double d = 4;
        ObdlznikVytvorenimJehoInstancieCezNew obdlznik2 = new ObdlznikVytvorenimJehoInstancieCezNew();
        System.out.println("Obvod druhého obdĺžníka je " + obdlznik2.vypocitajObvod(c, d));
        System.out.println("Obsah druhého obdĺžnika je " + obdlznik2.vypocitajObsah(c, d));

    }

    // Vlozime jUnit test
    // Otestujeme funkcnost metody vypocitajObvod
    @Test
    void otestujVypocitajObvod() {
        // Metoda assertEquals vyzaduje zadanie 2 argumentov, prvy je spravna (skutocna) hodnota, ktoru ocakavame ako ludia
        // Druhy argument je volanie metody, ktoru testujeme. Ta tiez vrati hodnotu, ktoru vlastne porovnava s tou skutocnou
        assertEquals(10.0, vypocitajObvod(2, 3));
        assertEquals(6.0, vypocitajObvod(1, 2));
    }

    // Otestujeme funkcnost metody vypocitajObsah
    @Test
    void otestujVypocitajObsah() {
        assertEquals(6, vypocitajObsah(2, 3));
        assertEquals(10, vypocitajObsah(2.5, 4));
        assertEquals(5, vypocitajObsah(1, 5));
    }

}
