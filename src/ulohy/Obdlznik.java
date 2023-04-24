package ulohy;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
ZADANIE:
Vytvorte triedu Obdlznik, v ktorej budú 2 statické metódy. Prvá na výpočet obvodu obdĺžnika (vypocitajObvod), druhá na
výpočet jeho obsahu (vypocitajObsah).

Dodatočná úloha vylepšenej verzie: Program bude zároveň od používateľa vyžadovať zadanie príkazu na prácu s programom.
Ak zadá príkaz s, tak program vyžiada od používateľa zadanie strán a, b. Ak zadá q, tak program sa ukončí.

*/

public class Obdlznik {

    public static double vypocitajObvod(double stranaA, double stranaB) {
        return 2 * (stranaA + stranaB);
    }

    public static double vypocitajObsah(double stranaA, double stranaB) {
        return stranaA * stranaB;
    }

    public static void main(String[] args) {
        //double a = 2.5; // Strana a
        //double b = 3.5; // Strana b

        Scanner scn = new Scanner(System.in); // Inicializacia konzoly (System.in) cez triedu Scanner

        double a = 0;
        double b = 0;

        try {
            System.out.println("Zadaj stranu a");
            a = scn.nextDouble();
            System.out.println("Zadaj stranu b");
            b = scn.nextDouble();
        } catch (InputMismatchException e) {
            // Tu dopisem vlastny kod, ktory naraba s chybou
        }

        System.out.println("Obvod prvého obdĺžnika je: " + Obdlznik.vypocitajObvod(a, b));
        System.out.println("Obsah prvého obdĺžnika je: " + Obdlznik.vypocitajObsah(a, b));

//        File file = new File("cesta/k/suboru.txt");
//        file.createNewFile();

        // TODO Na osetrenie chyb, resp. zhavarovanie programu pouzivame prikazy try a catch
    }


}
