/*
ZADANIE:
Vytvorte program, ktorý na základe textového zadania známky, napr. výborný, chválitebný, dobrý, dostatočný,
nedostatočný vypíše zodpovedajúcu známku čiže 1, 2, 3, 4, 5.
*/

import java.text.Normalizer;
import java.util.Scanner;

public class PriradTextoveHodnotenieKCiselnemu {

    public static String odstranDiakritiku(String s)
    {
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;
    }


    public static void main(String[] args) {
        String slovnaZnamka = ""; // slovnaZnamka na zaciatku nema ziadne slovne hodnotenie, text je prazdny, cize ""

        // START, cyklus zacne
        // while (!slovnaZnamka.equals("koniec")) {
        for (;;) { // Cyklus pojde do nekonecna, pretoze while obsahuje v sebe true
            System.out.println("\nZadaj slovnú známku (výborný, chválitebný, dobrý, dostatočný, nedostatočný)");
            System.out.println("Poznámka: po zadani príkazu 'koniec' program ukončí svoju činnosť");

            Scanner scn = new Scanner(System.in); // inicalizujeme konzolu pre vstup hodnoty od pouzivatela
            slovnaZnamka = scn.nextLine(); // scn.nextLine() v konzole zobrazi kurzor a poziada pouzivatela o vstupnu text. hodnotu


            // Ak chceme vyhodnotit 2 a viac podmienok, ktore platia jedna ALEBO druha, tak pouzijeme || (tzv. pipe, AltGr + w)
            // Pipe je ekvivalentom prikazu OR z inych programovacich jazykov
            // Pozn.: Pre prikaz AND existuje javovsky zapis &&
            // TODO ako vyriesit diakritiku
            // RIESENIE: Zo slovnej znamky odstranime diakritiku a prerobime funkcnost IF, aby porovnavala hodnoty bez diakritiky

            slovnaZnamka = odstranDiakritiku(slovnaZnamka);
            //System.out.println("Slovná známka už bez diakritiky vyzerá takto: " + slovnaZnamka);

            //slovnaZnamka = slovnaZnamka.toLowerCase().toUpperCase();
            //System.out.println("Slovná známka po experimente s 2 metódami (príkazmi) vyzerá takto: " + slovnaZnamka);

            if (slovnaZnamka.equalsIgnoreCase("vyborny")) {
                System.out.println(1);
            } else if (slovnaZnamka.equalsIgnoreCase("chvalitebny")) {
                System.out.println(2);
            } else if (slovnaZnamka.equalsIgnoreCase("dobry")) {
                System.out.println(3);
            } else if (slovnaZnamka.equalsIgnoreCase("dostatocny")) {
                System.out.println(4);
            } else if (slovnaZnamka.equalsIgnoreCase("nedostatocny")) {
                System.out.println(5);
            } else if (slovnaZnamka.equalsIgnoreCase("koniec")) {
                break;
            } else {
                System.out.println("Pre zadanú známku neexistuje žiadna číselná hodnota!");
            }
        }
        // KONIEC, cyklus sa konci


    }


}
