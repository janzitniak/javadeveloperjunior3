package test;

public class DatoveTypyMain {
    public static void main(String[] args) {
        Float desatinneCisloF = 20.45f;
        float desatinneCislof = 19.67f;

        // Prekonvertuj desatinne cislo na text
        // Tip c.1: Dve prazdne uvodzovky reprezentuju prazdny textovy retazec. Pri scitani s cislom dojde ku konverzii cisla na text
        String desatinneCisloFakoString = "" + desatinneCisloF;
        // Tip c.2: Kedze sa jedna o Float, cize objekt, tak mozeme pouzit metodu toString
        String desatinneCisloFAkoString2 = desatinneCisloF.toString();
        // Vypis obsahy danych desatinnych cisiel ako text
        System.out.println("desatinneCisloFakoString " + desatinneCisloFakoString);
        System.out.println("desatinneCisloFAkoString2 " + desatinneCisloFAkoString2);

        // Tip c.1: Konverzia desatinneho cisla ako primitivneho datoveho typu float
        String desatinneCislofAkoString = "" + desatinneCislof;
        // Tip c.2: Konverzia desatinneho cisla  ako primitivneho datoveho typu float
        String desatinneCislofAkoString2 = Float.toString(desatinneCislof);
        // Tip c.3: Konverzia desatinneho cisla  ako primitivneho datoveho typu float
        String desatinneCislofAkoString3 = String.valueOf(desatinneCislof);

        // Vypis obsahy danych desatinnych cisiel ako text
        System.out.println("desatinneCislofAkoString " + desatinneCislofAkoString);
        System.out.println("desatinneCislofAkoString2 " + desatinneCislofAkoString2);


    }
}
