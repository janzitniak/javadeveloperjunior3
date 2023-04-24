import java.util.ArrayList;
import java.util.List;

public class ArrayListPriklad {
    public static void main(String[] args) {
        // Scenar c.1 - Ukazka ArrayList naplnenim udajov roznych datovych typov, cize cisiel, textov
        ArrayList dynamickePoleRoznychHodnot = new ArrayList();

        // Naplname dynamcke pole, cize ArrayList roznymi hodnotami, ciselnymi ale aj textovymi
        // Poznamka: Do dynamickeho pola budeme vkladaj aj objekty, napr. pre nase vzdelavanie to bude Kniha alebo Zamestnanec
        dynamickePoleRoznychHodnot.add(1);
        dynamickePoleRoznychHodnot.add(2.5);
        dynamickePoleRoznychHodnot.add("Nejaký text");
        dynamickePoleRoznychHodnot.add("3");

        // Vypiseme dynamicke pole, teda ArrayList
        // Prvy scenar bude vypis dynamickeho pola cez klasicky prikaz for
        // Cyklus s pevnym poctom opakovani
        for (int i = 0; i < dynamickePoleRoznychHodnot.size(); i++) {
            System.out.println(dynamickePoleRoznychHodnot.get(i)); //
        }

        // Scenar c.2 - Ukazka ArrayList naplnenim iba textovych udajov, teda s rovnakymi datovymi typmi
        ArrayList<String> dynamickePoleTextov = new ArrayList<String>();
        dynamickePoleTextov.add("Honda");
        dynamickePoleTextov.add("Audi");
        dynamickePoleTextov.add("BMW");
        dynamickePoleTextov.add("Peugeot");

        System.out.println("Výpis obsahu dynamickeho poľa cez for s pevným počtom opakovaní");
        // Vypiseme cez prikaz for, teda cyklom s pevnym poctom opakovani
        for (int i = 0; i < dynamickePoleTextov.size(); i++) {
            System.out.println(dynamickePoleTextov.get(i));
        }

        System.out.println("\nVýpis obsahu dynamického poľa cez for each");
        // Alebo vypiseme obsah dynamickeho pola, teda ArrayList-u cez for each
        for(String konkretnyText:dynamickePoleTextov) {
            System.out.println(konkretnyText);
        }


        // Scenar c. 3 - Ukazka ArrayList naplnenim iba ciselnych udajov, teda s rovnakymi typmi
        // Dynamicke pole s cislami mozeme vytvorit iba pouzitim objektu Integer, Double, Float, Boolean
        ArrayList<Integer> dynamickePoleIbaSCislami = new ArrayList<Integer>();
        dynamickePoleIbaSCislami.add(-1);
        dynamickePoleIbaSCislami.add(5);
        dynamickePoleIbaSCislami.add(9999);

        System.out.println("\nVýpis obsahu dynamického poľa čísiel cez for each");
        for(Integer konkretneCislo:dynamickePoleIbaSCislami) {
            System.out.println(konkretneCislo);
        }
    }
}
