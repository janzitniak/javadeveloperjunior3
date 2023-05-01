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
import opakovanie.model.Kniha;
import opakovanie.service.KnihaService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Kniznica {
    public static void main(String[] args) {

        //vsetkyKnihy.get(0); // Vrati prvu knihu
        //vsetkyKnihy.remove(0); // Vymaze prvu knihu
        ArrayList<Kniha> vsetkyKnihy = new ArrayList<Kniha>(); // Vytvorime dynamicke pole, teda ArrayList, ktory je novy, teda prazdny
        KnihaService knihaService = new KnihaService(); // Vytvorenie objektu, resp. zavolanie konšruktoru sa urobi iba tam, kde sa vytvara

        while (true) {
            // TODO Zobraz menu z KnihaService

            // Ak chceme volat metody z nejakej inej triedy, tak musime najprv vytvorit objekt, ktory vlozime do premennej
            // cize v tomto pripade sme vytvorili objekt KnihaService (cize napisali sme new KnihaService) a vlozili ho do
            // knihaService
            // Potom mozeme volat metody cez nazov danej premennej a pouzitim bodky (nasledne zobrazi vsetky dostupne metody - aj tie nase naprogramovane)

            knihaService.zobrazMenu();


            Scanner sc = new Scanner(System.in); // Inicializacia skenera
            String menuPolozka = sc.nextLine();

            if (menuPolozka.equals("1")) {
                knihaService.pridajKnihu(vsetkyKnihy);
            } else if (menuPolozka.equals("2")) {
                knihaService.zobrazVsetkyKnihy(vsetkyKnihy);
            } else if (menuPolozka.equals("3")) {
                knihaService.zobrazKnihuPodlaIndexu(vsetkyKnihy);
            } else if (menuPolozka.equals("4")) {
                // 4. Vymaž konkrétnu knihu (podľa indexu)\n"
                try {
                    // Funkcionalita tohto menu je nasledujuca: Zobraz konkrétnu knihu (podľa indexu)\n"
                    System.out.println("Zadaj index knihy, ktorú chceš ZMAZAŤ (pozn. od 1 po N)");
                    int indexKnihy = sc.nextInt(); // Od pouzivatela vyzadujeme index knihy, t.j., preto sc.nextInt()

                    // Knihy, resp. index v ArrayList implicitne zacina hodnotou 0, nie 1, preto nizsie pouzijeme syntax indexKnihy-1
                    Kniha najdenaKniha = vsetkyKnihy.remove(indexKnihy-1); // Tymto zapisom sme ziskali knihu podla jeho indexu
                    //System.out.println("Toto sa vykoná??? :-)");
                    System.out.println("ZMAZALA sa práve táto kniha: ");
                    System.out.println(najdenaKniha); // Tym, ze v triede Kniha mame metodu toString tak to ju mozeme vypisat takto priamo
                } catch (InputMismatchException e) {
                    System.out.println("Zadal si písmeno namiesto číselného indexu");
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Zadal si neexistujúce číslo indexu");
                } catch (Exception e) {
                    System.out.println("Neznáma chyba!");
                }
            }
            else if(menuPolozka.equals("5")) {
                System.out.println("Celkový počet kníh je: " + vsetkyKnihy.size());
            }
            else if(menuPolozka.equals("6")) {
                System.out.println("Zadaj názov hľadanej knihy");
                String hladanyNazovKnihy = sc.nextLine();
                // Pri hladani nazvu konkretnej knihy budeme prechadzat vsetkymi knihami, resp. ich nazvami a cez prikaz (metodu) contains, cize fulltextovo

                boolean jeNajdena = false;
                for (Kniha knihaVZozname: vsetkyKnihy) {
                    if (knihaVZozname.getNazov().contains(hladanyNazovKnihy)) {
                        System.out.println("Kniha zodpovedajúca hľadaniu: \n" + knihaVZozname);
                        jeNajdena = true; // Kniha bola najdena a hovori o tom aj tento priznak, teda premenna jeNajdena
                    }
                }
                if (jeNajdena == false) System.out.println("Nebola nájdená žiadna kniha podľa názvu.");
                // jeNajdena == false
                //    alebo
                // !jeNajdena
                // su rovnake vyrazy, resp. maju vyznam
            }
            else if(menuPolozka.equals("9")) {
                vsetkyKnihy.removeAll(vsetkyKnihy);
                System.out.println("Knihy sú odstránené. Knižnica je prázdna!");
                //Collections.sort(vsetkyKnihy);
            }
            else if (menuPolozka.equalsIgnoreCase("koniec")) {
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
