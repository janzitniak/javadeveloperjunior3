/*
ZADANIE:
Vytvorte prostredníctvom vstupu z konzoly rozhodovací test, ktorý vypíše známku A, B alebo C podľa týchto kritérií:
        Ak je percento nad 90, tak vypíše známku A
        Ak je percento nad 75, tak vypíše známku B
        Ak je percento nad 65, tak vypíše známku C
        Použite metódu pre rozhodovanie.
*/

public class PriradenieZnamky {
    public static void main(String[] args) {
        int percento = 85;
        boolean jeClovek = false;
        boolean jeRobot = true;

        if (jeClovek) {
            System.out.println("Áno je človek");
        } else {
            System.out.println("Nie je človek");
        }

        // ! negujem
        if (!jeRobot) {
            System.out.println("Nie je robot");
        } else {
            System.out.println("Áno je robot");
        }


        // >    <
        // >=   <=
        // ==   equals
        // !=   nerovna sa

        if (percento > 90) {
            // Akonahle chcem pouzit viac prikazov v IF, tak musim ich dat do zlozenych zatvoriek, cize {}
            System.out.println("Máš známku A");
            System.out.println("Hodnotenie A oznámime aj e-mailom");
        } else if (percento > 75) {
            System.out.println("Máš známku B");
        } else if (percento > 65) {
            System.out.println("Máš známku C");
        } else {
            System.out.println("Prepadol si");
        }




    }
}
