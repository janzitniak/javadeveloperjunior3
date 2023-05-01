package opakovanie.service;

import opakovanie.model.Kniha;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Trieda konciaca v nazve slovom Service riesi aplikacnu logiku konkretnej triedy, v nasom pripade modelu (triedy) Kniha
public class KnihaService {
    private Scanner sc = null;

    // Prazdny konstruktor
    public KnihaService() {
        System.out.println("KONŠKRUTOR");
        // V konstruktore zadefinujeme, resp. naplnime premenne, resp. objekty, cize nieco iniacializujeme
        // SINGLETON
        if (sc == null) {
            sc = new Scanner(System.in);
        }
    }

    public KnihaService(Scanner sc) {
        this.sc = sc;
    }

    public void zobrazMenu() {
        System.out.println("\n        Menu s možnosťami\n" +
                "        -----------------\n" +
                "        1. Zadaj novú knihu\n" +
                "        2. Zobraz všetky knihy\n" +
                "        3. Zobraz konkrétnu knihu (podľa indexu)\n" +
                "        4. Vymaž konkrétnu knihu (podľa indexu)\n" +
                "        5. Zobraz počet všetkých kníh\n" +
                "        6. Vyhľadaj knihu podľa názvu \n" +
                "        9. Vymaž všetky knihy\n" +
                "        Koniec = skončí zadávanie novej knihy");
    }

    public void pridajKnihu(ArrayList <Kniha> vsetkyKnihy) {
        //Scanner sc = new Scanner(System.in);
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
    }

    public void zobrazVsetkyKnihy(ArrayList<Kniha> vsetkyKnihy) {
        System.out.println("Vybral som 2");

        // Testujeme ci je kniznica, teda vsetky, cize ArrayList prazdny a to cez metodu isEmpty()
        if (vsetkyKnihy.isEmpty()) System.out.println("Knižnica je prázdna!");

        //if (vsetkyKnihy == null) System.out.println("Knižnica je prázdna!");

        // TODO Vypiste vsetky knihy
        // HINT: foreach
        for(Kniha konkretnaKniha:vsetkyKnihy) {
            //System.out.println("Názov knihy: " + konkretnaKniha.getNazov());
            //System.out.println("Autor: " + konkretnaKniha.getAutor());
            //System.out.println("Rok vydania " + konkretnaKniha.getRokVydania());
            System.out.println(konkretnaKniha);
        }
    }

    public void zobrazKnihuPodlaIndexu(ArrayList<Kniha> vsetkyKnihy) {
        //Scanner sc = new Scanner(System.in);
        try {
            // Funkcionalita tohto menu je nasledujuca: Zobraz konkrétnu knihu (podľa indexu)\n"
            System.out.println("Zadaj index knihy, ktorú chceš ZOBRAZIŤ (pozn. od 1 po N)");
            int indexKnihy = sc.nextInt(); // Od pouzivatela vyzadujeme index knihy, t.j., preto sc.nextInt()

            // Knihy, resp. index v ArrayList implicitne zacina hodnotou 0, nie 1, preto nizsie pouzijeme syntax indexKnihy-1
            Kniha najdenaKniha = vsetkyKnihy.get(indexKnihy-1); // Tymto zapisom sme ziskali knihu podla jeho indexu
            //System.out.println("Toto sa vykoná??? :-)");
            System.out.println(najdenaKniha); // Tym, ze v triede Kniha mame metodu toString tak to ju mozeme vypisat takto priamo
        } catch (InputMismatchException e) {
            System.out.println("Zadal si písmeno namiesto číselného indexu");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Zadal si neexistujúce číslo indexu");
        } catch (Exception e) {
            System.out.println("Neznáma chyba!");
        }
    }


}
