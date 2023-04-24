package ulohy;

import java.util.ArrayList;

public class DatabazaZamestnancov {
    public static void main(String[] args) {
        // Vytvorime zamestnanca cez prikaz new a nazov triedy, teda objekt zamestnanec1 alebo synonymum pre objekt je instancia triedy
        Zamestnanec zamestnanec1 = new Zamestnanec();
        zamestnanec1.meno = "Ján";
        zamestnanec1.priezvisko = "Žitniak";
        zamestnanec1.pohlavie = 'm'; // Apostrof vlozime cez kombinaciu klaves AltGr p
        zamestnanec1.rok = 2000;

        // Chceme vypisat osobne udaje zamestnanca, tak to urobime presne rovnako ako sme do neho vpisali
        System.out.println(zamestnanec1.meno);
        System.out.println(zamestnanec1.priezvisko);
        System.out.println(zamestnanec1.pohlavie);
        System.out.println(zamestnanec1.rok);

        // Chceme vytvorit dalsieho zamestnanca, cize zamestnanca c.2
        Zamestnanec zamestnanec2 = new Zamestnanec();
        zamestnanec2.meno = "Jožko";
        zamestnanec2.priezvisko = "Mrkvička";
        zamestnanec2.pohlavie = 'm';
        zamestnanec2.rok = 2010;

        // Chceme vypisat osobne udaje zamestnanca, tak to urobime presne rovnako ako sme do neho vpisali
        System.out.println(zamestnanec2.meno);
        System.out.println(zamestnanec2.priezvisko);
        System.out.println(zamestnanec2.pohlavie);
        System.out.println(zamestnanec2.rok);


        // Chceme ulozit zamestnancov do ArrayListu
        ArrayList<Zamestnanec> dynamickePoleZamestnancov = new ArrayList<Zamestnanec>();
        dynamickePoleZamestnancov.add(zamestnanec1);
        dynamickePoleZamestnancov.add(zamestnanec2);

        // Ako ich vypisat
        // HINT: Pouzijeme foreach
        System.out.println("\nVypisujem zamestnancov cez for each");
        System.out.println("-----------------------------------");
        for(Zamestnanec konkretnyZamestnanec:dynamickePoleZamestnancov) {
            System.out.println(konkretnyZamestnanec.meno);
            System.out.println(konkretnyZamestnanec.priezvisko);
            System.out.println(konkretnyZamestnanec.rok);
            System.out.println(konkretnyZamestnanec.pohlavie);
        }
    }
}
