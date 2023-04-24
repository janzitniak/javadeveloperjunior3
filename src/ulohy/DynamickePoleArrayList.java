package ulohy;

import java.util.ArrayList;
import java.util.Scanner;


/*
ZADANIE:
Vytvorte dynamicke pole (prostredníctvom ArrayList), ktorý od používateľa bude žiadať zadanie číselných hodnôt, ktoré budeme do dynamického poľa pridávať.
Tento vstup bude “nekonečný”, kým nezadáme záporné číslo.
        Výstupom bude výpis všetkých čísel, ktoré sme v konzole (ArrayListe) zadali.
        Poznámka: Skúsme “ošetriť” zadanie textových hodnôt tak, aby program nespadol.
        Bonusová úloha: Sčítanie všetkých hodnôt, ktoré používateľ v konzole zadal.
*/
// TODO Zvazit pomenovanie triedy, aby viac reprezentovala ciel ulohy zameranej na ArrayList a try catch
public class DynamickePoleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> dynamickePoleCisiel = new ArrayList<Integer>(); // Vytvorili sme prazdne dynamické pole

        int cislo = 0;
        while(cislo >= 0) {
            Scanner scn = new Scanner(System.in); // Inicializacia konzoly na vstup udajov z klavesnice
            System.out.println("Zadaj akékoľvek celé číslo");

            try {
                cislo = scn.nextInt(); // Caka na konkretny vstup od pouzivatela v podobe cisla
            } catch (Exception e) {
                cislo = 0;
                System.out.println("Zadal si nesprávny formát čísla!");
            }

            dynamickePoleCisiel.add(cislo); // Vlozili sme do dynamickeho pola hodnotu

            // Metoda get(index) vrati hodnotu z pola, ked pouzijeme get(0) tak nam vrati prvy prvok
            System.out.println("Tvoje zadané číslo je: " + cislo);
        }

        // Vypis celkoveho suctu
        int sum = 0;
        // v cykle pouzijeme dynamickePoleCisiel.size()-1 pretoze nechceme pracovat s poslednym prvkom pola
        for (int i = 0; i < dynamickePoleCisiel.size()-1; i++) {
            sum += dynamickePoleCisiel.get(i);
        }
        System.out.println("Celkový súčet zadaných čísiel je: " + sum);

/*        for(Integer hodnota:dynamickePoleCisiel) {
            sum = sum + hodnota; // Da sa to napisat aj sum +=hodnota
        }*/


        // Na konci vsetky hodnoty okrem poslednej (pretoze ta zaporna)

    }
}
