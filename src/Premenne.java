public class Premenne {
    public static void main(String[] args) {
        String meno = "Juraj";
        int celeCislo = 123;
        float desatinneCislo = 234.56f;
        double desatinneCisloAkoDouble = 1.23;
        char znak = '9'; // AltGr p        vlozi znak '
        boolean jeDnesStreda = true; // true znamena, ze je to pravda (ano), false je neprevda
        int celeCislo2;
        celeCislo2 = 456;
        int celeCislo3 = 789;
        celeCislo3 = 0; // Naplnili premennu celeCislo3 hodnotou 0, zmenili sme povodnu hodnotu 789

        double cenaBezDPH = 1000.0;
        double cenaSDPH = 0.0;

        cenaSDPH = cenaBezDPH * 1.20; // Premmenu cenaBezDPH sme vynasobili 1,20 a vysledok sme umiestnili spat do premennej cenaSDPH
        System.out.println("Cena bez DPH: " + cenaBezDPH);
        System.out.println("Cena s DPH: " + cenaSDPH);

        System.out.println("Meno: " + meno);
        System.out.println("Celé číslo: " + celeCislo);
        System.out.println("Desatinné číslo: " + desatinneCislo);
        System.out.println("Desatinné číslo ako double: " + desatinneCisloAkoDouble);
        System.out.println("Vypísaný znak: " + znak);
        System.out.println("Je dnes streda? " + jeDnesStreda);
        System.out.println("Celé číslo 2: " + celeCislo2);
        System.out.println("Celé číslo 3: " + celeCislo3);

        System.out.println("Vysvetľuje to nasledovná citácia:");
        System.out.println("€ @ >#&€^˘˛˛°` \"Toto je citácia v uvodzovkách\" ");

        // \n vlozi prazdny riadok a musi vpisane v ramci textu, resp. v uvodzovkach
        // mozeme pouzit \t  reprezentuje tabulator, teda odsadenie
        // To iste vyssie mozeme napisat nasledujuco
        System.out.println("Vysvetľuje to nasledovná citácia:\n€ @ >#&€^˘˛˛°` \"Toto je citácia v uvodzovkách\" ");
        System.out.println("\tTento text je odsadený");
        System.out.println("\t Tento text je odsadený");
        System.out.println("Nejaký \btext");
        System.out.println("Vypísanie lomky, musíme použiť 2 lomky \\");

        System.out.println("\f uvodzovky spodne \f ");

        // Ako naformatovat cislo v SK formate na 2 desatinne miesta, pouzijeme %.2f
        System.out.printf("Desatinné číslo naformátované ako desatinná čiarka %.2f", desatinneCislo);


    }

}
