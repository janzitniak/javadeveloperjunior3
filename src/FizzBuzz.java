/*
Fizz buzz je skupinová slovná hra pre deti, ktorej účelom je naučiť ich delenie čísel. Hráči postupne vymenúvajú čísla,
pričom nahrádzajú každé číslo deliteľné tromi slovom "fizz" a každé číslo deliteľné piatimi slovom "buzz".

Hra
Hráči zvyčajne sedia v kruhu. Prvý hráč povie číslo "1" a každý ďalší hráč povie číslo o jedno vyššie od
predošlého. Akékoľvek číslo deliteľné tromi musí hráč nahradiť slovom fizz a akékoľvek číslo deliteľné piatimi
slovom buzz. Čísla deliteľné oboma sa nahrádzajú slovami fizz buzz. Hráč, ktorý zaváha alebo urobí chybu je vylúčený z hry.

Typická hra fizz buzz môže začínať takto:

1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23,
Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz, …

Hint: % cize modulo je vypoctovy operator, ktory sa pouziva na vypocet zvysku po deleni
Hint2: || reprezentuje OR (ALEBO), to znamena, ze moze platit jedna podmienka alebo druha
Hint2, pokracovanie: && reprezentuje AND (A) to znamena, ze musi platit jedna podmienka a zaroven druha

Bonusová úloha: Program by mohol reagovať na voľne zadané čísla používateľom z konzoly, napr. v tvare 3 8 12 45 98
Na základe zadanej množiny vstupných hodnôt vypíše zodpovedajúce slová podľa zadania vyššie.
*/

//TODO Prestavka do 19:30 +5 min.

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        // TODO urobit konzolovy vstup, v ktorom by pouzivatel zadal cisla v tvare napr. 3 8 12 45 98
        Scanner scn = new Scanner(System.in); // Inicializacia skeneru, resp. vstupu cez konzolu
        System.out.println("Zadaj čísla napr. v tvare 3 8 12 45 98");
        String vstupneHodnoty = scn.nextLine(); // Priamy pouzivatelsky vstup, konzola ocakava zadanie hodnot
        System.out.println("Zadané vstupné hodnoty sú: " + vstupneHodnoty);

        // TODO ako rozdelit jednotlive hodnoty zo vstupneHodnoty, aby algoritmus vedel ich jednotlivo vyhodnotit
        String [] poleHodnot = vstupneHodnoty.split(" "); // Vytvorili sme pole textovych hodnot pouzitim prikazu split
        // array je pole
        //System.out.println("Pole individualnych zadanych hodnot je: " + poleHodnot);

        System.out.println("Vypisujem hodnoty individualne, teda tie, ktore su uz rozdelene:");
        // Cyklus s pevnym poctom opakovani, v tomto pripade prechadzame kazdym prvkom pola poleHodnot
        for (int i = 0; i < poleHodnot.length; i++) {
            String individualnaHodnota = poleHodnot[i];
            int hodnota = Integer.parseInt(individualnaHodnota); // Prekonvertovali sme cislo ako na text na realne cele cislo, teda int

            // TODO zjednodusit podmienku (resp. vyrazy) nizsie
            // if (hodnota % 3 == 0 && hodnota % 5 == 0) {
            if (hodnota % 15 == 0) {
                System.out.print("Fizz Buzz");
            } else if (hodnota % 3 == 0) {
                System.out.print("Fizz");
            } else if (hodnota % 5 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(hodnota);
            }
            System.out.print(" ");

        }
    }
}
