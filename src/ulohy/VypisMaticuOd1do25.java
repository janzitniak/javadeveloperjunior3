/*
ZADANIE:
Úloha na opakovanie: Vypíš maticu s údajmi od 1 do 25
        Vytvorte (vypíšte) maticu údajov do konzoly, ktoré budú vyzerať nasledovne:
        1 2 3 4 5
        6 7 8 9 10
        11 12 13 14 15
        16 17 18 19 20
        21 22 23 24 25
*/
package ulohy;

public class VypisMaticuOd1do25 {
    public static void main(String[] args) {
        // Vypoctove operatory porovnania v ramci IF su nasledovne:
        // >    vacsie
        // <    mensie
        // >=   vacsie a rovna sa
        // <=   mensie a rovna sa
        // ==   rovna sa

        final int MAX = 125; // final je klucove slova pre vytvorenie konstanty, hodnota premennej sa neda zmenit!

        // Riesenie c.1:
        for (int i = 1; i <= MAX; i++) {
            // Ked i nadobudne hodnotu 7 a viac, tak je v nasom pripade hned splnena prva podmienka
            if (i == 6 || i == 11 || i == 16 || i == 21) {
                System.out.println(); // novy riadok aj pri 7-cke, aj pri 8-cke
            }
            System.out.print(i + " ");
        }

        System.out.println("\n\n"); // Vlozi 2 prazdne riadky prostrednictvom \n

        // Riesenie c.2:
        for (int i = 1; i <= MAX; i++) {
            System.out.print(i + " ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }

    }
}
// TODO Prestavka do 19:10