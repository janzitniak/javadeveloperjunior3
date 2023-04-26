package opakovanie;
/*
Vytvorte knižnicu (Kniznica), kde bude môcť používateľ zadať knihy (názov, autora, rok vydania) cez konzolu kým nezadá slovo quit. Tie na konci vypíšeme. Opakovanie na ArrayList.
        Menu s možnosťami
        -----------------
        Zadaj novú knihu
        Zobraz všetky knihy
        Zobraz konkrétnu knihu (podľa indexu)
        Vymaž konkrétnu knihu (podľa indexu)
        Zobraz počet všetkých kníh
        9. Vymaž všetky knihy
        Koniec = skončí zadávanie novej knihy
*/
// TODO Prestavka do 20.36
import opakovanie.model.Kniha;

import java.util.ArrayList;
import java.util.Scanner;

public class Kniznica {
    public static void main(String[] args) {
        ArrayList<Kniha> vsetkyKnihy = new ArrayList<Kniha>(); // Vytvorime dynamicke pole, teda ArrayList, ktory je novy, teda prazdny
        //vsetkyKnihy.get(0); // Vrati prvu knihu
        //vsetkyKnihy.remove(0); // Vymaze prvu knihu
        while (true) {
            System.out.println("        Menu s možnosťami\n" +
                    "        -----------------\n" +
                    "        1. Zadaj novú knihu\n" +
                    "        2. Zobraz všetky knihy\n" +
                    "        3. Zobraz konkrétnu knihu (podľa indexu)\n" +
                    "        4. Vymaž konkrétnu knihu (podľa indexu)\n" +
                    "        5. Zobraz počet všetkých kníh\n" +
                    "        9. Vymaž všetky knihy\n" +
                    "        Koniec = skončí zadávanie novej knihy");

            Scanner sc = new Scanner(System.in); // Inicializacia skenera
            String menuPolozka = sc.nextLine();
            // TODO Vytvorte kod, ktory bude reagovat zatial iba "slovne", teda vypise do konzoly, co ste vybrali. Hint: Pouzijeme funkciu IF, prip. SWITCH, CASE
            // TODO Prestavka do 18.50

            if (menuPolozka.equals("1")) {
                Kniha novaKniha = new Kniha(); // Vytvorime objekt knihy, cize prazdnu knihu

                System.out.println("Vybral som 1");

                System.out.println("Zadaj názov knihy");
                novaKniha.setNazov(sc.nextLine());
                //String nazovKnihy = sc.nextLine(); // Pozadujeme od pouzivatela nazov knihy

                System.out.println("Zadaj meno autora");
                novaKniha.setAutor(sc.nextLine());
                //String autor = sc.nextLine();

                System.out.println("Zadaj rok vydania");
                novaKniha.setRokVydania(sc.nextInt());
                //int rokVydania = sc.nextInt();

                vsetkyKnihy.add(novaKniha);

            } else if (menuPolozka.equals("2")) {
                System.out.println("Vybral som 2");
                // TODO Vypiste vsetky knihy
                // HINT: foreach
                for(Kniha konkretnaKniha:vsetkyKnihy) {
                    //System.out.println("Názov knihy: " + konkretnaKniha.getNazov());
                    //System.out.println("Autor: " + konkretnaKniha.getAutor());
                    //System.out.println("Rok vydania " + konkretnaKniha.getRokVydania());
                    System.out.println(konkretnaKniha);
                }
            } else if (menuPolozka.equalsIgnoreCase("koniec")) {
              break; // Prerusi cyklus while(true)
            } else {
                System.out.println("Nevybral si ani jednu správnu odpoveď");
            }
        }

       /*
        System.out.println("\nTeraz vypisujem odpoveď cez SWITCH, CASE");
        switch (menuPolozka) {
            case "1":
                System.out.println("Vybral som 1");
                System.out.println("Ďakujem za výber");
                break;
            case "2":
                System.out.println("Vybral som 2");
                break;
            default:
                System.out.println("Nevybral si ani jednu správnu odpoveď");
        }

        // Konvertor slovnej znamky na ciselnu
        String znamka = "pat";
        switch (znamka) {
            case "päť":
            case "pat":
                System.out.println("Známka je po konverzii 5");

        }*/


    }
}
