// Zadanie na program:
// Vypíšte do konzoly nasledujúci text:
//
//  Študent Jozef Mrkvička sa narodil 03.04.2000, z maturitnej skúšky má známku 1.5 a od septembra 2022 nastúpi do
//  nového zamestnania ako Java programátor.
//  V Bratislave dňa 18.06.2022



import java.text.SimpleDateFormat;
import java.util.Date;

public class PremenneUloha {
    public static void main(String[] args) {
        String meno = "Jožko Mrkvička";
        String mesiac = "septembra";

        // Zadefinovanie premennej s nazvom datumNarodenia a naplnenim konkretneho datumu. String je datovy typ pre text.
        String datumNarodenia = "03.04.2000";

        // Zadefinovanie premennej s nazvom znamka, ktora na zaciatku obsahuje hodnotu 1.5
        double znamka = 1.5;

        // Prekonvertovali sme znamku na znamku s desatinnou ciarkou. %.2f reprezentuje konverziu desatin. cisla na 2 desatinne miesta
        String znamkaSDesatinnouCiarkou = String.format("%.1f", znamka); // %.1f reprezentuje desatin. cislo s 1 desatinnym miestom
        int rok = 2022;
        // String aktualnyDatum = "18.06.2022";


        Date aktualnyDatum = new Date(); // Vytvorili sme premennu aktualnyDatum reprezentujuci aktualny datum, ale v anglickom formate
        SimpleDateFormat formatDatumu = new SimpleDateFormat("dd.MM.yyyy"); // A my ten anglicky format musime preklopit na slovensky

        System.out.println("Študent " + meno + " sa narodil " + datumNarodenia + ", z maturitnej skúšky má známku " + znamkaSDesatinnouCiarkou + " a od " +
                mesiac + " " + rok + " nastúpi do nového zamestnania ako Java programátor. \n" +
                "\tV Bratislave dňa " + formatDatumu.format(aktualnyDatum));


    }

}
